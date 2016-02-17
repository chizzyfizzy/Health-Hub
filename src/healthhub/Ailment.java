/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthhub;

/**
 *
 * @author mlb5833
 */
public class Ailment {
    private String ailmentName;
    private int ailmentID;
    
    
    public Ailment(String newAilment, int newID) {
        this.ailmentName = newAilment;
        this.ailmentID = newID;
    }
    
    public String getAilmentName(){
        return this.ailmentName;
    }
    
    public int getAilmentID(){
        return this.ailmentID;
    }
    
    public void setAilmentName(String newAilmentName){
        this.ailmentName = newAilmentName;
    }
    
    public void setAilmentID(int newAilmentID) {
        this.ailmentID = newAilmentID;
    }
    
}
