/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Almacen;

import Informacion.Datos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
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
            

         public List<Datos> Leer(){
         String linea;
         Datos Datos;
         if (verificar()){
         
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
         if(!(contenido.size()>0)){
         contenido= null;
         }
         } catch (FileNotFoundException ex) {
         ex.printStackTrace();
         } catch (IOException ex) {
         ex.printStackTrace();
         }   
         }else{
        
          contenido= null;
         }
         return contenido;
         }
         
         public boolean Grabar (List<Datos> lista){
         Convertir convertir = new Convertir();
         boolean estado = true;
         try {
         FileWriter Archivos = new FileWriter("Datos.ang");
         BufferedWriter bw = new BufferedWriter(Archivos);
         for(Datos cadena: lista)
         bw.write(convertir.ajson (cadena)+"\n");
         bw.close();
         Archivos.close();
              
         } catch (IOException ex) {
         ex.printStackTrace();
         estado = false;
         } 
         return estado;
         } 
         
         
         private boolean verificar() {
         File Archivos = new File("datos.ang");  
         if (Archivos.exists())
         return true;
         else
         return false;
         } 
         }
    



