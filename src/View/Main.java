package View;

import Controller.ContNum;

public class Main {
    public static void main(String[] args) {
        int n= (int) (Math.random() * 999999) + 10;
        int v= (int) (Math.random()* 10);
        System.out.println("Primeiro Número escolhido: "+ n);
        System.out.println("Segundo Número escolhido: "+ v);
        ContNum re= new ContNum();
        System.out.println("Quantidade do Segundo número no Primeiro número: "+ re.ContaNumIgual(n, v));

    }
}
