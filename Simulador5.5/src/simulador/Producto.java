/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package simulador; //Nombre del Paquete de la Clase

/**
 * @author Andrés J. Jiménez Leandro y Oscar F. Fonseca Salicetti
 **/

public class Producto { //Nombre e Inicio de la Clase "Producto"

    private String nombre; //Declaración de los Atributos del "nombre" del Producto a Crear
    private double precio; //Declaración de los Atributos de "precio" del Producto a Crear

    public Producto() { //Nombre e Inicio del Método Constructor
        //Método Constructor Vacio:Sin Parámetros a Recibir
    } //Fin del Método Constructor

    public void setNombre(String nombre) { //Nombre e Inicio del Método setNombre,que recibe la cadena de carácteres "nombre" para Nombrar al Producto
        this.nombre = nombre; //Declaración del valor de "nombre"
    } //Fin del Método que recibe el Nombre del Producto a Construir

    public String getNombre() { //Nombre e Inicio del Método getNombre,que retorna el valor de la variable "nombre"
        return (this.nombre); //Muestra el valor de "nombre"
    } //Fin del Método que despliega el Nombre del Producto a Construir

    public void setPrecio(double precio) { //Nombre e Inicio del Método setPrecio, que recibe la variable double "precio",que se le otorga cómo valor de costo al producto
        this.precio = precio; //Declaración del valor de "precio"
    } //Fin del Método que recibe el Precio del Producto a Construir

    public double getPrecio() { //Nombre e Inicio del Método getPrecio,que retorna el valor de la variable "precio"
        return (this.precio); //Muestra el valor de "precio"
    } //Fin del Método que despliega el Precio del Producto a Construir
} //Fin de la Clase "Producto"