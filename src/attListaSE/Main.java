package attListaSE;

public class Main {
    public static void main(String[] args) {
        ListaSE lista = new ListaSE();

        lista.adicionar(5);
        lista.adicionar(10);
        lista.adicionar(15);
        lista.adicionar(20);
        lista.adicionar(12, 5);

        lista.exibir();
        lista.alterar(6,2);
        lista.pegaNo(2);

    }
}
