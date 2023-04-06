package br.gov.cesarschool.poo.fidelidade.cliente.negocio;

import br.gov.cesarschool.poo.fidelidade.cliente.dao.ClienteDAO;

import br.gov.cesarschool.poo.fidelidade.cliente.entidade.Cliente;
import br.gov.cesarschool.poo.fidelidade.cliente.entidade.ResultadoInclusaoCliente;
import br.gov.cesarschool.poo.fidelidade.geral.entidade.Sexo;

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
            return validar(cliente);
        }
    }

    private String validar(Cliente cliente) {
    	String cpf = ValidadorCPF.validar(cliente.getCpf();
    	if (cpf!= null) {
    		return cpf;
    	}
 
    	
    	private String validar(Cliente cliente) {
    	    if (ValidadorCPF.validar(cliente.getCpf()) != null) {
    	        return "CPF Invalido";
    	    }

    	    if (StringUtils.ENuloOuBranco(cliente.getNome()) != null) {
    	        return "Nome Invalido";
    	    }

    	    if (cliente.getSexo() == null) {
    	        return "Sexo Invalido";
    	    }

    	    if (cliente.obterIdade() < 18) {
    	        return "Cliente com idade menor a 18 anos";
    	    }

    	    if (cliente.getRenda() < 0) {
    	        return "Renda Invalida";
    	    }

    	    Endereco end = cliente.getEndereco();
    	    if (end == null) {
    	        return "Endereço Invalido";
    	    }

    	    if (StringUtils.ENuloOuBranco(end.getLogradouro()) || end.getLogradouro().length < 4) {
    	        return "Endereço Logradouro Invalido"; 
    	    }

    	    if (end.getNumero() < 0) {
    	        return "Endereço Numero Invalido";
    	    }

    	    if (StringUtils.ENuloOuBranco(end.getCidade())) {
    	        return "Endereço Cidade Invalido"; 
    	    }
    	    
    	    if (StringUtils.ENuloOuBranco(end.getEstado())) {
    	        return "Endereço Estado Invalido"; 
    	    }

    	    if (StringUtils.ENuloOuBranco(end.getPais())) {
    	        return "Endereço Pais Invalido"; 
    	    }

    	    return null;
    	}
    }
}