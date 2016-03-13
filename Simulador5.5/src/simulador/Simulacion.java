/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package simulador; //Nombre del Paquete de la Clase

/**
 * @author Oscar F. Fonseca Salicetti & Andrés J. Jiménez Leandro
 **/

public class Simulacion { //Nombre e Inicio de la Clase "Simulación"

    private int horasPorDia;//Cantidad en horas por día que trabaja la simulación
    private int diasPorSemana;//Cantidad en días que va a trabajar la simulación
    private int semanasPorMes;//Cantidad en semanas que va a trabajar la simulación
    private int mesesPorAño;//Cantidad en meses que va a trabajar la simulación
    private int años;//Cantidad en años que va a trabajar la simulación

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

    public void setDias(int dias) {
        this.diasPorSemana = dias;
    }

    public void setSemanas(int semanas) {
        this.semanasPorMes = semanas;
    }

    public void setMeses(int meses) {
        this.mesesPorAño = meses;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public int getHoras() {
        return this.horasPorDia;
    }

    public int getDias() {
        return this.diasPorSemana;
    }

    public int getSemanas() {
        return this.semanasPorMes;
    }

    public int getMeses() {
        return this.mesesPorAño;
    }

    public int getAños() {
        return this.años;
    }
    
    /**
     * Acontinuacion se llamarán los set de máquina todos por aparte y por cada maquina:
     * Esto se debe a la necesidad de manejar los cambios 1 por 1 desde el menú principal
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

    public String simula() { //Inicio del Método que carga la Simulación
        int tiempoMaximoReparacion1 = 1; //Se encarga de reparar la maquina 1 cuando se cumple su tiempo.
        int tiempoMaximoReparacion2 = 1; //Se encarga de reparar la maquina 2 cuando se cumple su tiempo.
        int cont = 1; //Contador de las horas, cada ciclo representa 1 hora
        int contDias = 1; //Contador de los días, cada ciclo representa 1 día
        int contSemanas = 1; //Contador de las semanas, cada ciclo representa 1 nes
        int contMeses = 1; //Contador de los meses, cada ciclo representa 1 mes
        int contAnos = 1; //Contador de los años, cada ciclo representa 1 año
        double producidos1 = 0, producidos2 = 0; //Valor de las Producciones por máquina
        
        do {
            //Generacion de la posible falla:
            if (miMaquina1.randomFalla() > miMaquina1.getFalla()) {
                miMaquina1.setEstado(false);
                tiempoMaximoReparacion1++;
            } else {
                miMaquina1.setEstado(true);
            }
            if (miMaquina2.randomFalla() > miMaquina2.getFalla()) {
                miMaquina2.setEstado(false);
                tiempoMaximoReparacion2++;
            } else { //De lo Contrario...
                miMaquina2.setEstado(true); //Máquina en Estado "true"
            }
            if (miMaquina1.getEstado() == false) {
                producidos1 = producidos1 + 0;
            }
            if (miMaquina2.getEstado() == false) {
                producidos2 = producidos2 + 0;
            }
            
            //Reparacion de la Maquina por medio del Tiempo Máximo de Reparacion:
            
            if (tiempoMaximoReparacion1 >= miMaquina1.getTiempoReparacion()) {
                miMaquina1.setEstado(true);
            }
            if (tiempoMaximoReparacion2 >= miMaquina2.getTiempoReparacion()) {
                miMaquina2.setEstado(true);
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
            
            /*
             * Incremento de los respectivos contadores...
             * Funciona de Forma Dinámica con los valores dados por el usuario y la vida real;
             * devuelve la produccion realizada...
             */
            
            cont++; //Aumento del Contador
            
            if ((cont >= 24 || (cont >= this.horasPorDia))) {
                contDias++;
                cont = 1;
            }
            if ((contDias >= 7 || (contDias >= this.diasPorSemana))) {
                contSemanas++;
                contDias = 1;
            }
            if ((contSemanas >= 4 || (contSemanas >= this.semanasPorMes))) {
                contMeses++;
                contSemanas = 1;
            }

        } while ((this.horasPorDia <= cont && (this.diasPorSemana <= contDias) && (this.semanasPorMes <= contSemanas) && (this.mesesPorAño <= contMeses))); //Condición del Ciclo

        return ("Los Productos Producidos Por la Máquina "+ miMaquina1.getID()+" fueron "+producidos1+'\n'+" y "+'\n'+"Los Productos Producidos por la Máquina "+miMaquina2.getID()+" fueron "+producidos2); //Retorno de los Resultados Obtenidos en Ambas Máquinas
    }//Fin del Método que despliega los resultados de la Simulación 
    
} //Fin de la Clase "Simulación"