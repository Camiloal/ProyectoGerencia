/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfaces;

import com.mycompany.entity.pedido;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author CamiloAlvarez
 */
@Local
public interface pedidoFacadeLocal {

    void create(pedido pedido);

    void edit(pedido pedido);

    void remove(pedido pedido);

    pedido find(Object id);

    List<pedido> findAll();

    List<pedido> findRange(int[] range);

    int count();
    
}
