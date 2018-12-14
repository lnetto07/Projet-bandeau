/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.lang.Math;
/**
 *
 * @author lnetto
 */
public class Turn extends Effet {
    
    public int sens;
    public double teta;
    
    public Turn(String texte, int s, int tet) {
        super(texte);
        this.sens=s;
        this.teta=tet;
        
    }

    @Override
    void afficheToiSur(Bandeau b) {
        b.setMessage(texte);
        double d=Math.toRadians((double)teta);
	for (int i = 0; i <= 50; i++) {
		b.setRotation((sens*d*i/50));
		b.sleep(50);
    }
    
}
}
