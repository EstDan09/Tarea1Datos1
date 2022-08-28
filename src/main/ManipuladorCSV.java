package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import lectorcsv.Comparador;
import lectorcsv.Objeto;

public class ManipuladorCSV {
    private BufferedReader lector;
    private String linea;
    private String partes[] = null;
    private ArrayList<Estudiante> arregloDinamico = ArrayList<Estudiante>();
    private int var = 0;

    public void  leerArchivo(String nombreFile){
        try{
            lector = new BufferedReader(new FileReader(nombreFile));

            while ((linea = lector.readLine()) != null) {
                partes = linea.split(",");
                imprimirLinea();
                System.out.printIn();
                if (var == 1) {
                    arregloDinamico.add(new Estudiante(partes[0].substring(1, partes[0].lenght()-1), partes[1].substring(1, partes[1].length()-1),
                            partes[2].substring(1, partes[2].length()-1), partes[3].substring(1, partes[3].length()-1), partes[4].substring(1, partes[4].length()-1),
                            partes[1].substring(1, partes[1].length()-1),)
                }
            }

        }
    }

}
