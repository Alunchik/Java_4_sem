package org.example;
import org.springframework.stereotype.Component;


@Component("ronWeeslyBean")
public class RonWeesly implements Magician{

    @Override
    public void doMagic() {
        System.out.println("Roon Weesly does magic...");
    }
}
