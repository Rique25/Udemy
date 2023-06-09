package com.spring_boot_expert.springbootexpert.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Types;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "cliente")
public class ClienteModel implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Type(type = "org.hibernate.type.UUIDCharType")
    private UUID id;

    @Column(nullable = false, length = 100)
    @NotNull
    private String nome;

    @Column(nullable = false, length = 20, name = "cpf")
    @NotNull
    private String cpf;

    @JsonIgnore
    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
    private Set<PedidoModel> pedidos;

    public ClienteModel() {
    }

    public ClienteModel(UUID id, String nome, String cpf, Set<PedidoModel> pedidos) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.pedidos = pedidos;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Set<PedidoModel> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Set<PedidoModel> pedidos) {
        this.pedidos = pedidos;
    }
}
