package br.edu.facisa.atal.search;

import br.edu.facisa.atal.data.structure.LivrosSequencial;
import br.edu.facisa.atal.models.Livro;
import br.edu.facisa.atal.util.Util;

public class BinarySearch implements  Search {


    @Override
    public Livro findByBookName(LivrosSequencial livros, String bookName, int startLeft, int startRight) {
        Livro bookNode = null;
        if (startRight >= startLeft){
            int index = startLeft + (startRight - startLeft) / 2;
            bookNode = livros.get(index);
            if (bookNode.getTittle().toLowerCase().equals(bookName)){
                return bookNode;
            }

            if(Util.isBiggerThan(bookNode.getTittle().toLowerCase(), bookName)){
                // logica para buscar atra não funciona
                return findByBookName(livros,  bookName, startLeft, index - 1);

            } else {

                return findByBookName(livros,  bookName, index + 1 , startRight);
            }
        }
        return bookNode;
    }


}
