package br.edu.facisa.atal.data.load;

import br.edu.facisa.atal.data.structure.LivrosSequencial;
import br.edu.facisa.atal.data.structure.Tree;
import br.edu.facisa.atal.models.BookNode;
import br.edu.facisa.atal.models.Livro;

public class LoadBooksBatch {


    public static void loadTenBooks (LivrosSequencial livros){
        Livro harryPotter = new Livro(1l,"J.K.Rowling","Harry potter e a pedra filosofal");
        Livro percyJackson = new Livro(2l,"Rick riordan","Percy Jackson e o ladrão de raios");
        Livro duna = new Livro(3l,"Frank Herbet","Duna");
        Livro hobbit = new Livro(4l,"J.R.R Tolkien","O Hobbit");
        Livro cleanCode = new Livro(5l,"Robert C. Martin","O código limpo");
        Livro watchman = new Livro(6l,"Alan Moore","Watchman");
        Livro fundacao = new Livro(7l,"Isaac Asimov","A fundação");
        Livro lordOfTheRings = new Livro(8l,"J.R.R Tolkien","Senhor do aneis: O retorno do rei");
        Livro sherlockHolmes = new Livro(9l,"Arthur conan Doyle ","Sherlock Holmes - Um estudo em vermelho");
        Livro narnia = new Livro(10l,"C.S Lewis","As Crônicas de Nárnia");
        livros.add(harryPotter);
        livros.add(percyJackson);
        livros.add(duna);
        livros.add(hobbit);
        livros.add(cleanCode);
        livros.add(watchman);
        livros.add(fundacao);
        livros.add(lordOfTheRings);
        livros.add(sherlockHolmes);
        livros.add(narnia);
    }

    public static void loadTenNodeBooks (Tree tree){
        Livro harryPotter = new Livro(1l,"J.K.Rowling","Harry potter e a pedra filosofal");
        Livro percyJackson = new Livro(2l,"Rick riordan","Percy Jackson e o ladrão de raios");
        Livro duna = new Livro(3l,"Frank Herbet","Duna");
        Livro hobbit = new Livro(4l,"J.R.R Tolkien","O Hobbit");
        Livro cleanCode = new Livro(5l,"Robert C. Martin","O código limpo");
        Livro watchman = new Livro(6l,"Alan Moore","Watchman");
        Livro fundacao = new Livro(7l,"Isaac Asimov","A fundação");
        Livro lordOfTheRings = new Livro(8l,"J.R.R Tolkien","Senhor do aneis: O retorno do rei");
        Livro sherlockHolmes = new Livro(9l,"Arthur conan Doyle ","Sherlock Holmes - Um estudo em vermelho");
        Livro narnia = new Livro(10l,"C.S Lewis","As Crônicas de Nárnia");
        tree.add(tree.getHead(),new BookNode(harryPotter));
        tree.add(tree.getHead(),new BookNode(percyJackson));
        tree.add(tree.getHead(),new BookNode(duna));
        tree.add(tree.getHead(),new BookNode(hobbit));
        tree.add(tree.getHead(),new BookNode(cleanCode));
        tree.add(tree.getHead(),new BookNode(watchman));
        tree.add(tree.getHead(),new BookNode(fundacao));
        tree.add(tree.getHead(),new BookNode(lordOfTheRings));
        tree.add(tree.getHead(),new BookNode(sherlockHolmes));
        tree.add(tree.getHead(),new BookNode(narnia));
    }
}
