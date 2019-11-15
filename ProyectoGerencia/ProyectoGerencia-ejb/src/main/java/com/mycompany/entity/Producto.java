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
public class Producto implements Serializable {

   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto",columnDefinition = "serial")
    private int idproducto;
    @Column
    private String nombre;
    @Column
    private String foto;
    @Column
    private double precio;

    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<Fabricacion> listaFabricacion;

    @OneToMany(mappedBy = "productoVenta", cascade = CascadeType.ALL)
    private List<Venta> listaVenta;

    public Producto() {
    }

    
    public Producto( String nombre, String foto, double precio) {
        this.nombre = nombre;
        this.foto = foto;
        this.precio = precio;
    }

    public Producto(String nombre, String foto, double precio, List<Fabricacion> listaFabricacion, List<Venta> listaVenta) {
        this.nombre = nombre;
        this.foto = foto;
        this.precio = precio;
        this.listaFabricacion = listaFabricacion;
        this.listaVenta = listaVenta;
    }

    public int getId_producto() {
        return idproducto;
    }

    public void setId_producto(int idproducto) {
        this.idproducto = idproducto;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
