package PilhaEncadeada;

public class Main {
    public static void main(String[] args) {
        AvaliadorExpressaoPosfixa av1 = new AvaliadorExpressaoPosfixa();

        double valor = 5.50;

        String expressao = "550 1 + 1 2 + 4 * + 3 -";  // Exemplo de expressão pós-fixada
        try {
            double resultado = av1.avaliar(expressao);  // Avalia a expressão
            System.out.println("Resultado: " + resultado);  // Exibe o resultado
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());  // Caso haja erro
        }
    }
}
