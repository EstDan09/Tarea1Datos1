package main;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.Objects;

public class EstudianteB extends Estudiante{

    public EstudianteB(String carne, String nombreApellidos, String correo, String telefono, String nickname,
                       String tipoEstudiante, Integer notaPromedioE, Integer notaPromedioQ, Integer notaPromedioT,
                       Integer notaP1, Integer notaP2, Integer notaP3, String notaPromedioTipoA, String notaPromedioTipoB, Integer notaFinal){
        super (carne,nombreApellidos,correo,telefono,nickname,tipoEstudiante,notaPromedioE,notaPromedioQ,notaPromedioT,notaP1,notaP2,notaP3, notaPromedioTipoA,
                notaPromedioTipoB, notaFinal);
    }

    @Override
    public String notaPromedio(){
        Integer res = 0;
        res = (getNotaP1() + getNotaP2() + getNotaP3()) / 3;
        setNotaPromedioTipoB(Integer.toString(res));
        return Integer.toString(res);
    }

    public Integer notaFinal(){
        Integer res0 = 0;
        res0 = getNotaPromedioE() + getNotaPromedioQ() + getNotaPromedioT() + 1000;
        setNotaFinal(res0);
        return res0;
    }
}