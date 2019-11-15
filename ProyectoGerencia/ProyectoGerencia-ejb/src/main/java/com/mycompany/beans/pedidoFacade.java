/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beans;

import com.mycompany.interfaces.pedidoFacadeLocal;
import com.mycompany.entity.Pedido;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author CamiloAlvarez
 */
@Stateless
public class pedidoFacade extends AbstractFacade<Pedido> implements pedidoFacadeLocal {
    @PersistenceContext(unitName = "percistence")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public pedidoFacade() {
        super(Pedido.class);
    }
    
}
