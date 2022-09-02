package main;


public class EstudianteA extends Estudiante{

    public EstudianteA(String carne, String nombreApellidos, String correo, String telefono, String nickname,
                       String tipoEstudiante, Integer notaPromedioE, Integer notaPromedioQ, Integer notaPromedioT,
                       Integer notaP1, Integer notaP2, Integer notaP3, String notaPromedioTipoA, String notaPromedioTipoB, Integer notaFinal){
        super (carne,nombreApellidos,correo,telefono,nickname,tipoEstudiante,notaPromedioE,notaPromedioQ,notaPromedioT,notaP1,notaP2,notaP3, notaPromedioTipoA,
                notaPromedioTipoB, notaFinal);
    }

    @Override
    public String notaPromedio(){
        Integer res1 = 0;
        res1 = (getNotaPromedioE() + getNotaPromedioQ() + getNotaPromedioT()) / 3;
        setNotaPromedioTipoA(Integer.toString(res1));
        return Integer.toString(res1);
    }

    public Integer notaFinal(){
        Integer res0 = 0;
        res0 = getNotaPromedioE() + getNotaPromedioQ() + getNotaPromedioT() + 1000;
        setNotaFinal(res0);
        return res0;
    }
}