/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao9;

import java.util.Objects;
import questao9.Arvore.ArvoreBinaria;

/**
 *
 * @author Juliano
 */
public class Questao9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    private ArvoreBinaria arvoreBinaria;

    public Questao9(ArvoreBinaria arvoreBinaria) {
        this.arvoreBinaria = arvoreBinaria;
    }

    public int sum() {
        return sum(arvoreBinaria);
    }

    private int sum(ArvoreBinaria binaryTree) {

        if (binaryTree == null) {
            return 0;
        }

        return arvoreBinaria.getValor() + sum(arvoreBinaria.getEsquerda()) + sum(arvoreBinaria.getDireita());
    }
    
}
