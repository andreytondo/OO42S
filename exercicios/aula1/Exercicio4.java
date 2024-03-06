package aula1;

import utils.ExercicioGetter;
import utils.JOptionPaneUtils;

public class Exercicio4 extends JOptionPaneUtils implements ExercicioGetter {

    @Override
    public String getProposta() {
        return "Escreva um programa que calcule o valor do produto de acordo com a taxa de aumento\n" +
                "(%). Solicite ao usuário que informe o valor do produto e a taxa de aumento. O programa\n" +
                "retornar o novo valor do produto. Exemplo: valor do produto = R$ 2.000,00, Taxa de\n" +
                "aumento = 10%. O novo valor do produto é R$ 2.200,00. (Utilize a classe JOptionPane)\n";
    }

    @Override
    public void getExercicio() {
        Double valor = getDouble("Informe o valor do produto");
        Double taxa = getDouble("Informe a taxa");
    }
}
