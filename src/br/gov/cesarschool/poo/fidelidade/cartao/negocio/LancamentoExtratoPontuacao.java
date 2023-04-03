package br.gov.cesarschool.poo.fidelidade.cartao.negocio;

import java.time.LocalDateTime;

public class LancamentoExtratoPontuacao extends LancamentoExtrato {
    
    public LancamentoExtratoPontuacao(long numeroCartao, int quantidadePontos, LocalDateTime dataHoraLancamento) {
        super(numeroCartao, quantidadePontos, dataHoraLancamento);
    }
    
}