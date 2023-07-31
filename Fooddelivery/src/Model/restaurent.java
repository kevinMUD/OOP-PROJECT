/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Gisa
 */
@Entity
public class restaurent implements Serializable {
    @Id
    private String id;
    private String name;
    private String fullAdress;
    private String restoType;
    private byte[] photo;

    public restaurent(String id, String name, String fullAdress, String restoType, byte[] photo) {
        this.id = id;
        this.name = name;
        this.fullAdress = fullAdress;
        this.restoType = restoType;
        this.photo = photo;
    }

    public restaurent() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullAdress() {
        return fullAdress;
    }

    public void setFullAdress(String fullAdress) {
        this.fullAdress = fullAdress;
    }

    public String getRestoType() {
        return restoType;
    }

    public void setRestoType(String restoType) {
        this.restoType = restoType;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
    
    
    
    
}
