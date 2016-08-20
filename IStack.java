/* Universidad del valle de Guatemala
   Algoritmos y estructura de Datos
   Hoja de trabajo 4
   
   Jose Ramirez 
   Jorge Suchite
   viernes 19 de agosto 2016
   Programon el de hoy */
package hdt4;

public interface IStack <E> {

	//Metodos de la interfaz
	public void Push (E element);
	public E Pop();
	public boolean IsEmpty();
	public int Size();
	public E Get();
	
}