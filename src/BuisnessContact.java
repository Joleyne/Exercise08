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
    public String toString(){
        return "Name: " + this.getName() + "\nEmail: " + this.getEmail() + "\nPhone Number: " + this.getNumber() + "\n";


    }
}