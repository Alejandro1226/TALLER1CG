/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorvistat;

import com.sun.javafx.scene.layout.region.Margins;
import datosp.Lanzamiento;
import java.net.HttpCookie;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.paint.Stop;
import javax.swing.JOptionPane;
import pila.Pila;
import sun.misc.VM;

/**
 *
 * @author usuario
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private TextArea tx1;
    
    boolean x  = true;
    
    
    
     Pila <Lanzamiento> PilaLanzamientos;
     
    
    @FXML 
      private void Parar(ActionEvent event){
     
          x=false;
      
      }
      
      
      
    @FXML
    private void generarvalores(ActionEvent event) {
        

 

       int valordado1;
       int valordado2;
  
       String res ="";

           for(int i = 0; i < 4; i++){
            
               try {
                   
                   res = "";
                       // Genera el time linea cada 4 segundos 
                        Thread.sleep(4000);

                        // Genera numeros aleatorios del 1 al 6 
                        valordado1=(int)(Math.random()*6+1);
                        valordado2=(int)(Math.random()*6+1);
                        
                        // apilando los valores del dado 1 y dado 2 en la pila
                        PilaLanzamientos.apilar(new Lanzamiento(valordado1, valordado2));

                        // Imprime en consola
                        
                         System.out.println(valordado1);
                         System.out.println(valordado2);
                         res += Integer.toString(valordado1)+ Integer.toString(valordado2)+ ";\n";
                         
                         tx1.setText(res.replace(";", "\n"));
                         //PRUEBAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA

                         
        
        } catch (InterruptedException e) {
	
            e.printStackTrace();
        }
               
    }
         tx1.clear();
         tx1.setText(PilaLanzamientos.toString());
            
  }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
         PilaLanzamientos = new Pila<>();
    }    
  

  
    
}
