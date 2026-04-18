package petcare;

/*
 Project: Pet Care Reminder
 Author: Maximillian Smith
 Date: 04/17/2026
 Description: This class represents a reminder for pet care tasks such as feeding or medication.
*/

public class Reminder {
    
// Attributes
    private String title;
    private String dateTime;
    private String notes;


    // Constructor - default
    public Reminder() {
    }


    // Constructor - parameterized
    public Reminder(String title, String dateTime, String notes) {
        this.title = title;
        this.dateTime = dateTime;
        this.notes = notes;
    }


    // Gets the reminder title
    public String getTitle() {
        return title;
    }


    // Sets the reminder title
    public void setTitle(String title) {
        this.title = title;
    }


    // Gets the date and time
    public String getDateTime() {
        return dateTime;
    }


    // Sets the date and time
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }


    // Gets the notes
    public String getNotes() {
        return notes;
    }


    // Sets the notes
    public void setNotes(String notes) {
        this.notes = notes;
    }
}