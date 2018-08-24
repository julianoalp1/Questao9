/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao9.Arvore;

/**
 *
 * @author Juliano
 */
public class ArvoreBinaria {
    
    private int valor;
    private ArvoreBinaria esquerda;
    private ArvoreBinaria direita;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public ArvoreBinaria getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(ArvoreBinaria esquerda) {
        this.esquerda = esquerda;
    }

    public ArvoreBinaria getDireita() {
        return direita;
    }

    public void setDireita(ArvoreBinaria direita) {
        this.direita = direita;
    }

    public ArvoreBinaria() {
    }
    
}
