package br.edu.facisa.atal.data.structure;

import br.edu.facisa.atal.constants.DataConstants;
import br.edu.facisa.atal.exceptions.ArrayNotBigEnoughException;
import br.edu.facisa.atal.models.Livro;
import br.edu.facisa.atal.sort.QuickSort;
import br.edu.facisa.atal.sort.Sort;
import br.edu.facisa.atal.util.Util;

public class LivrosSequencial {

    private Livro[] livros;
    private int inseridos;
    private Sort sort;


    public LivrosSequencial() {
        livros = initializeEmptyArray();
        this.sort = new QuickSort();
    }

    public int size() {
        return inseridos;
    }

    public void clear() {
        this.livros = initializeEmptyArray();
    }

    public Livro[] initializeEmptyArray() {
        return new Livro[DataConstants.ARRAY_SIZE];
    }

    public void add(Livro livro) {
        if (isFull()) {
            increseArray();
        }
        this.livros[inseridos] = livro;
        inseridos++;
    }

    public Livro get(int index) {
        if (!isIndexValid(index)) {
            throw new ArrayIndexOutOfBoundsException("Index invalido");
        }
        return this.livros[index];
    }

    private boolean isIndexValid(int index) {
        return index >= 0 || index < this.livros.length;
    }

    public boolean isFull() {
        return inseridos == livros.length;
    }

    public void increseArray() {
        Livro[] newBookArray = new Livro[getNewSize()];
        try {
            copyDataToArray(newBookArray);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        this.livros = newBookArray;
    }

    public int getNewSize() {
        int oldCapacity = livros.length;
        return (oldCapacity * 3) / 2 + 1;
    }

    public Livro[] copyDataToArray(Livro[] emptyArray) throws ArrayNotBigEnoughException {
        if (emptyArray.length < this.livros.length) {
            throw new ArrayNotBigEnoughException("Array é pequeno demais para transferir os dados");
        }
        for (int i = 0; i < this.livros.length; i++) {
            emptyArray[i] = this.livros[i];
        }

        return emptyArray;
    }

    public void printArray() {
        for (int i = 0; i < this.inseridos; i++) {
            if (this.livros[i] == null) {
                break;
            }
            System.out.println(this.livros[i]);

        }
        System.out.println("----------------------------------------------------");
    }

    public boolean isEmpty() {
        return inseridos == 0;
    }

    public void set(int index, Livro livro) {
        if (!isIndexValid(index)) {
            throw new ArrayIndexOutOfBoundsException("Index invalido");
        }
        this.livros[index] = livro;
    }

    private Livro[] sortedArray() {
        return this.sort.sortByTittle(this).livros;

    }

    public void remove(Livro livro) {
        int index = indexOf(livro);
        remove(index);
    }

    public void remove(int index) {
        if (index < 0 || index > size()) {
            throw new ArrayIndexOutOfBoundsException("Posição invalida");
        }
        this.livros[index] = null;

        for (int i = index; i < size(); i++) {
            if (this.isFull() && i + 1 == size()) {
                livros[i] = null;
            } else {
                livros[i] = livros[i + 1];
            }
        }
        inseridos--;
    }

    public int indexOf(Livro livro) {
        for (int i = 0; i < size(); i++) {
            if (livro.equals(livros[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(Livro livro) {
        return findByBook(sortedArray(), livro, 0, this.size() - 1) != null;
    }


    private Livro findByBook(Livro[] livros, Livro livro, int startLeft, int startRight) {
        Livro bookNode = null;
        if (startRight >= startLeft) {
            int index = startLeft + (startRight - startLeft) / 2;
            bookNode = livros[index];
            if (bookNode.equals(livro)) {
                return bookNode;
            }

            if (Util.isBiggerThan(bookNode.getTittle().toLowerCase(), livro.getTittle().toLowerCase())) {
                // logica para buscar atra não funciona
                return findByBook(livros, livro, startLeft, index - 1);

            } else {

                return findByBook(livros, livro, index + 1, startRight);
            }
        }
        return bookNode;
    }

    
    public void add (int index, Livro livro){
        //TODO inserir passando o index
    }

}
