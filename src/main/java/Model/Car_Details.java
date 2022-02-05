/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.awt.BorderLayout;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

/**
 *
 * @author vrushankhiremath
 */
public class Car_Details {
    
    private String Brand;
    private String Model;
    private String Color;
    private String Year;
    private String Engine_No;
    private String Seat_Number;
    private String License_plates;
    private String Owner_Name;
    private String Owner_Telephone_number;
    private String Owner_Email_address;
    private String Owner_Driver_license;
    private String Owner_Social_Security_number;
    private String Owner_address;
    private String Service_records;
    private String Warranty_Year;
    private String Photo;
    
    private String path;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public String getEngine_No() {
        return Engine_No;
    }

    public void setEngine_No(String Engine_No) {
        this.Engine_No = Engine_No;
    }

    public String getSeat_Number() {
        return Seat_Number;
    }

    public void setSeat_Number(String Seat_Number) {
        this.Seat_Number = Seat_Number;
    }

    public String getLicense_plates() {
        return License_plates;
    }

    public void setLicense_plates(String License_plates) {
        this.License_plates = License_plates;
    }

    public String getOwner_Name() {
        return Owner_Name;
    }

    public void setOwner_Name(String Owner_Name) {
        this.Owner_Name = Owner_Name;
    }

    public String getOwner_Telephone_number() {
        return Owner_Telephone_number;
    }

    public void setOwner_Telephone_number(String Owner_Telephone_number) {
        this.Owner_Telephone_number = Owner_Telephone_number;
    }

    public String getOwner_Email_address() {
        return Owner_Email_address;
    }

    public void setOwner_Email_address(String Owner_Email_address) {
        this.Owner_Email_address = Owner_Email_address;
    }

    public String getOwner_Driver_license() {
        return Owner_Driver_license;
    }

    public void setOwner_Driver_license(String Owner_Driver_license) {
        this.Owner_Driver_license = Owner_Driver_license;
    }

    public String getOwner_Social_Security_number() {
        return Owner_Social_Security_number;
    }

    public void setOwner_Social_Security_number(String Owner_Social_Security_number) {
        this.Owner_Social_Security_number = Owner_Social_Security_number;
    }

    public String getOwner_address() {
        return Owner_address;
    }

    public void setOwner_address(String Owner_address) {
        this.Owner_address = Owner_address;
    }

    public String getService_records() {
        return Service_records;
    }

    public void setService_records(String Service_records) {
        this.Service_records = Service_records;
    }

    public String getWarranty_Year() {
        return Warranty_Year;
    }

    public void setWarranty_Year(String Warranty_Year) {
        this.Warranty_Year = Warranty_Year;
    }
    
    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }
    
    
}
