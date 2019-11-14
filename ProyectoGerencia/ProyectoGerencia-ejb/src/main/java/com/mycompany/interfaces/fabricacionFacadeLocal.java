/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfaces;

import com.mycompany.entity.fabricacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author CamiloAlvarez
 */
@Local
public interface fabricacionFacadeLocal {

    void create(fabricacion fabricacion);

    void edit(fabricacion fabricacion);

    void remove(fabricacion fabricacion);

    fabricacion find(Object id);

    List<fabricacion> findAll();

    List<fabricacion> findRange(int[] range);

    int count();
    
}
