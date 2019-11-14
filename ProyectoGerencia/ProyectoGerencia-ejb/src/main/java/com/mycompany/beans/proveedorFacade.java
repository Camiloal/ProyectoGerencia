/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beans;

import com.mycompany.interfaces.proveedorFacadeLocal;
import com.mycompany.entity.proveedor;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author CamiloAlvarez
 */
@Stateless
public class proveedorFacade extends AbstractFacade<proveedor> implements proveedorFacadeLocal {
    @PersistenceContext(unitName = "percistence")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public proveedorFacade() {
        super(proveedor.class);
    }
    
}
