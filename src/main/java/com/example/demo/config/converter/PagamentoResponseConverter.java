package com.example.demo.config.converter;

import com.example.demo.domain.model.Pagamento;
import com.example.demo.dto.PagamentoResponse;

public class PagamentoResponseConverter {
    public PagamentoResponse fromPagamento(Pagamento pagamento){
        return PagamentoResponse.builder()
                .id(pagamento.getId())
                .descricao(pagamento.getDescricao())
                .tipo(pagamento.getTipo())
                .build();
    }
}
