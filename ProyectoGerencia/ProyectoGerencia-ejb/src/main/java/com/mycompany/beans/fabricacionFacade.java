/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beans;

import com.mycompany.interfaces.fabricacionFacadeLocal;
import com.mycompany.entity.fabricacion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author CamiloAlvarez
 */
@Stateless
public class fabricacionFacade extends AbstractFacade<fabricacion> implements fabricacionFacadeLocal {
    @PersistenceContext(unitName = "percistence")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public fabricacionFacade() {
        super(fabricacion.class);
    }
    
}
