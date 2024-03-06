package aula1;

/*

 */

import utils.ExercicioGetter;
import utils.ScannerUtils;

public class Exercicio3 extends ScannerUtils implements ExercicioGetter {

    @Override
    public String getProposta() {
        return "Escreva um programa que calcule a média salarial dos funcionários de uma empresa. O\n" +
                "usuário deverá informar o número de funcionários e os valores dos salários de cada\n" +
                "funcionário. (Utilize a classe Scanner)";
    }

    @Override
    public void getExercicio() {
        Integer numFuncionarios = getInt("Informe a quantidade de funcionários: ");
        Double total = (double) 0;

        for (int i = 0; i < numFuncionarios; i++) {
            Double salario = getDouble("Informe o salário do funcionaário " + (i+ 1));
            total += salario;
        }

        System.out.println("A média salarial é " + getMediaSalarial(numFuncionarios, total));
    }

    public Double getMediaSalarial(Integer numFuncionarios, Double salarioTotal) {
        return salarioTotal / numFuncionarios;
    }

}
