/** Universidad del valle de Guatemala
   Algoritmos y estructura de Datos
   Hoja de trabajo 4
   
   @author: Jose Ramirez  15441    Jorge Suchite 15293
   viernes 19 de agosto 2016
   Programon el de hoy */

package hdt4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class Calculadora {

    /**
     *
     */
    public StackFactory factor = new StackFactory();
 
    /**
     *
     */
    public IStack<String> miStack = factor.getStack(parametro()); 
        
        int numero;
        double operando1;
        double operando2;
        String sCadenaSinBlancos = "";
        String opcion;
        
   
    public String parametro(){
            opcion = JOptionPane.showInputDialog("Bienvenido a la calculadora POST-FIX\n Usted como todo estudiante UVG ya realizo todo en el archivo de texto, por ello\n quiero que seleccione cual implementacion requiere en esta bella noche en su pilita\n   : \n [1] ArrayList \n [2] Vector \n [3] Lista");
            return opcion;
        }
        File f = new File( "datos.txt" );
        
        BufferedReader entrada;
        
    /**
     *
     */
    public void calcular() {
        try {
       
        entrada = new BufferedReader( new FileReader( f ) );
        String linea;
        
        while(entrada.ready()){
            //Detecta lo que se encuentra en archivo.txt
            linea = entrada.readLine();
            System.out.println(linea);
            
            for (int x=0; x < linea.length(); x++) {
                if (linea.charAt(x) != ' '){
                    //Guarda la cadena sin espacios
                    sCadenaSinBlancos += linea.charAt(x);
                }
            }
            
            //checa que no hayan espacios en lo ingresado
            for(int x=0; x<sCadenaSinBlancos.length(); x++){
                String dato =  Character.toString(sCadenaSinBlancos.charAt(x));
                // ya definidos los simbolos se guardan como dato si no son iguales alos operadores en el txt
                if( (dato.equals("+") || dato.equals("-") || dato.equals("*") || dato.equals("/")) != true){
                    
                    miStack.Push(dato);
                }
                // es una suma saca de la pila los dos ultimos ingresado y realiza operacion
                if(Character.toString(sCadenaSinBlancos.charAt(x)).equals("+")){
                    operando2 = Double.parseDouble(miStack.Pop());
                    operando1 = Double.parseDouble(miStack.Pop());
                    miStack.Push(Double.toString(operando1 + operando2));
                }
                // es una resta saca de la pila los dos ultimos ingresado y realiza operacion
                if(Character.toString(sCadenaSinBlancos.charAt(x)).equals("-")){
                    operando2 = Double.parseDouble(miStack.Pop());
                    operando1 = Double.parseDouble(miStack.Pop());
                    miStack.Push(Double.toString(operando1 - operando2));
                }
                //es una multiplicacion saca de la pila los dos ultimos ingresado y realiza operacion
                if(Character.toString(sCadenaSinBlancos.charAt(x)).equals("*")){
                    operando2 = Double.parseDouble(miStack.Pop());
                    operando1 = Double.parseDouble(miStack.Pop());
                    miStack.Push(Double.toString(operando1 * operando2));
                }
                //es una division saca de la pila los dos ultimos ingresado y realiza operacion
                if(Character.toString(sCadenaSinBlancos.charAt(x)).equals("/")){
                    operando2 = Double.parseDouble(miStack.Pop());
                    operando1 = Double.parseDouble(miStack.Pop());
                    miStack.Push(Double.toString(operando1 / operando2));
                }
                
            }
            // imprimichis el resultadichis
            System.out.println("la respuesta es: " + miStack.Pop());
            
        }
        }catch (IOException e) {
        e.printStackTrace();
        }
        }
    }
	
	
	
	
	
	