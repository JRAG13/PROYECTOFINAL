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
    String apellidop;
    String apellidom;
   
    String correo;
    String sexo;
    String rfc;
    String ed;
    String munic;
    String col;
    String calle;
    String cp;
    
    
    public Datos(String nombre,String apellidop,String apellidom, String correo,String sexo, String fecha, String curp,String rfc, String ed, String munic, String col, String calle, String cp) {
        
        
    this.nombre = nombre;
    this.fecha = fecha;
    this.curp = curp;
    this.apellidop = apellidop;
    this.apellidom = apellidom;
 
    this.correo = correo;
    this.sexo = sexo;
   this.rfc= rfc;
    this.ed=ed;
    this.munic=munic;
    this.col=col;
    this.calle=calle;
    this.cp=cp;
     
    }

    public Datos(){
    }

    public String getNombre(){
    return nombre;
    }

    public void setNombre(String nombre){
    this.nombre = nombre;
        
    }
     public String getapellidop(){
     return apellidop;
    }

    public void setapellidop(String apellidop){
    this.apellidop = apellidop;
    }
    public String getapellidom(){
    return apellidom;
    }

    public void setapellidom(String apellidom){
    this.apellidom = apellidom;
        
    }
    
    
    public String getcorreo(){
    return correo;
    }

    public void setcorreo(String correo){
    this.correo = correo;
    }
    public String getsexo(){
    return sexo;
    }

    public void setsexo(String sexo){
    this.sexo = sexo;
    }
    public String getCurp() {
    return curp;
    }

    public void setCurp(String curp){
    this.curp= curp;
    }
    public String getfecha() {
    return fecha;
    }

    public void setFecha(String fecha){
    this.fecha = fecha;
 }    
   public String getrfc() {
    return rfc;
    }

    public void setrfc(String rfc){
    this.rfc = rfc;
    }
    public String geted(){
    return ed;
    }

    public void seted(String ed){
    this.ed = ed;
    }  
    public String getmunic(){
    return munic;
    }

    public void setmunic(String munic){
    this.munic = munic;
        
 }
     public String getcol(){
    return col;
    }

    public void setcol(String col){
    this.munic = col;
    }
     public String getcalle(){
    return calle;
    }

    public void setcalle(String calle){
    this.calle = calle;
    }
     public String getcp(){
    return cp;
    }

    public void setcp(String cp){
    this.cp = cp;
    }
  
    
}

