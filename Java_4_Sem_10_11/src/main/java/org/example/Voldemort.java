package org.example;


import org.springframework.stereotype.Component;

@Component("voldemortBean")
public class Voldemort implements Magician{
    @Override
    public void doMagic() {
        System.out.println("Voldemort does dark magic.....");
    }
}
