package ListasDuplamenteEncadeadasCircular;

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
            no.setProximo(inicio);
            no.setAnterior(fim);
        }else{
            no.setProximo(inicio);
            inicio.setAnterior(no);
            no.setAnterior(fim);
            fim.setProximo(no);
            inicio = no;
        }
        quantidade++;
    }

    public void inserirFim(No no){
        if (isVazia()){
            inicio = no;
            fim = no;
            no.setProximo(inicio);
            no.setAnterior(fim);
        }else{
            fim.setProximo(no);
            no.setAnterior(fim);
            no.setProximo(inicio);
            inicio.setAnterior(fim);
            fim = no;
        }
        quantidade++;
    }

    public void imprimir(){
        if (!isVazia()){
            No aux = inicio;
            do {
                System.out.println(aux.getConteudo());
                aux = aux.getProximo();
            }while(aux != inicio);
        }else{
            System.out.println("A lista está vazia!");
        }
    }

    public void imprimirInvertido(){
        if (!isVazia()){
            No aux = fim;
            do {
                System.out.println(aux.getConteudo());
                aux = aux.getAnterior();
            }while(aux != fim);
        }else{
            System.out.println("A lista está vazia!");
        }
    }
}
