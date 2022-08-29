package main;
/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import lectorcsv.Comparador;
import lectorcsv.Objeto;

import javax.swing.*;

public class ManipuladorCSV {
    private BufferedReader lector;
    private String linea;
    private String partes[] = null;
    private ArrayList<Estudiante> diositoPorfa = ArrayList<Estudiante>();
    private int var = 0;

    public void  leerArchivo(String nombreFile){
        try{
            lector = new BufferedReader(new FileReader(nombreFile));

            while ((linea = lector.readLine()) != null) {
                partes = linea.split(",");
                imprimirLinea();
                System.out.printIn();
                if (var == 1) {
                    arregloDinamico.add(new Estudiante(partes[0].substring(1, partes[0].lenght()-1),
                            partes[1].substring(1, partes[1].length()-1), partes[2].substring(1, partes[2].length()-1),
                            partes[3].substring(1, partes[3].length()-1), partes[4].substring(1, partes[4].length()-1),
                            partes[5].substring(1, partes[5].length()-1), partes[6].substring(1, partes[6].length()-1),
                            partes[7].substring(1, partes[7].length()-1), partes[8].substring(1, partes[8].length()-1),
                            partes[9].substring(1, partes[9].length()-1), partes[10].substring(1, partes[10].length()-1),
                            partes[11].substring(1, partes[11].length()-1)));
                }
                var = 1;

            }
            lector.close();
            linea = null;
            partes = null;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void imprimirLinea(){
        for (int 1 = 0; i < partes.length; i++) {
            System.out.print(partes[i] + "   |   ");
        }
    }
    public void imprimirDatosArregloDinamico() {
        String columna = JOptionPane.showInputDialog(null, "Ingrese la Columna a Ordenar");
        Collections.sort(arregloDinamico, new Comparador(Integer.parseInt(columna)));

        for (Estudiante object : arregloDinamico) {
            System.out.println(object.toString());
        }
    }
}
*/