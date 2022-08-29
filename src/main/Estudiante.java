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

    public abstract double notaPromedio();

    public void catalogar(){
        try{
            Constructor<? extends Estudiante> constructor = getClass().getDeclaredConstructor(String.class, String.class,
                    String.class, String.class, String.class, String.class, Integer.class, Integer.class, Integer.class, Integer.class,
                    Integer.class, Integer.class);
            Estudiante estudiante = constructor.newInstance(carne,nombreApellidos,correo,telefono,nickname,
                    tipoEstudiante,notaPromedioE,notaPromedioQ,notaPromedioT,notaP1,notaP2,notaP3);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws Exception {
        int var = 1;
        int con = 0;

        ArrayList<EstudianteA> estudiA = new ArrayList<>();
        ArrayList<EstudianteB> estudiB = new ArrayList<>();

        List<String> listaBacana = new ArrayList<>();
        Scanner sc = new Scanner(new File("C:\\Users\\eseca\\IdeaProjects\\Tarea1Datos1\\TablaEstudiantes.csv"));
        sc.useDelimiter("[,:\r\n]+");
        while (sc.hasNext()) {
            if (var <= 1) {
                sc.nextLine();
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
                sc.nextLine();
            } else {
                listaBacana.add(sc.next());
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
        System.out.print(estudiA.get(1).notaPromedio());
        System.out.print(estudiB.get(1).notaPromedio());
        sc.close();
    }
}
