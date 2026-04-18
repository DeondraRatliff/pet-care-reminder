/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petcare;

/**
 Project: Pet Care Reminder
 Author: Mi Meh
 Date: 04/17/2026
 Description: This class represents the different types of pets.
 */

public class Pet {
    
    // Attributes
    private String petName;
    private String petType;
    private int age;
    
    // Constructor
    public Pet() {
    }
    
    public Pet(String petName, String petType, int age) {
        this.petName = petName;
        this.petType = petType;
        this.age = age;
    }
    
    // Retreiving the pet's name
    public String getPetName() {
        return petName;
    }
    
    // Setting the pet's name
    public void setPetName(String petName) {
        this.petName = petName;
    }
    
    // Type of pets (dog, cats, bird, reptiles..)
    public String getPetType() {
        return petType;
    }
    
    // Setting the type of pet
    public void setPetType(String petType) {
        this.petType = petType;
    }
    
    // Retreive the pet's age
    public int getAge() {
        return age;
    }
    
    // Setting the pet's age
    public void setAge(int age) {
        this.age = age;
    }
}
