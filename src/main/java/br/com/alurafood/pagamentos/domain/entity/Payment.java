package br.com.alurafood.pagamentos.domain.entity;

import br.com.alurafood.pagamentos.enumration.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author Mateus Dantas
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pagamentos")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Positive
    @Column(name = "valor")
    private BigDecimal value;

    @NotBlank
    @Size(max = 100)
    @Column(name = "nome")
    private String name;

    @NotBlank
    @Size(max = 19)
    @Column(name = "numero")
    private String number;

    @Size(max = 7)
    @Column(name = "expiracao")
    private String expiracao;

    @NotBlank
    @Size(min = 3, max = 3)
    @Column(name = "codigo")
    private String codigo;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Status status;

    @NotNull
    @Column(name = "idPedido")
    private Long idOrder;

    @NotNull
    @Column(name = "idFormaDePagamento")
    private Long idPaymentMethod;
}
