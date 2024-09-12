package br.edu.facisa.atal.sort;

import br.edu.facisa.atal.data.structure.LivrosSequencial;

public interface Sort {

       LivrosSequencial sortByTittle(LivrosSequencial livros);
       LivrosSequencial sortByAuthor(LivrosSequencial livros);
}
