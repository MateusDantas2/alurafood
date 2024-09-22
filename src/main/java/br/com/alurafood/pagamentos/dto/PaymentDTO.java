package br.com.alurafood.pagamentos.dto;

import br.com.alurafood.pagamentos.enumration.Status;

import java.math.BigDecimal;

/**
 * @author Mateus Dantas
 */
public record PaymentDTO(
        Long id,
        Long idPedido,
        Long idFormaDePagamento,
        BigDecimal valor,
        String nome,
        String numero,
        String expiracao,
        String codigo,
        Status status
) {
}