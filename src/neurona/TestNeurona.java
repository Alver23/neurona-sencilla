/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neurona;

/**
 *
 * @author alver.grisales
 */
public class TestNeurona {
    public static void main (String[] argumentos)
    {
        double x1, x2;
        /*x1 = 1.4;
        x2 = -0.3;*/
        
        /*x1 = 1.5;
        x2 = -0.2;*/
        x1 = 1.3;
        x2 = -0.4;
        if (argumentos.length == 2) {
            try {
                x1 = Double.parseDouble(argumentos[0]);
                x2 = Double.parseDouble(argumentos[1]);
            } catch (NumberFormatException e) {
                System.err.println("algo falló al procesar las entradas" + e.getMessage());
            }
        }
        
        double w1 = Math.random();
        double w2 = Math.random();
        
        Neurona miNeura = new Neurona(x1, x2, w1, w2);
        System.out.println(" ***** PRUEBA NEURONA ARTIFICIAL ***** ");
        System.out.println("*ENTRADA 1: " + x1);
        System.out.println("*ENTRADA 2: " + x2);
        System.out.println("*PESO 1: " + w1);
        System.out.println("*PESO 2: " + w2);
        System.out.println("*SALIDA: " + miNeura.getY1());
    }
    
}
