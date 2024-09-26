package br.edu.facisa.atal.system;

import br.edu.facisa.atal.data.load.LoadBooksBatch;
import br.edu.facisa.atal.data.structure.LivrosSequencial;
import br.edu.facisa.atal.models.Livro;
import br.edu.facisa.atal.search.BinarySearch;
import br.edu.facisa.atal.search.Search;
import br.edu.facisa.atal.sort.QuickSort;
import br.edu.facisa.atal.sort.Sort;

import java.util.Scanner;

public class LibraryThree {
    LivrosSequencial livros;
    Sort sort;
    Search search;

    public LibraryThree(){
        this.livros = new LivrosSequencial();
        LoadBooksBatch.loadTenBooks(this.livros);
        this.sort = new QuickSort();
        this.search = new BinarySearch();
    }

    public void listarLivros() {
        livros.printArray();
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
        this.livros.add(livro);
        System.out.println("Livro cadastrado com sucesso " + livro);
    }

    public void sort(Integer chooseSort) {
        if (chooseSort == 1){
           this.livros = sort.sortByAuthor(this.livros);
           this.listarLivros();
        }
        else {
            this.livros =  sort.sortByTittle(this.livros);
            this.listarLivros();
        }
    }

    public void findByName(String bookName) {
        this.livros = sort.sortByTittle(livros);
        Livro livro = search.findByBookName(this.livros,bookName,0,this.livros.size()-1);
        if (livro == null) {
            System.out.println("Livro não encontrado");
        }
        else {
            System.out.println(livro);
        }
    }
}
