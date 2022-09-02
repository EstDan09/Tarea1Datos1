package main;
/**
 * Esta es mi clase principal abstracta, de la cual salen las subclases EstudiantesA y EstudiantesB
 */
/*
Aquí aplico abstracción ya que tengo una clase abstracta como mi superclase para facilitar la realización de la tarea
 */
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
    /**
     * Estos 3 atributos son Strings que mis metodos van a reescribir para poder completar las columnas extra que mi programa calcula
     */
    private String notaPromedioTipoA;
    private String notaPromedioTipoB;
    private Integer notaFinal;

    public String getNotaPromedioTipoB() {
        return notaPromedioTipoB;
    }

    public void setNotaPromedioTipoB(String notaPromedioTipoB) {
        this.notaPromedioTipoB = notaPromedioTipoB;
    }

    public String getNotaPromedioTipoA() {
        return notaPromedioTipoA;
    }

    public void setNotaPromedioTipoA(String notaPromedioTipoA) {
        this.notaPromedioTipoA = notaPromedioTipoA;
    }

    public Integer getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(Integer notaFinal) {
        this.notaFinal = notaFinal;
    }

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
                  Integer notaP1, Integer notaP2, Integer notaP3, String notaPromedioTipoA, String notaPromedioTipoB, Integer notaFinal) {
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
        this.notaPromedioTipoA = notaPromedioTipoA;
        this.notaPromedioTipoB = notaPromedioTipoB;
        this.notaFinal = notaFinal;

    }
    /**
     * Metodo abstracto que las subclases usan para sacar el promedio especifico de su clase
     */
    public abstract String notaPromedio();
    /**
     * Metodo abstracto para sacar el promedio final
     */
    public abstract Integer notaFinal();
}
