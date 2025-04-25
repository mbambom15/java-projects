/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entity.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entity.Faculty;

/**
 *
 * @author nhlak
 */
@Local
public interface FacultyFacadeLocal {

    void create(Faculty faculty);

    void edit(Faculty faculty);

    void remove(Faculty faculty);

    Faculty find(Object id);

    List<Faculty> findAll();

    List<Faculty> findRange(int[] range);

    int count();
    
}
