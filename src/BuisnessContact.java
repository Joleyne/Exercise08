public class BuisnessContact extends Contact{

    private String number;

    public BuisnessContact(String name, String email, String number) {
        super(name, email);
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(getName()+ " phone numbers is "+ number);

    }
}