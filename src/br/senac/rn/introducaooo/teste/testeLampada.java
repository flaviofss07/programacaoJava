package br.senac.rn.introducaooo.teste;

import br.senac.rn.introducaooo.Lampada;

public class testeLampada {
    public static void main(String[] args) {

        Lampada lampada = new Lampada("Branco",80);

        lampada.acende();

        System.out.println(lampada);
    }
}
