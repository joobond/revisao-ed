package PilhasComArranjos;

public class TestarPilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(6);

        pilha.empilhar(5);
        pilha.empilhar(4);
        pilha.empilhar(3);
        pilha.empilhar(2);
        pilha.empilhar(1);
        pilha.empilhar(0);

        if(!pilha.isVazia())System.out.println("Elemento: "+pilha.desempilhar());
        if(!pilha.isVazia())System.out.println("Elemento: "+pilha.desempilhar());
        if(!pilha.isVazia())System.out.println("Elemento: "+pilha.desempilhar());
        if(!pilha.isVazia())System.out.println("Elemento: "+pilha.desempilhar());
        if(!pilha.isVazia())System.out.println("Elemento: "+pilha.desempilhar());
        if(!pilha.isVazia())System.out.println("Elemento: "+pilha.desempilhar());
        if(!pilha.isVazia())System.out.println("Elemento: "+pilha.desempilhar());

    }
}
