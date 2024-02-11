/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import javax.swing.ImageIcon;

/**
 *
 * @author Farid
 */
public class User {
    private String firstName;
    private String lastName;
    private String age;
    private String email;
    private String gender = "";
    private String type;
    private String message;
    private File selectedFile;
    private ImageIcon img;
    //private String photo;

    
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public File getSelectedFile() {
        return selectedFile;
    }
    public void setSelectedFile(File selectedFile) {
        this.selectedFile = selectedFile;
    }

    /**
     * @return the img
     */
    public ImageIcon getImg() {
        return img;
    }
    public void setImg(ImageIcon img) {
        this.img = img;
    }
    
}
