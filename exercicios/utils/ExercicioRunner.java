package utils;

public class ExercicioRunner {

    /**
     * Recebe uma classe de exercício e a roda automaticamente, sendo
     * necessário apenas trocar o exercício desejado dentro da função main(). Ex:
     * <pre>run(Exercicio1.class);</pre>
     *
     * @param classe Classe do exercício desejado
     * @throws Exception Caso a classe possua um construtor inválido
     */
    public static void run(Class<? extends ExercicioGetter> classe) throws Exception{
        ExercicioGetter c = classe.getConstructor().newInstance();
        c.getExercicio();
    }

}
