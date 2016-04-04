/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package simulador; //Nombre del Paquete de la Clase

import javax.swing.JOptionPane;


/**
 * @author Andrés Matta Morales
 **/

public class Simulacion { //Nombre e Inicio de la Clase "Simulación"

    private int horasPorDia;//Cantidad en horas por día que trabaja la simulación.
    
    Simulacion() { //Nombre e Inicio del Método Constructor
        //Método Constructor Vacio:Sin Parámetros a Recibir
    } //Fin del Método Constructor
    
    //Proceso de Definición de las Instancias: 
    Producto miProducto = new Producto();
    Maquina miMaquina1 = new Maquina();
    Maquina miMaquina2 = new Maquina();

    //Toma y Muestras de los Valores Necesarios para el Proceso:
    
    public void setHoras(int horas) {
        this.horasPorDia = horas;
    }

    public int getHoras() {
        return this.horasPorDia;
    }

    /**
     * Acontinuacion se llamarán los set de máquina todos por aparte y por cada maquina:
     * Esto se debe a la necesidad de manejar los cambios 1 por 1 desde el menú principal
     * @param id
     **/

    //Primero los Métodos de la Máquina 1:
    
    public void llamadaSetIdMaquina1(String id) {
        miMaquina1.setID(id);
    } //Fin del Método de Identificación

    public void llamadaSetCostoDeMaquina1(double costoMaquina) {
        miMaquina1.setCostoMaquina(costoMaquina);
    } //Fin del Método de Costo de Máquina

    public void llamadaSetCostoProMaquina1(double costoProduccion) {
        miMaquina1.setCostoProduccion(costoProduccion);
    } //Fin del Método de Costo por Máquina

    public void llamadaSetProduccionMaquina1(double produccion) {
        miMaquina1.setProduccion(produccion);
    } //Fin del Método de Producción de la Máquina

    public void llamadaSetTiempoReparacionMaximo(int tiempo) {
        miMaquina1.setTiempoReparacion(tiempo);
    } //Fin del Método que marca el Tiempo Máximo de Reparación de la Máquina

    public void llamadaSetFalla(double falla) {
        miMaquina1.setFalla(falla);
    } //Fin del Método que se encarga de hacer fallar la máquina

    //Luego los Métodos de la Maquina 2:

    public void llamadaSetIdMaquina2(String id) {
        miMaquina2.setID(id);
    } //Fin del Método de Identificación

    public void llamadaSetCostoDeMaquina2(double costoMaquina) {
        miMaquina2.setCostoMaquina(costoMaquina);
    } //Fin del Método de Costo de Máquina

    public void llamadaSetCostoProMaquina2(double costoProduccion) {
        miMaquina2.setCostoProduccion(costoProduccion);
    } //Fin del Método de Producción de la Máquina

    public void llamadaSetProduccionMaquina2(double produccion) {
        miMaquina2.setProduccion(produccion);
    } //Fin del Método que marca el Tiempo Máximo de Reparación de la Máquina

    public void llamadaSetTiempoReparacionMaximo2(int tiempo) {
        miMaquina2.setTiempoReparacion(tiempo);
    } //Fin del Método que marca el Tiempo Máximo de Reparación de la Máquina

    public void llamadaSetFalla2(double falla) {
        miMaquina2.setFalla(falla);
    } //Fin del Método que se encarga de hacer fallar la máquina
    
    /*
     * Metodo encargado de llevar a cabo la simulación;
     * Se rige mediando ciclos, por el tiempo dado por el usuario...
     */

    public void simula() { //Inicio del Método que carga la Simulación
        int tiempoMaximoReparacion1 = 1; //Se encarga de reparar la maquina 1 cuando se cumple su tiempo.
        int tiempoMaximoReparacion2 = 1; //Se encarga de reparar la maquina 2 cuando se cumple su tiempo.
        int horasReparacion1 =0;//Cantidad de horas que tardo reparandose la maquina 1.
        int horasReparacion2 =0;//Camtidad de horas que tardo reparandose la maquina 2.
        int cont = 1; //Contador de las horas, cada ciclo representa 1 hora.
        double producidos1 = 0; //Valor de las Producciones por máquina. 
        double producidos2 = 0; //Valor de las Producciones por máquina.
        String resultado1; //Mostrara los ressultados de la máquina nº1.
        String resultado2; //Mostrara los resultados de la màquina nº2.
        
        do {
            //Generacion de la posible falla:
            if (miMaquina1.randomFalla() > miMaquina1.getFalla() && miMaquina1.getEstado()!=false) {
                miMaquina1.setEstado(false);
                JOptionPane.showMessageDialog(null, "La maquina " + miMaquina1.getID() + " ha sufrido una falla en la hora nº " + cont);
            } else {
                miMaquina1.setEstado(true);
            }
            if (miMaquina2.randomFalla() > miMaquina2.getFalla() && miMaquina2.getEstado()!=false) {
                miMaquina2.setEstado(false);
                JOptionPane.showMessageDialog(null, "La maquina " + miMaquina2.getID() + " ha sufrido una falla en la hora nº " + cont);
            } else { //De lo Contrario...
                miMaquina2.setEstado(true); //Máquina en Estado "true"
            }
            
            
            if (miMaquina1.getEstado() == false) {
                producidos1 = producidos1 + 0;
                tiempoMaximoReparacion1++;
                horasReparacion1++;
            }
            if (miMaquina2.getEstado() == false) {
                producidos2 = producidos2 + 0;
                tiempoMaximoReparacion2++;
                horasReparacion2++;
            }
            
            //Reparacion de la Maquina por medio del Tiempo Máximo de Reparacion:
            
            if (tiempoMaximoReparacion1 >= miMaquina1.getTiempoReparacion()&&miMaquina1.getEstado()==false) {
                miMaquina1.setEstado(true);
               JOptionPane.showMessageDialog(null, "La maquina " + miMaquina1.getID() + " ha sido reparada en la hora nº " + cont);
            }
            if (tiempoMaximoReparacion2 >= miMaquina2.getTiempoReparacion()&&miMaquina2.getEstado()==false) {
                miMaquina2.setEstado(true);
               JOptionPane.showMessageDialog(null, "La maquina " + miMaquina2.getID() + " ha sido reparada en la hora nº " + cont);
            }
            
            /*
             *Aquí se Genera la Producción de los Productos
             */
            
            if (miMaquina1.getEstado() == true) {
                producidos1 = producidos1 + miMaquina1.getProduccionHora();
            }
            if (miMaquina2.getEstado() == true) {
                producidos2 = producidos2 + miMaquina2.getProduccionHora();
            }
            
            cont++; //Aumento del Contador
    
        } while (cont<this.getHoras()); //Condición del Ciclo
        
        //Ganancias brutas de la primera máquina.
        double ganancia1 = producidos1*miProducto.getPrecio();
        miMaquina1.setBruto(ganancia1);
        
        //Ganancias brutas de la segunda máquina.
        double ganancia2 = producidos2*miProducto.getPrecio();
        miMaquina2.setBruto(ganancia2);
        
        //Se asignan las ganancias reales.
        miMaquina1.setReal(ganancia1 - (miMaquina1.getCostoProduccion()*this.getHoras()));
        miMaquina2.setReal(ganancia2 - (miMaquina2.getCostoProduccion()*this.getHoras()));
        
             /*
             * Se imprimen los resultados...
             * Funciona de Forma Dinámica con los valores dados por el usuario y la vida real;
             * Devuelve la produccion realizada, ganancias y cantidad de horas en reparacion...
             */
        
        resultado1 = "Los resultados de la máquina " + miMaquina1.getID() + " son:"+"\n\n"
                   + "El costo inicial de la máquina fue: "+miMaquina1.getCostoMaquina()+"\n"
                   + "La cantidad de horas que estuvo en reparación fueron: " + horasReparacion1 + "\n"
                   + "La cantidad de " + miProducto.getNombre() +  " fue: " + producidos1 + "\n"                 
                   + "Las ganancias netas son de: " + miMaquina1.getReal() + "\n";
        
        resultado2 = "Los resultados de la máquina " + miMaquina2.getID() + " son:"+"\n\n"
                   + "El costo inicial de la máquina fue: "+miMaquina2.getCostoMaquina()+"\n"
                   + "La cantidad de horas que estuvo en reparación fueron: " + horasReparacion2 + "\n"
                   + "La cantidad de " + miProducto.getNombre() +  " fue: " + producidos2 + "\n"                 
                   + "Las ganancias netas son de: " + miMaquina2.getReal() + "\n";
        
        //Se imprimen los resultados
        JOptionPane.showMessageDialog(null, resultado1, miMaquina1.getID(), JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, resultado2, miMaquina2.getID(), JOptionPane.INFORMATION_MESSAGE);
        //Se muestra la recomendacion..
        if(miMaquina1.getReal()-miMaquina1.getCostoMaquina()>miMaquina2.getReal()-miMaquina2.getCostoMaquina()){
            JOptionPane.showMessageDialog(null, "Se recomienda adquirir la maquina " + miMaquina1.getID());
        }else{//Inicio del else
            JOptionPane.showMessageDialog(null, "Se recomienda adquirir la maquina " + miMaquina2.getID());
        }//Fin del condicional
        
    }//Fin del Método que despliega los resultados de la Simulación 
    
} //Fin de la Clase "Simulación"