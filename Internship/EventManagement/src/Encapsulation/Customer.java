package Encapsulation;

public class Customer {

    private String firstname;
    private String lastname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setFirstname("mandeep");
        c1.setLastname("patel");

        System.out.println(c1.getFirstname() + " " + c1.getLastname());
    }
}
