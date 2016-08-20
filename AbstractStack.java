/* Universidad del valle de Guatemala
   Algoritmos y estructura de Datos
   Hoja de trabajo 4
   
   Jose Ramirez 
   Jorge Suchite
   viernes 19 de agosto 2016
   Programon el de hoy */
package hdt4;

abstract public class AbstractStack<E> implements IStack<E>
{
      public boolean empty(){
      // post: regresa true si el stack esta vacio
      return Size() == 0;
   }
}