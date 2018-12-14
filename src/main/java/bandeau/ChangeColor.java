/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/**
 *
 * @author lnetto
 */
import java.awt.Color;
import java.util.Random;

public class ChangeColor extends Effet{
    
    public ChangeColor(String t) {
        super(t);
    }
    
    
    @Override
    public void afficheToiSur(Bandeau ba){
        Random random =new Random();
        int r= random.nextInt(255);
        int g=random.nextInt(255);
        int b=random.nextInt(255);
        Color c=new Color(r,g,b);
        ba.setForeground(c);
        ba.sleep(500);
    }
    
}
