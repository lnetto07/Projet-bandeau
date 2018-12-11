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
public abstract class Effet {
    
    public String texte;
    
    public Effet(String t){
        this.texte=t;
    }
    
    abstract void afficheToiSur(Bandeau b);
    
}
