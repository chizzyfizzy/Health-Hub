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
public class LoginCntl {
    
    LoginUI theLoginUI;
    UserList theUserList;
    NavigationCntl theNavigationCntl;
    
    public LoginCntl(){
        initCustomComponents();
        this.showLoginUI();
    }
    
    private void initCustomComponents(){
        theUserList = new UserList();
    }
    
    private void showLoginUI(){
        theLoginUI = new LoginUI(this);
        theLoginUI.setLocationRelativeTo(null);
        theLoginUI.setVisible(true);
    }
    
    protected boolean requestAuthenticate(String sentUsername, char[] sentPassword){
        boolean authenticated = false;
        if(theUserList.authenticate(sentUsername, sentPassword) ){
            System.out.println("Debug Statement: Authenticated!");
            theLoginUI.setVisible(false);
            theLoginUI.dispose();
            theNavigationCntl = new NavigationCntl();
            authenticated = true;
        }
        return authenticated;
    }
}
