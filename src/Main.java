import java.util.Scanner;

//Joleyne Hernandez CSCI1660 02/27/24
public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact("klsd","dsgf");
        Contact contact2 = new Contact("John Bilovep", "JohnnyBi@gmail.com");
        BuisnessContact bContact1 = new BuisnessContact("Kaleb Chester", "kChester@gmail.com", "614-673-5643");
        Scanner input = new Scanner(System.in);


        System.out.println("What's your name");
        String contact = input.nextLine();
        System.out.println("What's the email address of " + contact + "?");
        String userEmail = input.nextLine();
        System.out.println("What is your phone number?");
        String phoneNum = input.nextLine();
        BuisnessContact newPerson = new BuisnessContact(contact, userEmail, phoneNum);

        newPerson.display();

        contact1.display();
        contact2.display();
        bContact1.display();


    }
}