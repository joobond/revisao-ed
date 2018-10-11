package PilhasComArranjos;

public class Pilha {

    private int topo;
    private int elementos[];

    public Pilha(int tamanho) {
        elementos = new int[tamanho];
        topo = -1;
    }

    public boolean isVazia(){
        return topo == -1;
    }

    public int quantidade(){
        return topo + 1;
    }

    public boolean isCheia(){
        return topo == elementos.length -1;
    }

    public void empilhar(int valor){
        if (!isCheia()){
            topo++;
            elementos[topo] = valor;
        }else{
            System.out.println("Pilha Cheia!");
        }
    }

    public int desempilhar() {
        int valor = elementos[topo];
        topo--;
        return valor;
    }
}
