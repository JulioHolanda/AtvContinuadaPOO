package br.gov.cesarschool.poo.fidelidade.cliente.entidade;

public class ResultadoInclusaoCliente {
	private long numeroFidelidade;
	private String mensagemErroValidacao;

	public ResultadoInclusaoCliente(long numeroFidelidade, String mensagemErroValidacao) {
		this.numeroFidelidade = numeroFidelidade;
		this.mensagemErroValidacao = mensagemErroValidacao;
	}
	
	public long getNumeroFidelidade() {
		return numeroFidelidade;
	}
	
	public String getMensagemErroValidacao() {
		return mensagemErroValidacao;
		
	}
}
