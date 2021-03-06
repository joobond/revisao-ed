package ListasDuplamenteEncadeadas;

public class Lista {

    private No inicio;
    private No fim;
    private int quantidade;

    public Lista() {
        inicio = null;
        fim = null;
        quantidade = 0;
    }

    public boolean isVazia(){
        return inicio == null;
    }

    public void inserirInicio(No no){
        if (isVazia()){
            inicio = no;
            fim = no;
        }else{
            no.setProximo(inicio);
            inicio.setAnterior(no);
            inicio = no;
        }
        quantidade++;
    }

    public void inserirFim(No no){
        if (isVazia()){
            inicio = no;
            fim = no;
        }else{
            no.setAnterior(fim);
            fim.setProximo(no);
            fim = no;
        }
        quantidade++;
    }

    public void imprimir(){
        if (!isVazia()){
            No aux = inicio;
            while(aux != null){
                System.out.println(aux.getConteudo());
                aux = aux.getProximo();
            }
        }else{
            System.out.println("A lista está vazia!");
        }
    }

    public void imprimirInvertido(){
        if (!isVazia()){
            No aux = fim;
            while(aux != null){
                System.out.println(aux.getConteudo());
                aux = aux.getAnterior();
            }
        }else{
            System.out.println("A lista está vazia!");
        }
    }


}
