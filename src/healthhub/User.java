/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthhub;

import java.util.Arrays;

/**
 *
 * @author Brad
 */
public class User {
    
    String username;
    char[] password;
    
    public User(String sentUsername, char[] sentPassword){
        username = sentUsername;
        password = sentPassword;
    }
    
    public String getUsername(){
        return username;
    }
    
    public char[] getPassword(){
        return password;
    }
    
    public boolean authenticate(String sentUsername, char[] sentPassword){
        boolean authenticated = false;
        
        if(this.getUsername().equals(sentUsername) && Arrays.equals(this.getPassword(), sentPassword)){
            authenticated = true;
        }
        return authenticated;
    }
}
