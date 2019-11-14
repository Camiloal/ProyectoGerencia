/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfaces;

import com.mycompany.entity.venta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author CamiloAlvarez
 */
@Local
public interface ventaFacadeLocal {

    void create(venta venta);

    void edit(venta venta);

    void remove(venta venta);

    venta find(Object id);

    List<venta> findAll();

    List<venta> findRange(int[] range);

    int count();
    
}
