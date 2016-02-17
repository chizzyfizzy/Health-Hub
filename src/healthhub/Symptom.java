/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthhub;

/**
 *
 * @author Brad
 */
public class Symptom {
    String name;
    int ailmentID;
    
    public Symptom(String sName, int aID){
        name = sName;
        ailmentID = aID;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAilmentID(){
        return ailmentID;
    }
    
    
}
