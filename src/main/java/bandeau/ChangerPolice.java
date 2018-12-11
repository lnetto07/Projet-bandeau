/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Font;

/**
 *
 * @author lnetto
 */
public class ChangerPolice extends Effet {

    String newFont;
    int taille;
    String style;
    Font f;

    public ChangerPolice(String font, int t, String s, String texte) {
        super(texte);
        this.newFont = font;
        this.taille = t;
        this.style = s;
        switch (style) {
            case "Bold":
                f = new Font(newFont, Font.BOLD, t);
                break;
            case "Italic":
                f = new Font(newFont, Font.ITALIC, t);
                break;
            default:
                f = new Font(newFont, Font.PLAIN, t);
                break;
        }

    }

    @Override
    void afficheToiSur(Bandeau b) {
        b.setMessage(texte);
        b.sleep(500); 
        b.setFont(f);
        b.sleep(1000);
    }

}
