/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alexander
 */
@Entity
@Table(name = "favourites")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Favourites.findAll", query = "SELECT f FROM Favourites f"),
    @NamedQuery(name = "Favourites.findById", query = "SELECT f FROM Favourites f WHERE f.id = :id"),
    @NamedQuery(name = "Favourites.findByUsername", query = "SELECT f FROM Favourites f WHERE f.username = :username"),
    @NamedQuery(name = "Favourites.findByListingnumber", query = "SELECT f FROM Favourites f WHERE f.listingnumber = :listingnumber")})
public class Favourites implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "listingnumber")
    private String listingnumber;

    public Favourites() {
    }

    public Favourites(Integer id) {
        this.id = id;
    }

    public Favourites(Integer id, String username, String listingnumber) {
        this.id = id;
        this.username = username;
        this.listingnumber = listingnumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getListingnumber() {
        return listingnumber;
    }

    public void setListingnumber(String listingnumber) {
        this.listingnumber = listingnumber;
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
        if (!(object instanceof Favourites)) {
            return false;
        }
        Favourites other = (Favourites) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Classes.Favourites[ id=" + id + " ]";
    }
    
}
