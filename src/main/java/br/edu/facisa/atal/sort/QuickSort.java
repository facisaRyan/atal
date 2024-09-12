package br.edu.facisa.atal.sort;

import br.edu.facisa.atal.data.structure.LivrosSequencial;
import br.edu.facisa.atal.models.Livro;
import br.edu.facisa.atal.util.Util;

public class QuickSort implements Sort {

    @Override
    public  LivrosSequencial sortByTittle (LivrosSequencial livros){
        if ( livros.size() <= 1){
            return livros;
        }

       LivrosSequencial leftBooks = new LivrosSequencial();
       LivrosSequencial rightBooks = new LivrosSequencial();
       Livro pivo = livros.get(0);

       for (int i = 1; i < livros.size(); i ++){

           if(Util.isBiggerThan(pivo.getTittle().toLowerCase(),livros.get(i).getTittle().toLowerCase())){

              leftBooks.add(livros.get(i));
           }
           else {
               rightBooks.add(livros.get(i));
           }
       }
       LivrosSequencial esquerdoOrdenado =  sortByTittle(leftBooks);
       esquerdoOrdenado.add(pivo);
       LivrosSequencial direitoOrdenado = sortByTittle(rightBooks);
       return concatenarArrays(esquerdoOrdenado,direitoOrdenado);
    }



    public  LivrosSequencial  sortByAuthor(LivrosSequencial livros) {
        if ( livros.size() <= 1){
            return livros;
        }

        LivrosSequencial leftBooks = new LivrosSequencial();
        LivrosSequencial rightBooks = new LivrosSequencial();
        Livro pivo = livros.get(0);

        for (int i = 1; i < livros.size(); i ++){

            if(Util.isBiggerThan(pivo.getAuthor().toLowerCase(),livros.get(i).getAuthor().toLowerCase())){

                leftBooks.add(livros.get(i));
            }
            else {
                rightBooks.add(livros.get(i));
            }
        }
        LivrosSequencial esquerdoOrdenado =  sortByAuthor(leftBooks);
        esquerdoOrdenado.add(pivo);
        LivrosSequencial direitoOrdenado = sortByAuthor(rightBooks);
        return concatenarArrays(esquerdoOrdenado,direitoOrdenado);
    }


    private  LivrosSequencial concatenarArrays (LivrosSequencial array1, LivrosSequencial array2){

        for (int i = 0; i<array2.size(); i++) {
            array1.add(array2.get(i));
        }
        return array1;
    }

}
