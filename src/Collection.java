import java.util.ArrayList;

public class Collection extends Contact {
    private ArrayList<Contact> list;
    public Collection(String name, String email, String number) {
        super(name, email);
        this.list = new ArrayList<>();
    }
    public void newContact(Contact contact){list.add(contact);}

    @Override
    public String toString() {
        return "Collection{" +
                "list=" + list +
                '}';
    }

    @Override
    public void display() {
        for (Contact c : this.list) {
            c.display();
        }
    }
}
