/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
        
        cargarAlumnos();
    }
    
    private void cargarAlumnos(){
        try {
            File file = new File("alumnitos.dat");
            if (!file.exists()){
                alumnos = new ArrayList<>();
            }else{
                FileInputStream stream = new FileInputStream(file);
                ObjectInputStream input = new ObjectInputStream(stream);
                
                alumnos = (ArrayList<Alumno>)input.readObject();
                
                input.close();
                stream.close();
            }
            
        } catch (Exception e) {
        }

    }
    
    public void agregar(Alumno alumno){
        alumnos.add(alumno);
    }
    
    public Alumno obtenerAlumno(int index){
        return alumnos.get(index);
    }
    
    
    public void eliminar(int index){
        alumnos.remove(index);
    }
    
    public ArrayList<Alumno> obtenerAlumnos(){
        return alumnos;
    }
    
    public void guardar(){
        try {
            File file = new File("alumnitos.dat");
            FileOutputStream stream = new FileOutputStream(file);
            ObjectOutputStream output = new ObjectOutputStream(stream);  
            
            output.writeObject(alumnos);
            
            output.close();
            stream.close();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    
}
