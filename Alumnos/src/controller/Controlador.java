/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import objects.Alumno;
import objects.Carrera;

/**
 *
 * @author karimnot
 */
public class Controlador {
    
    private ArrayList<Alumno> alumnos;
    
    public Controlador(){
        alumnos = new ArrayList<>();
        cargarAlumnos();
    }
    
    private void cargarAlumnos(){
        
        
        Alumno a = new Alumno("99160977", "Daniel Karim Ricardez", Carrera.SISTEMAS, (float)9.8);
        
        
        agregar(a);
        
        Alumno b = new Alumno("09292929", "Agabus Galvan Garza", Carrera.SISTEMAS, (float)4.3);
       
        agregar(b);
        
        

       
    }
    
    public void agregar(Alumno alumno){
        alumnos.add(alumno);
    }
    
    public ArrayList<Alumno> obtenerAlumnos(){
        return alumnos;
    }
    
}
