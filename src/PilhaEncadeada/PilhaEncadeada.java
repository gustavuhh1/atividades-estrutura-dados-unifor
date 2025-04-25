package PilhaEncadeada;

class PilhaEncadeada {
    private No top;
    private int size;

    public PilhaEncadeada() {
        top = null;
        size = 0;
    }

    public void push(int item) {
        No no = new No(item);
        no.setNext(top);
        top = no;
        size++;
    }

    public double pop() {
        if (isEmpty()) throw new RuntimeException("Pilha vazia");
        double value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }

    public double top() {
        if (isEmpty()) throw new RuntimeException("Pilha vazia");
        return top.getValue();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }
}
