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
public class NavigationCntl {
    
    NavigationUI theNavigationUI;
    
    public NavigationCntl(){
        this.showNavigationUI();
    }
    
    private void showNavigationUI(){
        theNavigationUI = new NavigationUI(this);
        theNavigationUI.setLocationRelativeTo(null);
        theNavigationUI.setVisible(true);
    }
    
}
