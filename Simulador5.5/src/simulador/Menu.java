/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador;

import javax.swing.JOptionPane;

/**
 * Encargada de la interacción con el usuario.
 * @author Andres Matta
 */
public class Menu {
     /*
    * La Interacción con el Usuario se Realiza desde Aquí:
    * Se tendrá el Menú, el Cuál está en partes...
    */
    //Declaración de Variables:
    int opt; //Variable Entera "opt", para seleccionar una Opción del Menú
    int convertidor; //Variable Entera para usar en el Convertidor
    String tab1 = ""; //Variable Tabuladora, que sirve para Concatenar el Menú
    String tab2 = ""; //Variable Tabuladora, que sirve para Concatenar el Menú

    //Proceso de Definición de las Instancias: 
    Simulacion miSimulacion = new Simulacion();
    Producto miProducto = new Producto();
    Convertidor miConvertidor = new Convertidor();

    public Menu() {
    }
    
 
    /**
     * Se genera el menú de interacción con el usuario.
     */
    public void Interface(){
            
        /*
         * A continuación, se seteará el producto, esto, solo se puede realizar 1 vez.
         */
        
        //Solicitud del Nombre del Producto a Crear:
        miProducto.setNombre(JOptionPane.showInputDialog("Digite el Nombre del Producto que Realizarán las Máquinas: "));
        //Solicitud del Precio del Producto a Crear:
        miProducto.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Digite el Precio de Venta del Producto que se Creará: ¢")));
       
        /*
         * Menú Para Cambiar Las Opciones de las Máquinas:
         */
    
        do { //Ciclo de Accesos al Menu  
          //Segundo Intento de Menú: (Por Andrés J. Jiménez Leandro)
 
            //Concatenación y Orden del Menú de Opciones:
            tab1 += "SELECCIONE UNA OPCIÓN:\n\n"
                    + "\n1) Para Agregar Las ID de las Máquinas...\n"
                    + "\n2) Para Agregar Los Costos de Compra...\n"
                    + "\n3) Para Agregar Los Costos de Produccion...\n"
                    + "\n4) Para Agregar La Capacidad Por Hora de Producción de las Máquinas...\n"
                    + "\n5) Para Agregar El Número Para la Falla...\n"
                    + "\n6) Para Agregar El Tiempo de Garantía (Tiempo Máximo en que se va a Reparar una Falla)...\n"
                    + "\n7) Para Definir Las Horas de Trabajo (Uso del Convertidor)...\n"
                    + "\n8) Iniciar simulación..\n"
                    + "\n9) SALIDA...\n";
            
           //Proceso del Switch que Permite la Escogencia del Menú
            do { //Ciclo de Acceso, para el cierre del Programa
                
                JOptionPane.showMessageDialog(null, tab1); //Despliegue del Menú Concatenado
                opt = Integer.parseInt(JOptionPane.showInputDialog("Digite Una Opción: ")); //Toma del Número de Opción Elegida
                
                if ((opt > 9) || (opt < 1)) { //Condiciones de Acceso al Menú
                    //Aviso de Error en Caso de No Cumplirse la Condición
                    JOptionPane.showMessageDialog(null, "Error de Dígito", "ERROR!", JOptionPane.ERROR_MESSAGE);
                    System.err.println("Error de Dígito");
                    
                } else { //De Sí Cumplirse la Condición; se deberá proceder con el siguiente proceso:
                   
                    switch (opt) { //Lectura de la Opción Escogida para el Acceso al Menú
                        
                        //Casos de Acción,según la Opción del Menú
                        case 1: //Digitar los ID's de las Máquinas
                            miSimulacion.llamadaSetIdMaquina1(JOptionPane.showInputDialog("Digite el ID de la Máquina 1"));
                            miSimulacion.llamadaSetIdMaquina2(JOptionPane.showInputDialog("Digite el ID de la Máquina 2"));
                            break; //Fin del Caso 1
                            
                        case 2: //Digitar el Costo de las Máquinas
                            miSimulacion.llamadaSetCostoDeMaquina1(Double.parseDouble(JOptionPane.showInputDialog("Digite el Costo de la Máquina 1 ¢")));
                            miSimulacion.llamadaSetCostoDeMaquina2(Double.parseDouble(JOptionPane.showInputDialog("Digite el Costo de la Máquina 2 ¢")));
                            break; //Fin del Caso 2
                            
                        case 3: //Digitar el Costo de Producción de las Máquinas
                            miSimulacion.llamadaSetCostoProMaquina1(Double.parseDouble(JOptionPane.showInputDialog("Digite el Costo de Producción de la Máquina 1 ¢")));
                            miSimulacion.llamadaSetCostoProMaquina2(Double.parseDouble(JOptionPane.showInputDialog("Digite el Costo de Producción de la Máquina 2 ¢")));
                            break; //Fin del Caso 3
                            
                        case 4: //Digitar la Producción por Hora de las Máquinas
                            miSimulacion.llamadaSetProduccionMaquina1(Double.parseDouble(JOptionPane.showInputDialog("Digite la Producción por Hora de la Máquina 1")));
                            miSimulacion.llamadaSetProduccionMaquina2(Double.parseDouble(JOptionPane.showInputDialog("Digite la Producción por Hora de la Máquina 2")));
                            break; //Fin del Caso 4
                            
                        case 5: //Digitar el Número de Fallas de las Máquinas
                            miSimulacion.llamadaSetFalla(Double.parseDouble(JOptionPane.showInputDialog("Digite el Número de la Falla de la Máquina 1")));
                            miSimulacion.llamadaSetFalla2(Double.parseDouble(JOptionPane.showInputDialog("Digite el Número de la Falla de la Máquina 2")));
                            break; //Fin del Caso 5
                            
                        case 6: //Digite los Tiempos Máximos en Ser Reparadas las Máquinas
                            miSimulacion.llamadaSetTiempoReparacionMaximo(Integer.parseInt(JOptionPane.showInputDialog("Digite el Tiempo Máximo que Tarda la Máquina 1 en Ser Reparada")));
                            miSimulacion.llamadaSetTiempoReparacionMaximo2(Integer.parseInt(JOptionPane.showInputDialog("Digite el Tiempo Máximo que Tarda la Máquina 2 en Ser Reparada")));
                            break; //Fin del Caso 6
                        
                        case 7: //Toma y Despliegue de los Estados de Tiempo a Trabajar
                            miConvertidor.setHoras(Integer.parseInt(JOptionPane.showInputDialog("Digite las Horas de Trabajo: ")));
                            //NUEVO SISTEMA DE CONVERSIÓN INCLUIDO EN EL MENÚ:SIN INTROMISIÓN AL USUARIO (POR: ANDRÉS J. JIMÉNEZ LEANDRO)
                            
                            //Concatenación de los Resultados de las Conversiones:
                            tab2 += "Las Horas a Trabajar Son:\n"+miConvertidor.getHoras()+"\n"
                                 + "Los Días a Trabajar Son:\n"+miConvertidor.converHoras()+"\n"
                                 + "Las Semanas a Trabajar Son:\n"+miConvertidor.converDias()+"\n"
                                 + "Los Meses a Trabajar Son:\n"+miConvertidor.converSemanas()+"\n"
                                 + "Los Años a Trabajar Son:\n"+miConvertidor.converMeses()+"\n";
                            
                            /* ENUNCIADOS SEPARADOS ANTERIORES (NO CONCATENADOS):
                            JOptionPane.showMessageDialog(null, "Las Horas a Trabajar Son:\n"+miConvertidor.getHoras());
                            JOptionPane.showMessageDialog(null, "Los Días a Trabajar Son:\n"+miConvertidor.converHoras());
                            JOptionPane.showMessageDialog(null, "Las Semanas a Trabajar Son:\n"+miConvertidor.converDias());
                            JOptionPane.showMessageDialog(null, "Los Meses a Trabajar Son:\n"+miConvertidor.converSemanas());
                            JOptionPane.showMessageDialog(null, "Los Años a Trabajar Son:\n"+miConvertidor.converMeses());
                            */
                            
                            JOptionPane.showMessageDialog(null, tab2); //Despliegue del Menú Concatenado
                            
                            break; //Fin del Caso 7
                            
                        case 9: //Opción de Salida del Programa
                            System.exit(0); //Salir del Programa
                            break; //Fin del Caso 7
                        case 8:
                            JOptionPane.showMessageDialog(null, miSimulacion.simula(), "Resultado Final", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        default: //Acción por Defecto si se escoge otro Número NO Provisto en el Menú
                            //Despliegue de Mensajes de Errores:
                            JOptionPane.showMessageDialog(null, "Número Incorrecto", "ERROR!", JOptionPane.ERROR_MESSAGE);
                            System.err.println("Número Incorrecto");
                    } //Fin del Switch del Menú
                } //Fin del Else de la Condición de Entrada al Menú del If
                
            } while (opt != 9); //Fin del Ciclo de Clausura que Cierra el Menú
            
        } while (opt != 9); //Fin del Ciclo de Acceso al Menú
       
    } //Fin de Interface
    
}
