/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author CamiloAlvarez
 */
@Entity
@Table(name = "pedido")
public class pedido implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_pedido;

    @OneToOne(mappedBy = "pedidoId",cascade = CascadeType.ALL,fetch = FetchType.LAZY,optional = false)
    private fabricacion fabrica;
    
    @ManyToOne
    @JoinColumn(name = "id_proveedor", nullable = false)
    private proveedor prevee;
    
    @Column
    private String cantidad;

    public pedido() {
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public fabricacion getFabrica() {
        return fabrica;
    }

    public void setFabrica(fabricacion fabrica) {
        this.fabrica = fabrica;
    }

    public proveedor getPrevee() {
        return prevee;
    }

    public void setPrevee(proveedor prevee) {
        this.prevee = prevee;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

}
