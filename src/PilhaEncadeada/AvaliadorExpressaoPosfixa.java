package PilhaEncadeada;

public class AvaliadorExpressaoPosfixa {

    public static double avaliar(String expressao) {
        PilhaEncadeada pilha = new PilhaEncadeada();

        for (int i = 0; i < expressao.length(); i++) {
            char c = expressao.charAt(i);  // Pega o caractere da posição i

            if (c == ' ') {
                continue;
            }

            // Se for um número, lê o número completo
            if (Character.isDigit(c)) {
                StringBuilder numero = new StringBuilder();

                // Lê o número completo (caso tenha mais de um dígito)
                while (i < expressao.length() && Character.isDigit(expressao.charAt(i))) {
                    numero.append(expressao.charAt(i));
                    i++;
                }

                // Corrigir o índice (devido ao avanço extra no loop)
                i--;

                // Converter o número para inteiro e empilhar
                pilha.push(Integer.parseInt(numero.toString()));
            }
            // Se for um operador, realiza a operação
            else if (c == '+' || c == '-' || c == '*' || c == '/') {
                // Verifica se há pelo menos dois números na pilha
                if (pilha.size() < 2) {
                    throw new IllegalArgumentException("Expressão inválida: pilha insuficiente para operação.");
                }

                double b = pilha.pop();  // Retira o operando direito
                double a = pilha.pop();  // Retira o operando esquerdo

                // Executa a operação dependendo do operador
                switch (c) {
                    case '+':
                        pilha.push(a + b);  // Soma
                        break;
                    case '-':
                        pilha.push(a - b);  // Subtração
                        break;
                    case '*':
                        pilha.push(a * b);  // Multiplicação
                        break;
                    case '/':
                        if (b == 0) {
                            throw new ArithmeticException("Erro: divisão por zero.");
                        }
                        pilha.push(a / b);  // Divisão
                        break;
                    default:
                        throw new IllegalArgumentException("Operador inválido encontrado: " + c);
                }
            } else {
                // Se o caractere não for número nem operador, lançar exceção
                throw new IllegalArgumentException("Caractere inválido encontrado: " + c);
            }
        }

        // Ao final, deve restar apenas um número na pilha, que é o resultado
        if (pilha.size() != 1) {
            throw new IllegalArgumentException("Expressão inválida: resultado inesperado.");
        }

        return pilha.pop();  // Retorna o resultado final
    }
}
