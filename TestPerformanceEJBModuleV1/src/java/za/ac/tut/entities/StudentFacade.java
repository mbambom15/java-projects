package za.ac.tut.entities;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class StudentFacade extends AbstractFacade<Student> implements StudentFacadeLocal {

    @PersistenceContext(unitName = "TestPerformanceEJBModuleV1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StudentFacade() {
        super(Student.class);
    }

    @Override
    public Integer cntAllMaleStudents() {
        Query query = em.createQuery("SELECT COUNT(s) FROM Student s WHERE s.gender = 'M'");
        Long cnt = (Long) query.getSingleResult();
        return cnt.intValue();
    }

    @Override
    public Integer cntAllFemaleStudents() {
        Query query = em.createQuery("SELECT COUNT(s) FROM Student s WHERE s.gender = 'F'");
        Long cnt = (Long) query.getSingleResult();
        return cnt.intValue();
    }

    @Override
    public Integer cntAllPassedStudents() {
        Query query = em.createQuery("SELECT COUNT(s) FROM Student s WHERE s.percMarkObtained > 50");
        Long cnt = (Long) query.getSingleResult();
        return cnt.intValue();
    }

    @Override
    public Integer cntAllFailedStudents() {
        Query query = em.createQuery("SELECT COUNT(s) FROM Student s WHERE s.percMarkObtained < 50");
        Long cnt = (Long) query.getSingleResult();
        return cnt.intValue();
    }

    @Override
    public Integer cntAllPassedMaleStudents() {
        Query query = em.createQuery("SELECT COUNT(s) FROM Student s WHERE s.percMarkObtained > 50 AND s.gender = 'M'");
        Long cnt = (Long) query.getSingleResult();
        return cnt.intValue();
    }

    @Override
    public Integer cntAllPassedFemaleStudents() {
        Query query = em.createQuery("SELECT COUNT(s) FROM Student s WHERE s.percMarkObtained > 50 AND s.gender = 'F'");
        Long cnt = (Long) query.getSingleResult();
        return cnt.intValue();
    }

    @Override
    public Integer cntAllFailedMaleStudents() {
        Query query = em.createQuery("SELECT COUNT(s) FROM Student s WHERE s.percMarkObtained < 50 AND s.gender = 'M'");
        Long cnt = (Long) query.getSingleResult();
        return cnt.intValue();
    }

    @Override
    public Integer cntAllFailedFemaleStudents() {
        Query query = em.createQuery("SELECT COUNT(s) FROM Student s WHERE s.percMarkObtained < 50 AND s.gender = 'F'");
        Long cnt = (Long) query.getSingleResult();
        return cnt.intValue();
    }

    @Override
    public List<Student> findStudentsWithinAgeRange(Integer minAge, Integer maxAge) {
        Query query = em.createQuery("SELECT s FROM Student s WHERE s.age >= :minAge AND s.age <= :maxAge");
        query.setParameter("minAge", minAge);
        query.setParameter("maxAge", maxAge);
        return query.getResultList();
    }

    @Override
    public Double getHighestMark() {
        Query query = em.createQuery("SELECT MAX(s.percMarkObtained) FROM Student s");
        Double maxMark = (Double) query.getSingleResult();
        return (maxMark != null) ? maxMark : 0.0;
    }

    @Override
    public Double getLowestMark() {
        Query query = em.createQuery("SELECT MIN(s.percMarkObtained) FROM Student s");
        Double minMark = (Double) query.getSingleResult();
        return (minMark != null) ? minMark : 0.0;
    }

    @Override
    public Double getAverageMark() {
        Query query = em.createQuery("SELECT AVG(s.percMarkObtained) FROM Student s");
        Double avgMark = (Double) query.getSingleResult();
        return (avgMark != null) ? avgMark : 0.0;
    }

    @Override
    public Student find(String name, String surname) {
        Query query = em.createQuery("SELECT s FROM Student s WHERE s.name = :name AND s.surname = :surname");
        query.setParameter("name", name);
        query.setParameter("surname", surname);
        return (Student) query.getSingleResult();

    }

}
