package Exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private String email;
    private String date;

    private List<Order> orders = new ArrayList<>();


    public Client() {

    }


    public Client(String name, String email, String date) {
        this.name = name;
        this.email = email;
        this.date = date;
    }




}
