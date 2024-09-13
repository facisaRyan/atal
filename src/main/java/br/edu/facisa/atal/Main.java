package br.edu.facisa.atal;


import br.edu.facisa.atal.display.Menu;



public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        try {
            menu.start();
        } catch (Exception e){
            System.out.println("-----------------------------------------------");
            System.out.println("| " + e.getMessage() + " |");
            menu.start();
        }
    }
}