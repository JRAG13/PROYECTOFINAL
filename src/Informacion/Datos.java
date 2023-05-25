/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Informacion;

/**
 *
 * @author danie
 */
public class Datos {
     String nombre;
    String fecha;
    String curp;

    public Datos(String nombre, String fecha, String curp) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.curp = curp;
    }

    public Datos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getfecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp= curp;
    }
    
    
}
