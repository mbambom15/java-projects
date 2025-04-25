/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entity.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entity.Industry;

/**
 *
 * @author nhlak
 */
@Local
public interface IndustryFacadeLocal {

    void create(Industry industry);

    void edit(Industry industry);

    void remove(Industry industry);

    Industry find(Object id);

    List<Industry> findAll();

    List<Industry> findRange(int[] range);

    int count();
    
}
