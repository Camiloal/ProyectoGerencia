/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
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
@Table(name = "fabricacion")
public class fabricacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_fabricacion;

    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false)
    private producto producto;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pedido")
    private pedido pedidoId;

    @Column
    private String cantidad;

    @Column
    private String precio;

    public fabricacion() {
    }

    public int getId_fabricacion() {
        return id_fabricacion;
    }

    public void setId_fabricacion(int id_fabricacion) {
        this.id_fabricacion = id_fabricacion;
    }

    public producto getProducto() {
        return producto;
    }

    public void setProducto(producto producto) {
        this.producto = producto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public pedido getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(pedido pedidoId) {
        this.pedidoId = pedidoId;
    }

    
}
