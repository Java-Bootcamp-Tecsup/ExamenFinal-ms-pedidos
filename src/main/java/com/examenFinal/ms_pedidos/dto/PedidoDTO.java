package com.examenFinal.ms_pedidos.dto;

import java.math.BigDecimal;

public record PedidoDTO (
        Long pedidoId,
        String cliente,
        String correoCliente,
        Long productoId,
        String nombreProducto,
        Integer cantidad,
        BigDecimal precioUnitario
) {
}
