package br.com.alurafood.pagamentos.domain.repository;

import br.com.alurafood.pagamentos.domain.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Mateus Dantas
 */
public interface PaymentRepository extends JpaRepository<Payment, Long> {}
