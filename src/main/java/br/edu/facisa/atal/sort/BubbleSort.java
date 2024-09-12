package br.edu.facisa.atal.sort;

import br.edu.facisa.atal.data.structure.LivrosSequencial;
import br.edu.facisa.atal.models.Livro;
import br.edu.facisa.atal.util.Util;

public class BubbleSort implements Sort{



    public LivrosSequencial sortByTittle (LivrosSequencial livros){

        for(int i = 0; i< livros.size() - 1; i ++){
            for(int j = 0; j < livros.size() - 1 - i; j++){
                if (Util.isBiggerThan(livros.get(j).getTittle().toLowerCase(),livros.get(j+1).getTittle().toLowerCase())){
                    Livro temp = livros.get(j);
                    livros.set(j, livros.get(j+1));
                    livros.set(j+1,temp);

                }
            }
        }
        return livros;
    }

    public LivrosSequencial sortByAuthor(LivrosSequencial livros) {

        for(int i = 0; i< livros.size() - 1; i ++){
            for(int j = 0; j < livros.size() - 1 - i; j++){
                if (Util.isBiggerThan(livros.get(j).getAuthor().toLowerCase(),livros.get(j+1).getAuthor().toLowerCase())){
                    Livro temp = livros.get(j);
                    livros.set(j, livros.get(j+1));
                    livros.set(j+1,temp);
                }
            }
        }
        return livros;
    }




}
