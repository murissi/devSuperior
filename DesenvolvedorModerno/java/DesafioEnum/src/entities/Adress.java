package entities;

public class Adress {

    private String email;
    private String phone;

    public Adress(String email, Integer telefone) {

    }

    public Adress(String email, String phone) {
        this.email = email;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
