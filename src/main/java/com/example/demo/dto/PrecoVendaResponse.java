package com.example.demo.dto;

import com.example.demo.domain.model.StatusEnum;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@Data
public class PrecoVendaResponse {
    private Long id;
    private BigDecimal valor;
    private StatusEnum status;
    private ProdutoResponse produto;
}
