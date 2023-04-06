package br.gov.cesarschool.poo.fidelidade.cliente.negocio;

import br.gov.cesarschool.poo.fidelidade.cliente.dao.ClienteDAO;
/*
public class ClienteMediator {

    private static ClienteMediator instance;
    private ClienteDAO repositorioCliente;
    private CartaoFidelidadeMediator cartaoMediator;

    private ClienteMediator() {
        repositorioCliente = new ClienteDAO();
        cartaoMediator = CartaoFidelidadeMediator.getInstance();
    }

    public static ClienteMediator getInstance() {
        if (instance == null) {
            instance = new ClienteMediator();
        }
        return instance;
    }

    public ResultadoInclusaoCliente incluir(Cliente cliente) {
        String validacao = validar(cliente);
        if (validacao == null) {
            repositorioCliente.incluir(cliente);
            int numeroCartaoFidelidade = cartaoMediator.gerarCartaoFidelidade(cliente);
            return new ResultadoInclusaoCliente(numeroCartaoFidelidade, null);
        } else {
            return new ResultadoInclusaoCliente(0, validacao);
        }
    }

    public String alterar(Cliente cliente) {
        String validacao = validar(cliente);
        if (validacao == null) {
            repositorioCliente.alterar(cliente);
            return null;
        } else {
            return validacao;
        }
    }

    private String validar(Cliente cliente) {
      
    }
}
*/