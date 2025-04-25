/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entity.bl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.entity.Faculty;

/**
 *
 * @author nhlak
 */
@Stateless
public class FacultyFacade extends AbstractFacade<Faculty> implements FacultyFacadeLocal {

    @PersistenceContext(unitName = "TechnoByteSolutionsEJBModule1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FacultyFacade() {
        super(Faculty.class);
    }
    
}
