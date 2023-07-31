/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.*;

/**
 *
 * @author Gisa
 */
@Entity
public class menu {
    @Id
    private String name;
    private String description;
    private String items;
    private byte[] photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public menu(String name, String description, String items, byte[] photo) {
        this.name = name;
        this.description = description;
        this.items = items;
        this.photo = photo;
    }

    public menu() {
    }

    
    
}
