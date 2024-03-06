import dao.ComandaDAO;
import factory.ComandaDeliveryFactory;
import factory.ComandaPresencialFactory;
import utils.CalculaValorComandas;

public class Main {
    public static void main(String[] args) {
        ComandaDAO dao = new ComandaDAO();
        ComandaPresencialFactory presencialFactory = new ComandaPresencialFactory();
        ComandaDeliveryFactory deliveryFactory = new ComandaDeliveryFactory();
        dao.adicionar(deliveryFactory.criar());
        dao.adicionar(deliveryFactory.criarOutro());
        dao.adicionar(presencialFactory.criar());

        dao.getComandasDelivery().forEach(comanda -> {
            System.out.println("=================================================== Delivery ===================================================");
            System.out.println(comanda + "\n");
        });

        dao.getComandasPresencial().forEach(comanda -> {
            System.out.println("=================================================== Presencial ===================================================");
            System.out.println(comanda + "\n");
        });

        System.out.println("=================================================== Lista de todas as comandas ===================================================");
        dao.getComandasDelivery().forEach(comanda -> System.out.println(comanda.getInfo() + "\n"));
        dao.getComandasPresencial().forEach(comanda -> System.out.println(comanda.getInfo() + "\n"));

        System.out.println("=================================================== Lista de itens de todas as comandas ===================================================");
        dao.getComandasDelivery().forEach(comanda -> System.out.println(comanda.getItensFormatados() + "\n"));
        dao.getComandasPresencial().forEach(comanda -> System.out.println(comanda.getItensFormatados() + "\n"));

        System.out.println("=================================================== Total recebido por comanda ===================================================");
        System.out.println("Total de comandas do atendimento presencial: " + CalculaValorComandas.calculaValorTotal(dao.getComandasPresencial()));
        System.out.println("Total de comandas do atendimento delivery: " + CalculaValorComandas.calculaValorTotal(dao.getComandasDelivery()));
    }
}