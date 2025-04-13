/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entity.bl;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nhlak
 */
@Entity
@Table(name = "STUDENTV1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Studentv1.findAll", query = "SELECT s FROM Studentv1 s")
    , @NamedQuery(name = "Studentv1.findByStudentNumber", query = "SELECT s FROM Studentv1 s WHERE s.studentNumber = :studentNumber")
    , @NamedQuery(name = "Studentv1.findByName", query = "SELECT s FROM Studentv1 s WHERE s.name = :name")
    , @NamedQuery(name = "Studentv1.findBySurname", query = "SELECT s FROM Studentv1 s WHERE s.surname = :surname")
    , @NamedQuery(name = "Studentv1.findByQualification", query = "SELECT s FROM Studentv1 s WHERE s.qualification = :qualification")
    , @NamedQuery(name = "Studentv1.findByBirthdate", query = "SELECT s FROM Studentv1 s WHERE s.birthdate = :birthdate")
    , @NamedQuery(name = "Studentv1.findByTime", query = "SELECT s FROM Studentv1 s WHERE s.time = :time")})
public class Studentv1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "STUDENT_NUMBER")
    private Long studentNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "SURNAME")
    private String surname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "QUALIFICATION")
    private String qualification;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "BIRTHDATE")
    private String birthdate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "TIME")
    private String time;

    public Studentv1() {
    }

    public Studentv1(Long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Studentv1(Long studentNumber, String name, String surname, String qualification, String birthdate, String time) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.surname = surname;
        this.qualification = qualification;
        this.birthdate = birthdate;
        this.time = time;
    }

    public Long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentNumber != null ? studentNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Studentv1)) {
            return false;
        }
        Studentv1 other = (Studentv1) object;
        if ((this.studentNumber == null && other.studentNumber != null) || (this.studentNumber != null && !this.studentNumber.equals(other.studentNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.entity.bl.Studentv1[ studentNumber=" + studentNumber + " ]";
    }
    
}
