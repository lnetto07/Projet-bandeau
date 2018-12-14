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
public class Main {
 
    public static void main(String[] args) {
        Bandeau b = new Bandeau();
        Scenario s=new Scenario();
        s.addEffect(new Zoom(3,"Zoom"), 1);
        s.addEffect(new ChangerPolice("Monospaced",25,"Bold","Police"),1);
        s.addEffect(new ChangeColor("On change de couleur"), 5);
        s.addEffect(new Turn("Tourne",-1,180),3);
        s.playOn(b);
    }
    
}
