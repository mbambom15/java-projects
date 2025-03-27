package za.ac.tut.model.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2025-03-27T20:58:23")
@StaticMetamodel(Book.class)
public class Book_ { 

    public static volatile SingularAttribute<Book, Integer> noOfPages;
    public static volatile SingularAttribute<Book, Double> price;
    public static volatile SingularAttribute<Book, String> isbn;
    public static volatile SingularAttribute<Book, String> description;
    public static volatile SingularAttribute<Book, Boolean> illustration;
    public static volatile SingularAttribute<Book, Long> id;
    public static volatile SingularAttribute<Book, String> title;
    public static volatile SingularAttribute<Book, Date> creationDate;

}