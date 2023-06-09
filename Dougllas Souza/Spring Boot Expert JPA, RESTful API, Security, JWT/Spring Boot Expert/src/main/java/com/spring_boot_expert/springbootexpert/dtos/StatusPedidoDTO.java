package com.spring_boot_expert.springbootexpert.dtos;

import com.spring_boot_expert.springbootexpert.enuns.StatusPedido;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class StatusPedidoDTO {

    @Enumerated(EnumType.STRING)
    private StatusPedido status;

    public StatusPedidoDTO() {
    }

    public StatusPedidoDTO(StatusPedido status) {
        this.status = status;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }
}
