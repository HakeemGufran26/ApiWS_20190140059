/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tugasakhirHakeem.tugasakhirHakeem;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "pejualan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pejualan.findAll", query = "SELECT p FROM Pejualan p"),
    @NamedQuery(name = "Pejualan.findById", query = "SELECT p FROM Pejualan p WHERE p.id = :id"),
    @NamedQuery(name = "Pejualan.findByNamaCustomer", query = "SELECT p FROM Pejualan p WHERE p.namaCustomer = :namaCustomer"),
    @NamedQuery(name = "Pejualan.findByAlamatCustomer", query = "SELECT p FROM Pejualan p WHERE p.alamatCustomer = :alamatCustomer"),
    @NamedQuery(name = "Pejualan.findByNoTelp", query = "SELECT p FROM Pejualan p WHERE p.noTelp = :noTelp"),
    @NamedQuery(name = "Pejualan.findByNamaBarang", query = "SELECT p FROM Pejualan p WHERE p.namaBarang = :namaBarang")})
public class Pejualan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "Nama_Customer")
    private String namaCustomer;
    @Column(name = "Alamat_Customer")
    private String alamatCustomer;
    @Column(name = "No_Telp")
    private String noTelp;
    @Column(name = "Nama_Barang")
    private String namaBarang;

    public Pejualan() {
    }

    public Pejualan(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaCustomer() {
        return namaCustomer;
    }

    public void setNamaCustomer(String namaCustomer) {
        this.namaCustomer = namaCustomer;
    }

    public String getAlamatCustomer() {
        return alamatCustomer;
    }

    public void setAlamatCustomer(String alamatCustomer) {
        this.alamatCustomer = alamatCustomer;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
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
        if (!(object instanceof Pejualan)) {
            return false;
        }
        Pejualan other = (Pejualan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tugasakhirHakeem.tugasakhirHakeem.Pejualan[ id=" + id + " ]";
    }
    
}
