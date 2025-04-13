/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entity.bl;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author nhlak
 */
@Stateless
public class Studentv1Facade extends AbstractFacade<Studentv1> implements Studentv1FacadeLocal {

    @PersistenceContext(unitName = "StudentEJBModule1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Studentv1Facade() {
        super(Studentv1.class);
    }

    @Override
    public List<Studentv1> findByNameAndSurname(String name, String surname) {
        Query query = em.createQuery("SELECT s FROM Studentv1 s WHERE s.name = :name AND s.surname =:surname");
        query.setParameter("name", name);
        query.setParameter("surname", surname);
        return query.getResultList();
    }

    @Override
    public List<Studentv1> findByQualififcation(String qualification) {
        Query query = em.createQuery("SELECT s FROM Studentv1 s WHERE s.qualification =:qualification");
        query.setParameter("qualification", qualification);
        return query.getResultList();
    }
    
}
