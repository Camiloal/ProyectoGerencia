/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author CamiloAlvarez
 */
@Entity
@Table(name = "producto")
public class producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_producto;
    @Column
    private String nombre;
    @Column
    private String foto;
    @Column
    private String precio;

    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<fabricacion> listaFabricacion;

    @OneToMany(mappedBy = "productoVenta", cascade = CascadeType.ALL)
    private List<venta> listaVenta;

    public producto() {
    }

    public producto(int id_producto, String nombre, String foto, String precio) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.foto = foto;
        this.precio = precio;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

}
