/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayapp;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class ArrayApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Como validar el numero de datos del arreglo
        String [] alumnos={"Juan","Mario", "Laura","Julio", "Susana","Raul", "Valentina"};
        System.out.println("longitud="+ alumnos.length);
        
        // De manera explicita cual es la longitud
        String[] materias = new String [5];
        System.out.println("longitud =" + materias.length);
        System.out.println("elemento[0] =" + materias[0]);
        materias[0]="Estructura de Datos";
        materias[1]="Base de Datos";
        materias[2]="POO";
        materias[3]="Programacion Web";
        materias[4]="Emsamblador y Compiladpres";
        System.out.println("elemento[3]"+materias[3]);
        
        //tercer ejemplo
        float[] costos = new float [3];
        System.out.println("longitud=" + costos.length);
        System.out.println("elemento[0] =" + costos[0]);
        System.out.println("elemento[2] =" + costos[2]);
        costos[0]=(float)10.56;
        costos[1]=(float)89.46;
        costos[2]=(float)32.53;
        System.out.println("elemento[2] =" + costos[2]);
    
        // cuarto ejemplo
        float[] costos1={(float) 10.56,(float) 89.46,(float) 56.77 ,(float) 167.45};
        System.out.println("longitud=" + costos1.length);
        System.out.println("elemento[2] =" + costos1[2]);
        
        
        ArrayList<Prueba> p1= new ArrayList<Prueba>();
        
        Prueba prueba1 = new Prueba(1,"AC");
        p1.add(prueba1);
        
        Prueba prueba2 = new Prueba(2,"BA");
        p1.add(prueba2);
        
        Prueba prueba3 = new Prueba(3,"PR");
        p1.add(prueba3);
        
        System.out.println("Longitud de arreglo de objetos:" + p1.size());
        System.out.println("datos del objeto 1:" + p1.get(2).getEstatus());
    }
}
