package att;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Questao03 {

    ArrayList<Integer> numeros = new ArrayList(10);

    public int createRandom(){
        Random random = new Random();
        int number = random.nextInt(20);
        return number;
    }

    public ArrayList<Integer> createList(){
        for (int i = 0; i < 10; i++) {
            int number = createRandom();
            numeros.add(number);


        }
        System.out.println(numeros);
        return numeros;
    }

    public void sortNumber(){
        ArrayList<Integer> lista = createList();
        Scanner s = new Scanner(System.in);
        int count = 3;

        for (int i = 0; i < count; i++) {
            System.out.println("Você tem " + count + "tentativas.");
            System.out.println("Escolha o número;");
            int escolha = s.nextInt();
            for (int j = 0; j < lista.size(); j++) {
                if(lista.get(j) == escolha){
                    System.out.println("Você acertou o numero, Parabéns!!");
                    System.out.println("Número: "+ escolha + " Na posição: " + (lista.indexOf(escolha) + 1) );

                    i = 3;
                    j = 1000;
                }

            }

        }
    }
}