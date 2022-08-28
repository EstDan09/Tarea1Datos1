package main;

import java.util.Objects;

public class EstudianteA extends Estudiante{

    public EstudianteA(String carne, String nombreApellidos, String correo, String telefono, String nickname,
                      String tipoEstudiante, Integer notaPromedioE, Integer notaPromedioQ, Integer notaPromedioT,
                      Integer notaP1, Integer notaP2, Integer notaP3){
        super (carne,nombreApellidos,correo,telefono,nickname,tipoEstudiante,notaPromedioE,notaPromedioQ,notaPromedioT,notaP1,notaP2,notaP3);
    }


    @Override
    public double notaPromedio(){
        double res = 0.0;
        if (Objects.equals(getTipoEstudiante(), "A")){
            res = (getNotaPromedioE() + getNotaPromedioQ() + getNotaPromedioT()) / 3.0;
        }
        return res;
    }


}