package main;

import java.io. * ;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class AhiteVoyJesus {
    public static void main(String[] args) throws Exception {
        int var = 1;
        int con = 1;
        List<String> listaBacana = new ArrayList<>();;
        Scanner sc = new Scanner(new File("C:\\Users\\eseca\\IdeaProjects\\Tarea1Datos1\\TablaEstudiantes.csv"));
        //parsing a CSV file into the constructor of Scanner class
        sc.useDelimiter("[,:\r\n]+");
        //setting comma as delimiter pattern
        while (sc.hasNext()) {
            if (var <= 1){
                sc.nextLine();
                var ++;
            }
            if (con >= 12){
                con = 0;
            }
            else{
                listaBacana.add(sc.next());
                con ++;
            }

        }
        System.out.println(listaBacana.get(5));
        sc.close();
        //closes the scanner
    }
}
