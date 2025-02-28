package attListaSE;

public class No {
    public int elemento;
    public No proximo;
    public No() {
        elemento = 0;
        proximo = null;

    }

    public No(int elemento) {
        this.elemento = elemento;
        proximo = null;
    }
}
