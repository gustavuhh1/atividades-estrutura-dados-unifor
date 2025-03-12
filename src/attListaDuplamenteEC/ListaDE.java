package attListaDuplamenteEC;


class ListaDE {
    private No2 cabeca;
    private No2 cauda;
    private int tamanho;

    public ListaDE() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanho = 0;
    }

    public void inserirNoInicio(int elemento) {
        No2 novoNo = new No2(elemento);
        if (estaVazio()) {
            cabeca = cauda =  novoNo;

        } else {
            novoNo.setProximo(cabeca);
            cabeca.setAnterior(novoNo);
            cabeca = novoNo;
        }
        tamanho++;
    }

    public void inserirNoFim(int elemento) {
        No2 novoNo = new No2(elemento);
        if (estaVazio()) {
           cabeca= cauda = novoNo;
        } else {
            cauda.setProximo(novoNo);
            novoNo.setAnterior(cauda);
            cauda = novoNo;
        }
        tamanho++;
    }

    public void inserir(int elemento, int posicao) {
        if (posicao < 0 || posicao > tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        if (posicao == 0) {
            inserirNoInicio(elemento);
        } else if (posicao == tamanho) {
            inserirNoFim(elemento);
        } else {
            No2 novoNo = new No2(elemento);
            No2 atual = cabeca;
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.getProximo();
            }
            novoNo.setProximo(atual.getProximo());
            novoNo.setAnterior(atual);
            atual.setProximo(novoNo);
            tamanho++;
        }
    }

    public boolean estaVazio() {
        return tamanho == 0;
    }

    public void pegaElemento(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        No2 atual = cabeca;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        No2 proximo =  atual.getProximo();
        No2 anterior =  atual.getAnterior();
        System.out.println("O elemento pegado: "+ atual.getElemento());
        System.out.println("O proximo do elemento é: "+ proximo.getElemento());
        System.out.println("O anterior do elemento é: "+ anterior.getElemento());
    }

    public void alteraElemento(int elemento, int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        No2 atual = cabeca;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        atual.setElemento(elemento);
    }

    public void remove(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        if (posicao == 0) {
            cabeca = cabeca.getProximo();
            if (cabeca == null) cauda = null;
        } else {
            No2 atual = cabeca;
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.getProximo();
            }
            atual.setProximo(atual.getProximo().getProximo());
            if (atual.getProximo() == null) cauda = atual;
        }
        tamanho--;
    }

    public int tamanho() {
        return tamanho;
    }

    public void inserirOrdenado(int elemento) {
        if (estaVazio() || cabeca.getElemento() >= elemento) {
            inserirNoInicio(elemento);
            return;
        }
        No2 atual = cabeca;
        while (atual.getProximo() != null && atual.getProximo().getElemento() < elemento) {
            atual = atual.getProximo();
        }
        No2 novoNo = new No2(elemento);
        novoNo.setProximo(atual.getProximo());
        atual.setProximo(novoNo);
        if (novoNo.getProximo() == null) {
            cauda = novoNo;
        }
        tamanho++;
    }

    public void ordenar() {
        if (tamanho < 2) return;
        for (No2 i = cabeca; i != null; i = i.getProximo()) {
            for (No2 j = i.getProximo(); j != null; j = j.getProximo()) {
                if (i.getElemento() > j.getElemento()) {
                    int temp = i.getElemento();
                    i.setElemento(j.getElemento());
                    j.setElemento(temp);
                }
            }
        }
    }

    public void imprimirLista() {
        No2 atual = cabeca;
        while (atual != null) {
            System.out.print(atual.getElemento() + " -> ");
            atual = atual.getProximo();
        }
        System.out.println("null");
    }

    public void pegaUltimo(){
        No2 atual = cauda;
        No2 anterior = atual.getAnterior();
        System.out.println("O Elemento da cauda é: " + atual.getElemento());
        System.out.println("O elemento anterior da cauda é: " + anterior.getElemento());
    }
    public void pegaPrimeiro(){
        No2 atual = cauda;
        No2 proximo = atual.getProximo();
        System.out.println("O Elemento da cauda é: " + atual.getElemento());
        System.out.println("O elemento anterior da cauda é: " + proximo.getElemento());
    }
}