/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entity.bl;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author nhlak
 */
@Local
public interface Studentv1FacadeLocal {

    void create(Studentv1 studentv1);

    void edit(Studentv1 studentv1);

    void remove(Studentv1 studentv1);

    Studentv1 find(Object id);

    List<Studentv1> findAll();

    List<Studentv1> findRange(int[] range);
    
    List<Studentv1> findByNameAndSurname(String name, String surname);
    
    List<Studentv1> findByQualififcation(String qualification);

    int count();
    
}
