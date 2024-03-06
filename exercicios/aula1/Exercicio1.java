package aula1;

import utils.ExercicioGetter;
import utils.ScannerUtils;

import java.util.Scanner;

public class Exercicio1 extends ScannerUtils implements ExercicioGetter {

    @Override
    public String getProposta() {
        return "Escreva um programa que calcule os números pares situados na faixa de dois valores\n" +
                "informados pelo usuário. (Utilize a classe Scanner)";
    }

    @Override
    public void getExercicio() {
        Integer min = getInt("Digite o primeiro valor: ");
        Integer max = getInt("Digite o segundo valor: ");

        getParesIntervalo(min, max);
    }

    private static void getParesIntervalo(Integer min, Integer max) {
        for (;min <= max; min++) {
            if (min % 2 == 0) {
                System.out.println(min + " é par");
            }
        }
    }

}
