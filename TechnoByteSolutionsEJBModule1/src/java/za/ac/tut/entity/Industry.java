/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author nhlak
 */
@Entity
@Table(name = "Industry")
public class Industry implements Serializable {

    @Id
    private Long id;
    @Column(name = "comp_name", nullable = false, length = 100)
    private String comp_name;

    @Column(name = "title1", nullable = false, length = 100)
    private String title1;
    @Column(name = "desc1", nullable = false, length = 100)
    private String desc1;

    @Column(name = "title2", nullable = false, length = 100)
    private String title2;
    @Column(name = "desc2", nullable = false, length = 100)
    private String desc2;

    @Column(name = "title3", nullable = false, length = 100)
    private String title3;
    @Column(name = "desc3", nullable = false, length = 100)
    private String desc3;

    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    public Industry() {
    }

    public Industry(Long id, String comp_name, String title1, String desc1, String title2, String desc2, String title3, String desc3, Date timestamp) {
        this.id = id;
        this.comp_name = comp_name;
        this.title1 = title1;
        this.desc1 = desc1;
        this.title2 = title2;
        this.desc2 = desc2;
        this.title3 = title3;
        this.desc3 = desc3;
        this.timestamp = timestamp;
    }

    public String getComp_name() {
        return comp_name;
    }

    public void setComp_name(String comp_name) {
        this.comp_name = comp_name;
    }

    public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public String getDesc1() {
        return desc1;
    }

    public void setDesc1(String desc1) {
        this.desc1 = desc1;
    }

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    public String getDesc2() {
        return desc2;
    }

    public void setDesc2(String desc2) {
        this.desc2 = desc2;
    }

    public String getTitle3() {
        return title3;
    }

    public void setTitle3(String title3) {
        this.title3 = title3;
    }

    public String getDesc3() {
        return desc3;
    }

    public void setDesc3(String desc3) {
        this.desc3 = desc3;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Industry)) {
            return false;
        }
        Industry other = (Industry) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.entity.Industry[ id=" + id + " ]";
    }

}
