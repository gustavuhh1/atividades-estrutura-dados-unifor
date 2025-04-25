package PilhaEncadeada;

class No {
    private double value;
    private No next;

    public No(int value) {
        this.value = value;
        this.next = null;
    }

    public double getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public No getNext() {
        return next;
    }

    public void setNext(No next) {
        this.next = next;
    }
}
