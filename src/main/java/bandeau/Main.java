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
        s.addEffect(new Zoom(5,"Zoom"), 1);
        s.addEffect(new ChangerPolice("Monospaced",15,"Bold","Police"),1);
        s.playOn(b);
    }
    
}
