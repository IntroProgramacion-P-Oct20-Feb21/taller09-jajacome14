/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

/**
 *
 * @author reroes
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", 
            "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning",
            "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];
    
        // Creacion de arreglo
        double prom;
        String cadena = "";
        // Comparación de promedios para obtemer el promedio cualitativo
        // Se utiliza un ciclo repetitivo para navegar por los arreglos
        for (int i = 0; i < promedios.length; i++){
            prom = promedios[i];
            if ((prom >= 0) && (prom <= 5.9)){
                promediosCualitativos[i] = "Regular";
                // Promedio Regular(0 - 5.9)
            } else {
                if ((prom >= 6) && (prom <= 8.9)){
                    promediosCualitativos[i] = "Bueno";
                    // Promedio Bueno (6 - 8.9)
                } else {
                    if ((prom >= 9) && (prom <= 10)){
                        promediosCualitativos[i] = "Sobresaliente";
                        // Promedio Sobresaliente (9 - 10)
                    }
                }
            }
        }
        for (int i = 0; i < promedios.length; i++){
            cadena = String.format("%s%s promedio: %.2f "
                    + "promedio cualitativo: %s\n",
                    cadena,
                    estudiantes[i],
                    promedios[i],
                    promediosCualitativos[i]);
        }
        System.out.printf(cadena);
        
    }

}
