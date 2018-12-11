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

import java.util.LinkedList;
import java.util.List;

public class Scenario {
    List<Effet> listeEffets=new LinkedList<>();
    List<Integer> listeRepet=new LinkedList<>();
    
    public void addEffect(Effet e, Integer repet){
        listeEffets.add(e);
        listeRepet.add(repet); 
    }
    
    public void playOn(Bandeau b){
        for(int i=0;i<listeEffets.size();i++){
            for (int j=0; j<listeRepet.get(i);j++){
                listeEffets.get(i).afficheToiSur(b);
            }
        }
    } 
}
