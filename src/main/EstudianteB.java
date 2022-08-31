package main;

import java.util.Objects;

public class EstudianteB extends Estudiante{

    public EstudianteB(String carne, String nombreApellidos, String correo, String telefono, String nickname,
                       String tipoEstudiante, Integer notaPromedioE, Integer notaPromedioQ, Integer notaPromedioT,
                       Integer notaP1, Integer notaP2, Integer notaP3){
        super (carne,nombreApellidos,correo,telefono,nickname,tipoEstudiante,notaPromedioE,notaPromedioQ,notaPromedioT,notaP1,notaP2,notaP3);
    }


    @Override
    public double notaPromedio(){
        double res = 0.0;
        res = (getNotaP1() + getNotaP2() + getNotaP3()) / 3.0;
        return res;
    }

    public double notaFinal(){
        double res0 = 0.0;
        res0 = getNotaPromedioE() + getNotaPromedioQ() + getNotaPromedioT() + 1000.0;
        return res0;
    }

}