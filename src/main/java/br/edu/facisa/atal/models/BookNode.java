package br.edu.facisa.atal.models;

import org.w3c.dom.Node;

public class BookNode {

    private Livro book;
    private BookNode left;
    private BookNode right;

    public BookNode (Livro book){
        this.book = book;
    }

    public Livro getBook() {
        return book;
    }

    public void setBook(Livro book) {
        this.book = book;
    }

    public BookNode getLeft() {
        return left;
    }

    public void setLeft(BookNode left) {
        this.left = left;
    }

    public BookNode getRight() {
        return right;
    }

    public void setRight(BookNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "BookNode{" +
                "book=" + book +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
