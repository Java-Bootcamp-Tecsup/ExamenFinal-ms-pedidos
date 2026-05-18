package com.examenFinal.ms_pedidos.service;

import com.examenFinal.ms_pedidos.dto.EstadoDTO;
import com.examenFinal.ms_pedidos.dto.PedidoDTO;
import com.examenFinal.ms_pedidos.entity.Pedido;
import com.examenFinal.ms_pedidos.exception.PedidoNotFoundException;
import com.examenFinal.ms_pedidos.repository.PedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PedidoService {
    private final PedidoRepository pedidoRepository;

    public Pedido crear(PedidoDTO dto) {
        Pedido p = new Pedido();
        p.setCliente(dto.cliente());
        p.setCorreoCliente(dto.correoCliente());
        p.setProductoId(dto.productoId());
        p.setNombreProducto(dto.nombreProducto());
        p.setCantidad(dto.cantidad());
        p.setPrecioUnitario(dto.precioUnitario());
        p.setTotal(dto.precioUnitario().multiply(java.math.BigDecimal.valueOf(dto.cantidad())));
        p.setEstado("REGISTRADO");
        p.setFechaPedido(LocalDateTime.now());
        return pedidoRepository.save(p);
    }

    public List<Pedido> listar() {
        return pedidoRepository.findAll();
    }

    public Pedido buscarPorId(Long id) {
        return pedidoRepository.findById(id)
                .orElseThrow(() -> new PedidoNotFoundException(id));
    }

    public Pedido actualizarEstado(Long id, EstadoDTO dto) {
        Pedido p = buscarPorId(id);
        p.setEstado(dto.estado());
        return pedidoRepository.save(p);
    }

    public void eliminar(Long id) {
        Pedido p = buscarPorId(id);
        p.setEstado("CANCELADO");
        pedidoRepository.save(p);
    }
}
