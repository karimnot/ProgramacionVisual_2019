/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author karimnot
 */
public class Alumno {
    
    private String noControl;
    private String nombre;
    private Carrera carrera;
    private Float promedio;

    public Alumno(String noControl, String nombre, Carrera carrera, Float promedio) {
        this.noControl = noControl;
        this.nombre = nombre;
        this.carrera = carrera;
        this.promedio = promedio;
    }
    
    public String toString(){
        return String.format("%s %s %s %f", noControl, nombre, carrera, promedio);
    }
    
    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Float getPromedio() {
        return promedio;
    }

    public void setPromedio(Float promedio) {
        this.promedio = promedio;
    }
    
    
    
    
}
