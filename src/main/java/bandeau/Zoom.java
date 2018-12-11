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
public class Zoom extends Effet {
    
    public int coefficient;
    
    public Zoom(int coef, String texte){
        super(texte);
        this.coefficient=coef;
    }

    @Override
    void afficheToiSur(Bandeau b) {
        b.setMessage(texte);
        b.sleep(500);
        int a= b.getFont().getSize();
        for (int i = a; i < a*coefficient ; i+=2) {
            b.setFont(b.getFont().deriveFont(i));
            b.sleep(100);
	}
    }
    
}
