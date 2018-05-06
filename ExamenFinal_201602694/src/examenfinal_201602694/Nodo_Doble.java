/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal_201602694;

/**
 *
 * @author Javier
 */
public class Nodo_Doble {
     
     public int dato;
     Nodo_Doble anterior, siguiente;
     
     //Constructor para determinar si no hay nodos en la lista
     public Nodo_Doble(int elemento){
          this(elemento, null, null);
     }
     
     //Constructor para determinar cuando ya hay nodos
     public Nodo_Doble(int elemento, Nodo_Doble sig, Nodo_Doble ant){
          dato = elemento;
          siguiente = sig;
          anterior = ant;
     }
     
}
