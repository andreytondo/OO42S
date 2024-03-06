package dao;

import java.util.Collection;

// POLIMORFISMO interface que obriga a classe a implementar um calculo de valor total
public interface ICalculaValorTotal<E> {

    Double calculaValorTotal(Collection<E> itens);
}
