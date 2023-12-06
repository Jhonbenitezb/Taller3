/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parcial3;
import static spark.Spark.*;
import com.google.gson.Gson;
import java.util.LinkedList;

public class Parcial3 {

    public static void main(String[] args) {
        
         LinkedList <Lector> lectores = new LinkedList<>();
         LinkedList <Copia> copias = new LinkedList<>();
         LinkedList <Libro> libros = new LinkedList<>();
         
         Libro libro1 = new Libro("Señor anillos","Novela","2323",0);
         libros.add(libro1);
         Libro libro2 = new Libro("thor","Novela","2323",0);
         libros.add(libro2);
         Lector lector1 = new Lector("102","Esteban","Hurtado","cll69n");
         lectores.add(lector1);
         Lector lector2 = new Lector("231","Juan","Perez","cll69n");
         lectores.add(lector2);
         Copia copia1 = new Copia("34","Disponible");
         copias.add(copia1);
         Copia copia2 = new Copia("45","Disponible");
         copias.add(copia2);
         
         
         get("/PrestarLibro/:numSocio/:identificadorCopia", (req, res) -> {
            
            res.type("application/json");
           
            String numSocio = req.params(":numSocio");
            String identificador = req.params(":identificadorCopia");
            
            for(int i=0; i<copias.size(); i++){
            if(copias.get(i).identificador.equals(identificador)){
                copias.get(i).lectorRef.(lectores.get(i));
                
            }
            }


            
            for(int i=0; i<lectores.size(); i++){
            if(lectores.get(i).numSocio.equals(numSocio) && copias.size()<3){
                lectores.get(i).copiaLec.add(copia2);
            }
            }
            

            return gson.toJson(lectores);
        });
    }
}
