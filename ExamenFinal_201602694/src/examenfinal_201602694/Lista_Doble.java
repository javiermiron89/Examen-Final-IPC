/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal_201602694;

import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class Lista_Doble {
     
     //Se crean los dos punteros del nodo
     private Nodo_Doble inicio, fin;
     
     //Constructor por defecto, el cual inicializa a inicio y a fin con el valor null
     public Lista_Doble(){
          inicio = fin = null;
     }
     
     //Metodo para verificar si la lista esta vacia
     public boolean estaVacia(){
          //Regresa informacion para saver si la lista esta vacio
          return inicio == null;
     }
     
     //Metodo para mostra la lista de inicio a fin
     public void MostrarListaDobleInicioFin(){
          //Verificar si no esta vacia la lista
          if (!estaVacia()) {
               //Mostrar la lista en un JOptionPane
               String datos = "<=>";
               //Se crea un Nodo_Doble auxiliar, el cual lo apuntamos a inicio
               Nodo_Doble auxiliar = inicio;
               //Mientras auxialir sea diferente de nulo, mostrar los datos
               while (auxiliar != null) {
               //Se concatenan los datos
               datos = datos + "[" + auxiliar.dato + "]<=>";
               //Recorrer el auxiliar hacia adelante (Siguiente)
               auxiliar = auxiliar.siguiente;
               }
               //Cuando termine de reccorrer, se mostrara mensaje ocn los datos
               JOptionPane.showMessageDialog(null, datos, "Mostrar Elementos de inicio a fin", JOptionPane.INFORMATION_MESSAGE);
          }
     }
     
     //Metodo para insertar datos al inicio
     public void InsertarAlInicio(int elemento){
          //Verifica si la lista tiene un nodo en ella
          if (!estaVacia()) {
               //Recibira 3 parametros
               //1. el elemto recibido
               //2. el puntero que apunta a inicio
               //3. el puntero que esta apuntado hacia null
               inicio = new Nodo_Doble(elemento, inicio, null);
               //Apuntar inicio de anterior de siguiente a inicio
               inicio.siguiente.anterior = inicio;
          } else {
               inicio = fin = new Nodo_Doble(elemento);
          }
     }
     
     //Metodo para insertar datos al final
     public void InsertarAlFinal(int elemento){
          //Verifica si la lista tiene un nodo en ella
          if (!estaVacia()) {
               //Recibira 3 parametros
               //1. el elemto recibido int
               //2. el puntero que apunta a null
               //3. el puntero que esta apuntando a el anterior
               fin = new Nodo_Doble(elemento, null, fin);
               //Apuntar fin de anterior de siguiente a fin
               fin.anterior.siguiente = fin;
          } else {
               inicio = fin = new Nodo_Doble(elemento);
          }
     }
     
     //Metodo para modficar un elemento
     public boolean ModificarEnLaLista(int elemento){
          Nodo_Doble temporal = inicio;
          while (temporal != null & temporal.dato != elemento) {
               temporal = temporal.siguiente;
          }
          return temporal != null;
     }
     
     //Metodo para buscar elementos
     public boolean EnLaLista(int elemento){
          Nodo_Doble temporal = inicio;
          while (temporal != null & temporal.dato != elemento) {
               temporal = temporal.siguiente;
          }
          return temporal != null;
     }
     
     //Metodo para mostrar el ultimo elemento
     public int MostrarUltimo(){
          int elemento = fin.dato;
          if (inicio == fin) {
               inicio = fin = null;
          } else {
          
          }
          return elemento;
     }
     
     //Metodo para eliminar el ultimo valor
     public int eliminarFinal(){
          int elemento = fin.dato;
          if (inicio == fin) {
               inicio = fin = null;
          } else {
               //Esto elimina del final
               fin = fin.anterior;
               fin.siguiente = null;
          }
          return elemento;
     }
     
}
