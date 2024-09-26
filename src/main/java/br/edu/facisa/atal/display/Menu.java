package br.edu.facisa.atal.display;

import br.edu.facisa.atal.system.Library;

import java.util.Scanner;

public class Menu {

    Library library;

    public Menu (){
        this.library = new Library();
    }




    private void printMainMenu (){
        System.out.println("----------------------Biblioteca-------------------------");
        System.out.println("1 - Listar livros");
        System.out.println("2 - Adicionar um livro ");
        System.out.println("3 - Ordenar livros");
        System.out.println("4 - buscar livros");
        System.out.println("0 - encerrar programa");
    }


    @SuppressWarnings("resource")
    public void start() {
        while (true) {

            printMainMenu();


            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Escolha sua ação:");
            String acaoUsuarioString = scanner2.next();
            Boolean isNumeric = acaoUsuarioString.matches("-?\\d+");
            if (!isNumeric) {
                throw new IllegalArgumentException("Ação invalida");
            }
            try {
                Integer acaoUsuario = Integer.parseInt(acaoUsuarioString);
                chamarAcao(acaoUsuario);
            } catch (Exception e) {
                System.out.println("-----------------------------------------------");
                System.out.println("| " + e.getMessage() + " |");

            }


        }

    }

    private void chamarAcao(Integer acaoUsuario) {


        if (isInvalidAction(5,acaoUsuario)) {
            throw new IllegalArgumentException("Ação invalida");
        }

        switch (acaoUsuario) {

            case 1:
                library.listarLivros();
                break;
            case 2:
                library.cadastrarLivro();
                break;

            case 3:
               Integer chooseSort = chooseSort();
               library.sort(chooseSort);
                break;

            case 4:
               String bookTittle =  typeBookTittle();
                library.findByName(bookTittle);
                break;

            case 0:
                // finalizar programa
                System.out.println("Fim do programa, obrigado por utilizar nosso sistema !");
                System.exit(0);
                break;

        }


    }

    public String typeBookTittle(){
        System.out.println("----------------------------------------");
        System.out.println("| Digite o nome do livro que você deseja procurar |");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().toLowerCase();
    }

    private int chooseSort(){
        System.out.println("----------------------------------------");
        System.out.println("| Escolha o tipo de ordenação |");
        System.out.println("1 - Ordenar pelo autor");
        System.out.println("2 - Ordenar pelo nome do livro ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha sua ação:");
        String acaoUsuarioString = scanner.next();
        Boolean isNumeric = acaoUsuarioString.matches("-?\\d+");
        if (!isNumeric) {
            throw new IllegalArgumentException("Ação invalida");
        }
        Integer choosedSort = Integer.parseInt(acaoUsuarioString);
        if (isInvalidAction(2,choosedSort)){
            throw new IllegalArgumentException("Ação invalida");
        }

        return choosedSort;
    }

    private boolean isInvalidAction (int numOfAction, int action) {
        return action > numOfAction || action < 0;
    }
}
