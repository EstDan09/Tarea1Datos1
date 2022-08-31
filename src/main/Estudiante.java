package main;

import java.io.File;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public abstract class Estudiante {
    private String carne;
    private String nombreApellidos;
    private String correo;
    private String telefono;
    private String nickname;
    private String tipoEstudiante;
    private Integer notaPromedioE;
    private Integer notaPromedioQ;
    private Integer notaPromedioT;
    private Integer notaP1;
    private Integer notaP2;
    private Integer notaP3;

    public String getCarne() {
        return carne;
    }


    public String getNombreApellidos() {
        return nombreApellidos;
    }


    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }


    public String getNickname() {
        return nickname;
    }


    public String getTipoEstudiante() {
        return tipoEstudiante;
    }


    public Integer getNotaPromedioE() {
        return notaPromedioE;
    }


    public Integer getNotaPromedioQ() {
        return notaPromedioQ;
    }


    public Integer getNotaPromedioT() {
        return notaPromedioT;
    }


    public Integer getNotaP1() {
        return notaP1;
    }


    public Integer getNotaP2() {
        return notaP2;
    }


    public Integer getNotaP3() {
        return notaP3;
    }


    /*
        Metodo Constructor
        */
    public Estudiante(String carne, String nombreApellidos, String correo, String telefono, String nickname,
                  String tipoEstudiante, Integer notaPromedioE, Integer notaPromedioQ, Integer notaPromedioT,
                  Integer notaP1, Integer notaP2, Integer notaP3) {
        this.carne = carne;
        this.nombreApellidos = nombreApellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.nickname = nickname;
        this.tipoEstudiante = tipoEstudiante;
        this.notaPromedioE = notaPromedioE;
        this.notaPromedioQ = notaPromedioQ;
        this.notaPromedioT = notaPromedioT;
        this.notaP1 = notaP1;
        this.notaP2 = notaP2;
        this.notaP3 = notaP3;

    }
    public abstract double notaPromedio();

    public double notaFinal(){
        double res0 = 0.0;
        res0 = getNotaPromedioE() + getNotaPromedioQ() + getNotaPromedioT() + 1000.0;
        return res0;
    }

    public static void main(String[] args) throws Exception {
        int var = 1;
        int con = 0;

        ArrayList<EstudianteA> estudiA = new ArrayList<>();
        ArrayList<EstudianteB> estudiB = new ArrayList<>();

        List<String> listaBacana = new ArrayList<>();
        Scanner lector = new Scanner(new File("C:\\Users\\eseca\\IdeaProjects\\Tarea1Datos1\\TablaEstudiantes.csv"));
        lector.useDelimiter("[,:\r\n]+");
        while (lector.hasNext()) {
            if (var <= 1) {
                lector.nextLine();
                var++;
            }
            if (con == 12) {
                if (Objects.equals(listaBacana.get(5), "A")){
                    estudiA.add(new EstudianteA(listaBacana.get(0), listaBacana.get(1), listaBacana.get(2), listaBacana.get(3),
                            listaBacana.get(4), listaBacana.get(5), Integer.parseInt(listaBacana.get(6)), Integer.parseInt(listaBacana.get(7)),
                            Integer.parseInt(listaBacana.get(8)), Integer.parseInt(listaBacana.get(9)), Integer.parseInt(listaBacana.get(10)),
                            Integer.parseInt(listaBacana.get(11))));
                }
                else{
                    estudiB.add(new EstudianteB(listaBacana.get(0), listaBacana.get(1), listaBacana.get(2), listaBacana.get(3),
                            listaBacana.get(4), listaBacana.get(5), Integer.parseInt(listaBacana.get(6)), Integer.parseInt(listaBacana.get(7)),
                            Integer.parseInt(listaBacana.get(8)), Integer.parseInt(listaBacana.get(9)), Integer.parseInt(listaBacana.get(10)),
                            Integer.parseInt(listaBacana.get(11))));
                }
                listaBacana.clear();
                con = 0;
                lector.nextLine();
            } else {
                listaBacana.add(lector.next());
                con++;
            }
        }
        if (Objects.equals(listaBacana.get(5), "A")){
            estudiA.add(new EstudianteA(listaBacana.get(0), listaBacana.get(1), listaBacana.get(2), listaBacana.get(3),
                    listaBacana.get(4), listaBacana.get(5), Integer.parseInt(listaBacana.get(6)), Integer.parseInt(listaBacana.get(7)),
                    Integer.parseInt(listaBacana.get(8)), Integer.parseInt(listaBacana.get(9)), Integer.parseInt(listaBacana.get(10)),
                    Integer.parseInt(listaBacana.get(11))));
        }
        else{
            estudiB.add(new EstudianteB(listaBacana.get(0), listaBacana.get(1), listaBacana.get(2), listaBacana.get(3),
                    listaBacana.get(4), listaBacana.get(5), Integer.parseInt(listaBacana.get(6)), Integer.parseInt(listaBacana.get(7)),
                    Integer.parseInt(listaBacana.get(8)), Integer.parseInt(listaBacana.get(9)), Integer.parseInt(listaBacana.get(10)),
                    Integer.parseInt(listaBacana.get(11))));
        }
        System.out.print(estudiA.get(1).notaPromedio() + "\n");
        System.out.print(estudiB.get(0).notaFinal());
        lector.close();
    }
}
