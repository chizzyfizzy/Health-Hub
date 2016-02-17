/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthhub;
import java.util.ArrayList;

/**
 *
 * @author Brad
 */
public class UserList {
    
    private ArrayList<User> theUserList;
    
    
    public UserList(){
        this.theUserList = new ArrayList();
        for(int i =0;i<5;i++){
            String username = "User"+i;
            char[] password = {'a','d','m','i','n'};
            User newUser = new User(username, password);
            theUserList.add(newUser);
        }
    }
    
    public boolean authenticate(String sentUsername, char[] sentPassword){
        boolean authenticated = false;
        int size = this.theUserList.size();
        
        for(int i = 0; i<size;i++){
            if(this.theUserList.get(i).authenticate(sentUsername, sentPassword)){
                authenticated = true;
                break;
            }
        }
        return authenticated;
    }
}
