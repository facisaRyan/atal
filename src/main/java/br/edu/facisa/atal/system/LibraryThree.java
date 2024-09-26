package br.edu.facisa.atal.system;

import br.edu.facisa.atal.data.load.LoadBooksBatch;
import br.edu.facisa.atal.data.structure.LivrosSequencial;
import br.edu.facisa.atal.data.structure.Tree;
import br.edu.facisa.atal.models.BookNode;
import br.edu.facisa.atal.models.Livro;
import br.edu.facisa.atal.search.BinarySearch;
import br.edu.facisa.atal.search.Search;
import br.edu.facisa.atal.sort.QuickSort;
import br.edu.facisa.atal.sort.Sort;

import java.util.Scanner;

public class LibraryThree {
    Tree livros;


    public LibraryThree(){
        this.livros = new Tree();
        LoadBooksBatch.loadTenNodeBooks(this.livros);
    }

    public void listarLivros() {
        livros.preOrder(livros.getHead());
    }

    public void cadastrarLivro() {
        System.out.println("----------------------------------------");
        System.out.println("| Bem vindo ao cadastro de livros |");
        Scanner scannerCadastro = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.println("Digite ISBN do livro:");
        Long isbn = Long.parseLong(scannerCadastro.nextLine()) ;
        System.out.println("----------------------------------------");
        System.out.println("Digite o nome do livro:");
        String bookName = scannerCadastro.nextLine();
        System.out.println("----------------------------------------");
        System.out.println("Digite o nome do autor:");
        String bookAuthor = scannerCadastro.nextLine();
        System.out.println("----------------------------------------");
        Livro livro = new  Livro(isbn,bookAuthor,bookName);
        this.livros.add(this.livros.getHead(), new BookNode(livro));
        System.out.println("Livro cadastrado com sucesso " + livro);
    }

    public void sort() {
       this.livros.inOrder(this.livros.getHead());
    }

    public void findByName(String bookName) {
        Livro livro = livros.searchByTittle(this.livros.getHead(),bookName);
        if (livro == null) {
            System.out.println("Livro não encontrado");
        }
        else {
            System.out.println(livro);
        }
    }
}
