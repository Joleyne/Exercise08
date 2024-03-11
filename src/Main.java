import java.util.ArrayList;
import java.util.Scanner;

//Joleyne Hernandez CSCI1660 03/08/24
public class Main {
    public static void main(String[] args) {
        ArrayList<Contact> Collection = new ArrayList<>();


        Contact contact1 = new Contact("klsd", "dsgf");
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


        Collection.add(contact1);
        Collection.add(contact2);
        Collection.add(bContact1);
        Collection.add(newPerson);

        System.out.println("\n-----------------Contact Information--------------------\n");
        for (int i = 0; i < Collection.size(); i++) {
            System.out.println(Collection.get(i));

        }
    }
}