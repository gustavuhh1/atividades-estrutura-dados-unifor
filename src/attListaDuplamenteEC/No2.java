package attListaDuplamenteEC;

;

public class No2 {
    private int elemento;
    private No2 proximo;
    private No2 anterior;

    public No2(int elemento) {
        this.elemento = elemento;
        this.proximo = null;
        this.anterior = null;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public No2 getProximo() {
        if (proximo == null){
            return null;
        }
        return proximo;
    }

    public void setProximo(No2 próximo) {
        this.proximo = próximo;
    }

    public No2 getAnterior() {
        if (anterior == null){
            return null;
        }
        return anterior;
    }

    public void setAnterior(No2 anterior) {
        this.anterior = anterior;
    }
}
