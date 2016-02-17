/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthhub;

import java.util.ArrayList;

/**
 *
 * @author mlb5833
 */
public class AilmentsList {
    private ArrayList<Ailment> ailmentsList;
    
    public AilmentsList() {
        ailmentsList = new ArrayList<Ailment>();
        ailmentsList.add(new Ailment("Flue",1));
        ailmentsList.add(new Ailment("Common Cold",2));
        ailmentsList.add(new Ailment("UTI",3));
        ailmentsList.add(new Ailment("Food Poisoning",4));
        ailmentsList.add(new Ailment("Strep Throat",5));
    }
    
    
}
