package ListasSimplesmenteEncadeadasCircular;

public class Lista {

    private int quantidade;
    private No inicio;

    public Lista() {
        inicio = null;
        quantidade = 0;
    }

    public boolean isVazia(){
        return inicio == null;
    }

    public void inserirInicio(No no){
        if (isVazia()){
            inicio = no;
            no.setProximo(inicio);
        }else{
            no.setProximo(inicio);
           No aux = inicio;
           while (aux.getProximo() != inicio){
               aux = aux.getProximo();
           }
           aux.setProximo(no);
           inicio = no;
        }
        quantidade++;
    }

    public void inserirFim(No no){
        if (isVazia()){
            inicio = no;
            no.setProximo(inicio);
        }else{
            No aux = inicio;
            while(aux.getProximo() != inicio) {
                aux = aux.getProximo();
            }
            aux.setProximo(no);
            no.setProximo(inicio);
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
            System.out.println("A lista está vazia");
        }
    }
}
