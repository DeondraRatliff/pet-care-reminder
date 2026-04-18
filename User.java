/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petcare;

/*
 Project: Pet Care Reminder
 Author: Deondra Ratliff
 Date: 04/17/2026
 Description: This class represents a user who owns pets and manages pet care reminders.
*/
public class User {
    
// Attributes
    private String name;
    private String email;
    private String phoneNumber;


    // Default constructor
    public User() {
    }


    // Parameterized constructor
    public User(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    // Gets the user's name
    public String getName() {
        return name;
    }


    // Sets the user's name
    public void setName(String name) {
        this.name = name;
    }


    // Gets the user's email
    public String getEmail() {
        return email;
    }


    // Sets the user's email
    public void setEmail(String email) {
        this.email = email;
    }


    // Gets the user's phone number
    public String getPhoneNumber() {
        return phoneNumber;
    }


    // Sets the user's phone number
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
