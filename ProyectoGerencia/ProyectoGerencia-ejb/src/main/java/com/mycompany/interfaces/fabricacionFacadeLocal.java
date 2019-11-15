/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfaces;

import com.mycompany.entity.Fabricacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author CamiloAlvarez
 */
@Local
public interface fabricacionFacadeLocal {

    void create(Fabricacion fabricacion);

    void edit(Fabricacion fabricacion);

    void remove(Fabricacion fabricacion);

    Fabricacion find(Object id);

    List<Fabricacion> findAll();

    List<Fabricacion> findRange(int[] range);

    int count();
    
}
