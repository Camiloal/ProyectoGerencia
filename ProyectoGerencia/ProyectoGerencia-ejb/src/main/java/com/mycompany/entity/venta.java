/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author CamiloAlvarez
 */
@Entity
public class venta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_venta;
    
    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false)
    private producto productoVenta;
    
    @Column
    private String cantidad;

}
