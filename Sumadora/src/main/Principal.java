package main;

import gui.PrincipalFrame;
import javax.swing.SwingUtilities;

public class Principal{
    
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                PrincipalFrame pf = new PrincipalFrame();
                pf.setVisible(true);
            }
        });
        
        
    }
    
}