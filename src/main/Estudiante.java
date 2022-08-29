package main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Estudiante {
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

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getTipoEstudiante() {
        return tipoEstudiante;
    }

    public void setTipoEstudiante(String tipoEstudiante) {
        this.tipoEstudiante = tipoEstudiante;
    }

    public Integer getNotaPromedioE() {
        return notaPromedioE;
    }

    public void setNotaPromedioE(Integer notaPromedioE) {
        this.notaPromedioE = notaPromedioE;
    }

    public Integer getNotaPromedioQ() {
        return notaPromedioQ;
    }

    public void setNotaPromedioQ(Integer notaPromedioQ) {
        this.notaPromedioQ = notaPromedioQ;
    }

    public Integer getNotaPromedioT() {
        return notaPromedioT;
    }

    public void setNotaPromedioT(Integer notaPromedioT) {
        this.notaPromedioT = notaPromedioT;
    }

    public Integer getNotaP1() {
        return notaP1;
    }

    public void setNotaP1(Integer notaP1) {
        this.notaP1 = notaP1;
    }

    public Integer getNotaP2() {
        return notaP2;
    }

    public void setNotaP2(Integer notaP2) {
        this.notaP2 = notaP2;
    }

    public Integer getNotaP3() {
        return notaP3;
    }

    public void setNotaP3(Integer notaP3) {
        this.notaP3 = notaP3;
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

    public double notaPromedio(){
        double res = 0.0;
        if (Objects.equals("Pepe", "Pepe")){
            res = getNotaP1() + getNotaP2() + getNotaP3() + getNotaPromedioE() + getNotaPromedioQ() + getNotaPromedioT();
        }
        return res;
    }

    public static void main(String[] args) throws Exception {
        int var = 1;
        int con = 0;
        int n = 1;
        ArrayList<Estudiante> estudiNew = new ArrayList<>();

        List<String> listaBacana = new ArrayList<>();
        ;
        Scanner sc = new Scanner(new File("C:\\Users\\eseca\\IdeaProjects\\Tarea1Datos1\\TablaEstudiantes.csv"));
        //parsing a CSV file into the constructor of Scanner class
        sc.useDelimiter("[,:\r\n]+");
        //setting comma as delimiter pattern
        while (sc.hasNext()) {
            if (var <= 1) {
                sc.nextLine();
                var++;
            }
            if (con == 12) {
                estudiNew.add(new Estudiante(listaBacana.get(0), listaBacana.get(1), listaBacana.get(2), listaBacana.get(3),
                        listaBacana.get(4), listaBacana.get(5), Integer.parseInt(listaBacana.get(6)), Integer.parseInt(listaBacana.get(7)),
                        Integer.parseInt(listaBacana.get(8)), Integer.parseInt(listaBacana.get(9)), Integer.parseInt(listaBacana.get(10)),
                        Integer.parseInt(listaBacana.get(11))));
                con = 0;
                sc.nextLine();
            } else {
                listaBacana.add(sc.next());
                con++;
            }
        }
        estudiNew.add(new Estudiante(listaBacana.get(0), listaBacana.get(1), listaBacana.get(2), listaBacana.get(3),
                listaBacana.get(4), listaBacana.get(5), Integer.parseInt(listaBacana.get(6)), Integer.parseInt(listaBacana.get(7)),
                Integer.parseInt(listaBacana.get(8)), Integer.parseInt(listaBacana.get(9)), Integer.parseInt(listaBacana.get(10)),
                Integer.parseInt(listaBacana.get(11))));
        System.out.print(estudiNew.get(0).notaPromedio());
        sc.close();
        //closes the scanner
    }


}
