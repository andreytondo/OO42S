package factory;

import models.comanda.Comanda;

// POLIMORFISMO as factories de comanda precisam implementar sua forma de criar o próprio objeto

public interface IComandaFactory<E extends Comanda> {

    E criar();
}
