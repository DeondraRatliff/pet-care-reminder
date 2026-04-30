package petcare;
/*
 Project: Pet Care Reminder
 Author: Maximillian Smith, Deondra Ratliff, Mi Meh
 Date: 04/30/2026
 Description: This class demonstrates the functionality of the Pet Care Reminder system by creating example objects (User, Pet, Reminder) and displaying their information. The data used is placeholder/example data only.
*/
public class Main {

    public static void main(String[] args) {

        // NOTE: The values below are example placeholder data used only to demonstrate
        // that the classes work together. They are not real user information.

        // Create User (example placeholder data)
        User user = new User(
                "John Doe",
                "johndoe@email.com",
                "123-456-7890"
        );

        // Create Pet (example placeholder data)
        Pet pet = new Pet(
                "Buddy",
                "Dog",
                3
        );

        // Create Reminder (example placeholder data)
        Reminder reminder = new Reminder(
                "Feed Buddy",
                "2026-04-30 08:00",
                "Give breakfast and fresh water"
        );

        // Display output
        System.out.println("=== Pet Care Reminder System ===\n");

        System.out.println("User Information:");
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Phone: " + user.getPhoneNumber());

        System.out.println("\nPet Information:");
        System.out.println("Name: " + pet.getPetName());
        System.out.println("Type: " + pet.getPetType());
        System.out.println("Age: " + pet.getAge());

        System.out.println("\nReminder:");
        System.out.println("Title: " + reminder.getTitle());
        System.out.println("Date/Time: " + reminder.getDateTime());
        System.out.println("Notes: " + reminder.getNotes());
    }
}