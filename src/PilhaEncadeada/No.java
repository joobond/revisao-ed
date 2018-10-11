package PilhaEncadeada;

public class No {

    private int elemento;
    private No abaixo;

    public No(int elemento) {
        this.elemento = elemento;
        abaixo = null;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public No getAbaixo() {
        return abaixo;
    }

    public void setAbaixo(No abaixo) {
        this.abaixo = abaixo;
    }
}
