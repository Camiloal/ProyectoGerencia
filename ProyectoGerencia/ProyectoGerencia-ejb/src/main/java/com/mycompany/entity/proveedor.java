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
@Table(name = "proveedor")
public class proveedor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_proveedor;

    @Column
    private String nombre;
    @Column
    private String direccion;
    @Column
    private String precio;

    @OneToMany(mappedBy = "prevee", cascade = CascadeType.ALL)
    private List<proveedor> listaProveedor;

    public proveedor() {
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public List<proveedor> getListaProveedor() {
        return listaProveedor;
    }

    public void setListaProveedor(List<proveedor> listaProveedor) {
        this.listaProveedor = listaProveedor;
    }
    
    
}
