package br.edu.facisa.atal;


import br.edu.facisa.atal.data.structure.Tree;
import br.edu.facisa.atal.display.Menu;
import br.edu.facisa.atal.models.BookNode;
import br.edu.facisa.atal.models.Livro;
import br.edu.facisa.atal.system.LibraryThree;


public class Main {
    public static void main(String[] args) {
//        Menu menu = new Menu();
//        try {
//            menu.start();
//        } catch (Exception e){
//            System.out.println("-----------------------------------------------");
//            System.out.println("| " + e.getMessage() + " |");
//            menu.start();
//        }

        BookNode bookNode = new BookNode(new Livro(1l,"a","bacaxi"));
        BookNode bookNode2 = new BookNode(new Livro(2l,"b","abacate"));
        BookNode bookNode3 = new BookNode(new Livro(3l,"b","coquinha"));
        BookNode bookNode4 = new BookNode(new Livro(4l,"b","dadinho"));
        Tree tree = new Tree();
        tree.add(tree.getHead(),bookNode);
        tree.add(tree.getHead(),bookNode2);
        tree.add(tree.getHead(),bookNode3);
        tree.add(tree.getHead(),bookNode4);
    }
}