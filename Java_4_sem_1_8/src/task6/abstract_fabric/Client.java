package task6.abstract_fabric;

import java.util.Scanner;

public class Client {
    private  Product product;

    public Client(Factory factory){
        System.out.println("Enter type of product A or B");
        String type = new Scanner(System.in).next();
        switch(type){
            case "A":         this.product = factory.createProductA();
                break;
            case "B": this.product = factory.createProductB();
            break;
            default:
                System.out.println("Wrong type entered");
                break;
        }
    }
}
