package org.example;


import org.springframework.stereotype.Component;

@Component("hpBean")
public class HarryPotter implements Magician{
    @Override
    public void doMagic() {
        System.out.println("Harry Potter does magic...");
    }
}
