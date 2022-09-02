package main;

/**
 * Esta es una de mis subclases, para los estudiantes tipo B
 */
/*
En esta parte declaro que es esta clase es una subclase
 */
public class EstudianteB extends Estudiante{

    public EstudianteB(String carne, String nombreApellidos, String correo, String telefono, String nickname,
                       String tipoEstudiante, Integer notaPromedioE, Integer notaPromedioQ, Integer notaPromedioT,
                       Integer notaP1, Integer notaP2, Integer notaP3, String notaPromedioTipoA, String notaPromedioTipoB, Integer notaFinal){
        super (carne,nombreApellidos,correo,telefono,nickname,tipoEstudiante,notaPromedioE,notaPromedioQ,notaPromedioT,notaP1,notaP2,notaP3, notaPromedioTipoA,
                notaPromedioTipoB, notaFinal);
    }
    /*
En la parte de super declaro la herencia
 */
    /**
     * El mmetodo notaPromedio() de EstudianteB calcula el promedio especifico de esta sublclase
     */
    /*
En la parte inferior aplico override y polimorfismo (ya que este metodo y el de la otra subclase se llaman igual epro hacen cosas distintas)
 */
    @Override
    public String notaPromedio(){
        Integer res = 0;
        res = (getNotaP1() + getNotaP2() + getNotaP3()) / 3;
        setNotaPromedioTipoB(Integer.toString(res));
        return Integer.toString(res);
    }
    /**
     * El metodo notaFinal() calcula la nota final
     */
    public Integer notaFinal(){
        Integer res0 = 0;
        res0 = (getNotaPromedioE() + getNotaPromedioQ() + getNotaPromedioT() + ((getNotaPromedioE() + getNotaPromedioQ() + getNotaPromedioT()) / 3)) / 4;
        setNotaFinal(res0);
        return res0;
    }
}