package att1EDados;

public class Questao01 {
    // Criando e preenchendo o vetor
    int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

    public void exibirVetor() {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }
    }

}
