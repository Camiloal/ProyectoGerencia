/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfaces;

import com.mycompany.entity.proveedor;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author CamiloAlvarez
 */
@Local
public interface proveedorFacadeLocal {

    void create(proveedor proveedor);

    void edit(proveedor proveedor);

    void remove(proveedor proveedor);

    proveedor find(Object id);

    List<proveedor> findAll();

    List<proveedor> findRange(int[] range);

    int count();
    
}
