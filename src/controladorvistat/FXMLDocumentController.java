/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorvistat;

import datosp.Lanzamiento;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.paint.Stop;
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
        

 

//        while (x = true) {				
//        
//            
//        try {
//            
//            
//	Thread.sleep(4000);
////        Thread.sleep( 4000,9000);
//
//         veces++;
//        valordado1=(int)(Math.random()*6+1);
//        valordado2=(int)(Math.random()*6+1);
//        
//        
//        
//        PilaLanzamientos.apilar(new Lanzamiento(valordado1, valordado2));
//		
//        
//        
//	 System.out.println(valordado1);
//          System.out.println(valordado2);
//          
//          if (veces > 4){
//          x = false;
//          }
//          System.out.println(x);
//          System.out.println(veces);
//          
//    
//           
//	} 
//        
//        catch (InterruptedException e) {
//	
//            e.printStackTrace();
//	
//        } 
//			}
       int valordado1;
       int valordado2;
       int veces=0;    
        
        

           for(int i = 0; i < 4; i++){
            
               try {
// Genera el time linea cada 4 segundos 
                        Thread.sleep(4000);


                        valordado1=(int)(Math.random()*6+1);
                        valordado2=(int)(Math.random()*6+1);
                        
                        PilaLanzamientos.apilar(new Lanzamiento(valordado1, valordado2));

                         System.out.println(valordado1);
                         System.out.println(valordado2);

                         
        
        } catch (InterruptedException e) {
	
            e.printStackTrace();
        }
    }
            System.out.println(x);
            System.out.println(veces);
  }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
         PilaLanzamientos = new Pila<>();
    }    
  

  
    
}
