package com.examenFinal.ms_pedidos.repository;

import com.examenFinal.ms_pedidos.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
