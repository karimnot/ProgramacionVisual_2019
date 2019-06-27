/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controller.Controlador;
import gui.AlumnosFrame;
import javax.swing.SwingUtilities;
import objects.Alumno;
import objects.Carrera;

/**
 *
 * @author karimnot
 */
public class Principal {
    
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                AlumnosFrame af = new AlumnosFrame();
                af.setVisible(true);
            }
        });
        
        

        
        
        
    }
    
}
