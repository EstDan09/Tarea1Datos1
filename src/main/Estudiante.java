package main;

import javafx.application.Application;

import java.io.File;
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
    ArrayList<EstudianteA> estudiA = new ArrayList<>();
    ArrayList<EstudianteB> estudiB = new ArrayList<>();

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

    public abstract double notaFinal();
}
