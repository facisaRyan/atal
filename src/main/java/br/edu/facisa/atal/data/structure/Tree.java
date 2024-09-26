package br.edu.facisa.atal.data.structure;


import br.edu.facisa.atal.models.BookNode;
import br.edu.facisa.atal.util.Util;


public class Tree {

    private BookNode head;


    public void add (BookNode node, BookNode value){
        if (head == null){
            head = value;
            return;
        }
        if (Util.isBiggerThan(value.getBook().getTittle(),node.getBook().getTittle())){
            insertRight (node, value);
        }
        else {
            insertLeft(node,value);
        }
    }
    public void posOrder(BookNode node){
        if (node == null){
            return;
        }
        posOrder(node.getLeft());
        posOrder(node.getRight());
        System.out.print(node.getBook().getTittle() + "|");
    }
    public void preOrder(BookNode node){
        if (node == null){
            return;
        }
        System.out.print(node.getBook().getTittle() + "|");
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }
    public void inOrder(BookNode node){
        if (node == null){
            return;
        }
        inOrder(node.getLeft());
        System.out.print(node.getBook().getTittle() + "|");
        inOrder(node.getRight());
    }
    public void searchByTittle (String tittle){}
    public void seatchByAuthor (String author){}

    public BookNode getHead() {
        return head;
    }

    public void setHead(BookNode head) {
        this.head = head;
    }

    private void insertRight (BookNode node, BookNode value){
        if (node.getRight() == null){
            node.setRight(value);
        }
        else {
            add(node.getRight(), value);
        }
    }
    private void insertLeft (BookNode node, BookNode value){
        if (node.getLeft() == null){
            node.setLeft(value);
        }
        else {
            add(node.getLeft(), value);
        }
    }
}
