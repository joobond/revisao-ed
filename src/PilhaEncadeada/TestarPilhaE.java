package PilhaEncadeada;

public class TestarPilhaE {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.empilhar(new No(0));
        pilha.empilhar(new No(1));
        pilha.empilhar(new No(2));
        pilha.empilhar(new No(3));
        pilha.empilhar(new No(4));

        System.out.println(pilha.desempilhar());
        System.out.println(pilha.desempilhar());
        System.out.println(pilha.desempilhar());
        System.out.println(pilha.desempilhar());
        System.out.println(pilha.desempilhar());
    }
}
