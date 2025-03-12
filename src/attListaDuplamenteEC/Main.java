package attListaDuplamenteEC;

public class Main {
    public static void main(String[] args) {
        ListaDE lista = new ListaDE();

        lista.inserirNoInicio(5);
        lista.inserirNoInicio(10);
        lista.inserirNoInicio(15);
        lista.inserirNoInicio(20);
        lista.inserir(12, 2);


        lista.alteraElemento(6,2);
        lista.imprimirLista();
        lista.pegaUltimo();

    }
}
