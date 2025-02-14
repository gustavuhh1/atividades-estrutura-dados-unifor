package att;

import java.util.ArrayList;

public class Questao04 {

    Questao03 questao03 = new Questao03();

    public void retornarNumeroMaiorMenor(){
        ArrayList<Integer> lista = questao03.createList();
        int maior = 0;
        int menor = 0;
        for (Integer integer : lista) {
            if (integer > maior) {
                System.out.println("Numero maior atualizado");
                System.out.println(maior + "<- atual, novo ->" + integer);
                maior = integer;
            }

            if (integer < menor) {
                System.out.println("Numero menor atualizado");
                System.out.println(menor + "<- atual, novo ->" + integer);
                menor = integer;
            }
        }

        System.out.println("Lista:");
        System.out.println(lista);
        System.out.println("Numero maior: " + maior);
        System.out.println("Numero menor: " + menor);

    }
}