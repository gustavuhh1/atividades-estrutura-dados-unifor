package attListaSE;

public class ListaSE {
    private No cabeca;
    private No cauda;
    private int quantidade;

    public ListaSE() {
        this.cabeca = null;
        this.cauda = null;
        this.quantidade = 0;
    }

    public void adicionar(int dado) {
        No novoNo = new No(dado);
        if (cabeca == null) {
            cabeca = novoNo;
            System.out.println("Nova Cabeça: " + cabeca.elemento);
            quantidade++;
        } else {
            No atual = cabeca;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
            quantidade++;
        }
    }

    public void adicionar(int dado, int posicao) {
        No novoNo = new No(dado);
        if (cabeca == null) {
            cabeca = novoNo;
            quantidade++;
            System.out.println("Nova Cabeça: " + cabeca.elemento);
        }
        No atual = cabeca;
        if (posicao == 1){
            cabeca = novoNo;
            novoNo.proximo = atual;
            quantidade++;
        } else {
            int count = 2;
            while (count < posicao) {
                atual = atual.proximo;
                count++;
            }
            System.out.println(atual.elemento);
            No escolhido = atual.proximo;
            atual.proximo = novoNo;
            novoNo.proximo = escolhido;
            quantidade++;

        }
    }

    public void alterar(int dado, int posicao) {
        No novoNo = new No(dado);
        if (cabeca == null) {
            cabeca = novoNo;
            quantidade++;
            System.out.println("Nova Cabeça: " + cabeca.elemento);
        }
        No atual = cabeca;
        int count = 1;
        while (atual.proximo != null) {
            atual = atual.proximo;
            if(count == posicao){
                novoNo.proximo = atual.proximo;
                atual = null;

            }
            count++;
        }
    }

    public void remover(int dado) {
        if (cabeca == null) {
            System.out.println("Lista vazia!");
            return;
        }

        if (cabeca.elemento == dado) {
            cabeca = cabeca.proximo;
            return;
        }

        No atual = cabeca;
        No anterior = null;
        while (atual != null && atual.elemento != dado) {
            anterior = atual;
            atual = atual.proximo;
        }

        if (atual != null) {
            anterior.proximo = atual.proximo;
        } else {
            System.out.println("Elemento não encontrado!");
        }
    }

    public void pegaNo(int posicao){
        No atual = cabeca;
        int count = 1;
        String msg = "";
        while(atual != null){
            if(count == posicao){
                msg += "["+atual.elemento+"]" + " -> ";
            }else{
                msg += atual.elemento + " -> ";
            }
            atual = atual.proximo;
            count++;
        }
        System.out.print(msg + "null");
    }


    public void exibir() {
        No atual = cabeca;
        if (atual == null) {
            System.out.println("Lista vazia!");
            return;
        }
        while (atual != null) {
            System.out.print(atual.elemento + " -> ");
            atual = atual.proximo;
        }

        System.out.println("null");
        System.out.println(this.quantidade + " elementos");
    }
}
