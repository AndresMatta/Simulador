/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package simulador; //Nombre del Paquete de la Clase

/**
 * @author Oscar F. Fonseca Salicetti y Andrés J. Jiménez Leandro
 **/

public class Maquina { //Nombre e Inicio de la Clase "Máquina"

    private double costoMaquina; //Declaración del Atributo que da el Valor de la Máquina
    private double costoProduccion; //Declaración del Atributo que da los Costos de Producción por Hora
    private double produccionHora; //Declaración del Atributo que da la Cantidad de Productos que se pueden Hacer por Hora
    private boolean estado; //Declaración del Atributo que define los Estados de la Máquina: "Funciona" ó "Dañada"
    private int tiempoReparacionMaximo; //Declaración del Atributo que da el Tiempo de Máximo en ser Reparada Cuándo se Daña
    private double falla; //Declaración del Atributo que da el Número que Sirve como Parámetro para la Falla de la Máquina
    private String id; //Declaración del Atributo que da la Identificación de la Máquina
    private double gananciaEnBruto; //Declaración del Atributo que da la Ganancia generada del Valor de Venta de los Productos menos los Costos de Producción
    private double gananciaReal; //Declaración del Atributo que da la Ganancia Total después de Restar la Ganancia generada menos el Costo de la Máquina

    public Maquina() { //Nombre e Inicio del Método Constructor
        //Método Constructor Vacio:Sin Parámetros a Recibir
    } //Fin del Método Constructor

    public void setCostoMaquina(double costo) { //Nombre e Inicio del Método setCostoMaquina, que recibe la variable doble "costo"
        this.costoMaquina = costo; //Declaración del valor de "costo" de la Máquina
    } //Fin del Método que Recibe el Costo de la Máquina

    public void setCostoProduccion(double cproduccion) { //Nombre e Inicio del Método setCostoProduccion, que recibe la variable doble "cproduccion"
        this.costoProduccion = cproduccion; //Declaración del valor de "costo" de la Producción
    } //Fin del Método que Recibe el Costo de la Producción

    public void setProduccion(double produccion) { //Nombre e Inicio del Método setProduccion, que recibe la variable doble "produccion"
        this.produccionHora = produccion; //Declaración del Valor de "producción"
    } //Fin del Método que Recibe el número que data la producción

    public void setEstado(boolean estado) { //Nombre e Inicio del Método setEstado, que determina el "estado" de la máquina, según su variable en 'true' o 'false'
        this.estado = estado; //Declaración del valor de "estado" de las Máquinas
    } //Fin del Método que Recibe el Estado de las Máquinas

    public void setTiempoReparacion(int tiempoMaximo) { //Nombre e Inicio del Método setTiempoReparación, que recibe la variable entera "tiempoMaximo", que determina el tiempo que dura una máquina en ser reparada
        this.tiempoReparacionMaximo = tiempoMaximo; //Declaración del valor de "tiempoMáximo" en que durarán las máquinas en ser reparadas
    } //Fin del Método que Recibe el tiempo máximo de la reparación de las máquinas

    public void setFalla(double falla) { //Nombre e Inicio del Método setFalla, que recibe la variable doble "falla" que determina el valor de fallo de una máquina
        this.falla = falla; //Declaración del valor de "falla" de las Máquinas
    } //Fin del Método que Recibe el valor de probabilidad de falla en las máquinas

    public void setID(String id) { //Nombre e Inicio del Método setID, que recibe la cadena de carácteres "id"
        this.id = id; //Declaración del valor de "id" cómo identificador de las máquinas en la producción
    } //Fin del Método que Recibe el Número de Identificación de las Máquinas Productoras

    public void setBruto(double bruto) { //Nombre e Inicio del Método setBruto, que recibe la variable doble "bruto" que adquiere el valor de la ganancia bruta
        this.gananciaEnBruto = bruto; //Declaración del valor de "bruto" de la Ganancia Bruta
    } //Fin del Método que Recibe el valor de la Ganancia Bruta

    public void setReal(double real) { //Nombre e Inicio del Método setReal, que recibe la variable doble "real" que adquiere el valor de la ganancia real
        this.gananciaReal = real; //Declaración del valor "real" de la Ganancia Real
    } //Fin del Método que Recibe el valor de la Ganancia Real

    public double getCostoMaquina() { //Nombre e Inicio del Método getCostoMaquina,que retorna el valor de la variable "costoMaquina"
        return this.costoMaquina; //Muestra del valor de "costoMaquina"
    } //Fin del Método que despliega el Costo de la Máquina

    public double getCostoProduccion() { //Nombre e Inicio del Método getCostoProduccion,que retorna el valor de la variable "costoProduccion"
        return this.costoProduccion; //Muestra del valor de "costoProduccion"
    } //Fin del Método que despliega el Costo de la Producción

    public double getProduccionHora() { //Nombre e Inicio del Método getProducciónHora,que retorna el valor de la variable "produccionHora"
        return this.produccionHora;//Muestra del valor de "produccionHora"
    } //Fin del Método que despliega la Producción por Hora

    public boolean getEstado() { //Nombre e Inicio del Método getEstado,que retorna el valor de la variable "estado"
        return this.estado;//Muestra del valor de "estado"
    } //Fin del Método que despliega el Estado de la Máquina

    public int getTiempoReparacion() { //Nombre e Inicio del Método getTiempoReparación,que retorna el valor de la variable "tiempoReparacionMaximo"
        return this.tiempoReparacionMaximo;//Muestra del valor de "tiempoReparacionMaximo"
    } //Fin del Método que despliega el Tiempo Máximo de Reparación de una Máquina en el Simulador

    public double getFalla() { //Nombre e Inicio del Método getFalla,que retorna el valor de la variable "falla"
        return this.falla;//Muestra del valor de "falla"
    } //Fin del Método que despliega el valor de la probabilidad de fallar una máquina

    public String getID() { //Nombre e Inicio del Método getID,que retorna el valor de la variable "id"
        return this.id;//Muestra del valor de "id"
    } //Fin del Método que despliega el Número de Identificación de las Máquinas

    public double getBruto() { //Nombre e Inicio del Método getBruto,que retorna el valor de la variable "gananciaEnBruto"
        return this.gananciaEnBruto;//Muestra del valor de "gananciaEnBruto"
    } //Fin del Método que despliega la Ganancia en Bruto

    public double getReal() { //Nombre e Inicio del Método getReal,que retorna el valor de la variable "gananciaReal"
        return this.gananciaReal; //Muestra del valor de "gananciaReal"
    } //Fin del Método que despliega la Ganancia Real

    public int randomFalla() { //Inicio y Nombre del Método que Genera de manera Aleatoria la Matriz de la Falla
        int random = (int) (Math.random() * 100) + 1; //Difinición de la Variable "random" que variará las posibilidades de error de las máquinas
        return (random); //Muestra del número "random" escogido al azar, que será usado para la falla de las máquinas
    } //Fin del Método randomFalla
} //Fin de la Clase "Máquina"