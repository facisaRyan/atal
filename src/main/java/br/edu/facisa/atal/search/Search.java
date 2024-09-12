package br.edu.facisa.atal.search;

import br.edu.facisa.atal.data.structure.LivrosSequencial;
import br.edu.facisa.atal.models.Livro;

public interface Search {

    Livro findByBookName (LivrosSequencial livros,String name, int startLeft, int startRight);
}
