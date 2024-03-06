package aula1;

import utils.ExercicioGetter;
import utils.ScannerUtils;

public class Exercicio2 extends ScannerUtils implements ExercicioGetter {

    @Override
    public String getProposta() {
        return "Escreva um programa que calcule o volume de uma caixa (volume = comprimento *\n" +
                "altura * largura). O usuário deverá informar a altura, comprimento e largura da\n" +
                "caixa. (Utilize a classe Scanner)";
    }

    @Override
    public void getExercicio() {
        Double altura = getDouble("Informe a altura: ");
        Double comprimento = getDouble("Informe o comprimento: ");
        Double largura = getDouble("Informe a largura: ");

        System.out.println("O volume da caixa é " + calculaVoluma(altura, comprimento, largura));
    }

    public static Double calculaVoluma(Double comprimento, Double altura, Double largura) {
        return comprimento * altura * largura;
    }
}
