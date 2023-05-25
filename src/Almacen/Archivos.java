/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Almacen;
import Informacion.Datos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author danie
 */
public class Archivos {
    
     List<Datos> contenido = new ArrayList<>();
            
  public List<Datos> Leer() throws IOException{
         String linea  = null;
         Datos Datos;
        try {
           FileReader Archivos = new FileReader("Datos.ang");
           BufferedReader br = new BufferedReader(Archivos);
           while((linea =br.readLine()) != null){
          Datos = new Datos();
             Convertir Convertir = new Convertir();
             Datos = Convertir.aclase(linea);
             contenido.add(Datos);
         
         
        }
           br .close();
            Archivos.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            FileWriter Archivos = new FileWriter ("Datos.ang");
             BufferedWriter bw = new BufferedWriter(Archivos);
            bw .close();
            Archivos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
                
            }
             return contenido;
        }
   
    public boolean Grabar(Datos cadena) throws IOException{
      Convertir convertir = new Convertir();
      boolean estado = true;
      try {
          FileWriter Archivos = new FileWriter("Datos.ang", true);
              BufferedWriter bw = new BufferedWriter(Archivos);
              bw.write(convertir.ajson (cadena)+"\n");
              bw.close();

            } catch (IOException ex) {
            ex.printStackTrace();
           
        } 
        return estado;
  }
   

}





