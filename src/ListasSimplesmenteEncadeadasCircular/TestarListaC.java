package ListasSimplesmenteEncadeadasCircular;

public class TestarListaC {
    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.inserirInicio(new No(3));
        lista.inserirInicio(new No(2));
        lista.inserirInicio(new No(1));
        lista.inserirFim(new No(4));

        lista.imprimir();;
    }
}
