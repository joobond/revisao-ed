package ListasSimplismenteEncadeadas;

public class Lista {

    private int quantidade;
    private No inicio;

    public Lista() {
        inicio =  null;
        quantidade = 0;
    }

    public boolean isVazia(){
        return inicio == null;
    }

    public void inserirInicio(No no){
        if(isVazia()){
            inicio = no;
        }else{
            no.setProximo(inicio);
            inicio = no;
        }
        quantidade++;
    }

    public void inserirFim(No no){
        if(isVazia()){
            inicio = no;
        }else{
            No aux = inicio;
            while(aux.getProximo() != null){
                aux =  aux.getProximo();
            }
            aux.setProximo(no);
        }
        quantidade++;
    }

    public void imprimir(){
        No aux = inicio;
        if(!isVazia()){
            while(aux != null){
                System.out.println(aux.getConteudo());
                aux = aux.getProximo();
            }
        }else{
            System.out.println("A lista está vazia!");
        }
    }
}
