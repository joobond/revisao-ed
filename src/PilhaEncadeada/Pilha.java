package PilhaEncadeada;

public class Pilha {

    private No topo;
    private int quantidade;

    public Pilha() {
        topo = null;
        quantidade = 0;
    }

    public boolean isVazia(){
        return topo == null;
    }

    public void empilhar(No valor){
        if(!isVazia()){
          valor.setAbaixo(topo);
          topo = valor;
          quantidade++;
        }else{
            System.out.println("Pilha Vazia!");
        }
    }

    public int desempilhar(){
        No aux = null;
        if(!isVazia()){
            aux = topo;
            topo = aux.getAbaixo();
            aux.setAbaixo(null);
            quantidade--;
        }else{
            System.out.println("Pilha Vazia!");
        }
        return aux.getElemento();
    }
}
