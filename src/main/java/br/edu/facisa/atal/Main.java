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

        BookNode bookNode = new BookNode(new Livro(1l,"a","F"));
        BookNode bookNode2 = new BookNode(new Livro(2l,"b","B"));
        BookNode bookNode3 = new BookNode(new Livro(3l,"b","G"));
        BookNode bookNode4 = new BookNode(new Livro(4l,"b","A"));
        BookNode bookNode5 = new BookNode(new Livro(5l,"b","D"));
        BookNode bookNode6 = new BookNode(new Livro(6l,"b","C"));
        BookNode bookNode7 = new BookNode(new Livro(7l,"b","E"));
        BookNode bookNode8 = new BookNode(new Livro(8l,"b","I"));
        BookNode bookNode9 = new BookNode(new Livro(9l,"b","H"));
        Tree tree = new Tree();
        tree.add(tree.getHead(),bookNode);

        tree.add(tree.getHead(),bookNode2);
        tree.add(tree.getHead(),bookNode4);

        tree.add(tree.getHead(),bookNode5);
        tree.add(tree.getHead(),bookNode6);
        tree.add(tree.getHead(),bookNode7);
        tree.add(tree.getHead(),bookNode8);

        tree.add(tree.getHead(),bookNode9);
        tree.add(tree.getHead(),bookNode3);
        tree.preOrder(tree.getHead());
        System.out.println("");
        tree.posOrder(tree.getHead());
        System.out.println("");
        tree.inOrder(tree.getHead());
    }
}