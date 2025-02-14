package att;

import java.util.ArrayList;
import java.util.Random;

public class Questao05 {


    public int cR(){
        Random random = new Random();
        int number = random.nextInt(-100,100);
        return number;
    }
    public void resolverQuestao() {

        int[][] lista = {
                {cR(), cR(), cR(), cR(), cR()},
                {cR(), cR(), cR(), cR(), cR()},
                {cR(), cR(), cR(), cR(), cR()},
                {cR(), cR(), cR(), cR(), cR()},
                {cR(), cR(), cR(), cR(), cR()},
        };

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(lista[i][j] + " ");

            }
            System.out.println();
        }

    }
}