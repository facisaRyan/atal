package br.edu.facisa.atal.models;

import java.util.Objects;

public class Livro {

    private Long isbn;
    private String author;
    private String tittle;

    public Livro() {}

    public Livro(Long isbn, String author, String tittle) {
        this.isbn = isbn;
        this.author = author;
        this.tittle = tittle;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "ISBN=" + isbn +
                ", Autor='" + author + '\'' +
                ", Titulo='" + tittle + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(isbn, livro.isbn) && Objects.equals(author, livro.author) && Objects.equals(tittle, livro.tittle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, author, tittle);
    }
}
