package main;

import javafx.beans.property.ReadOnlyIntegerProperty;
import javafx.beans.property.ReadOnlyStringProperty;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.event.ActionEvent;
import java.io.File;
import java.net.URL;
import java.util.*;

public class MainController implements Initializable {
    private ObservableList<Estudiante> estudianteS;
    private ArrayList<EstudianteA> estudiA = new ArrayList<>();
    private ArrayList<EstudianteB> estudiB = new ArrayList<>();
    @FXML
    private TableView<Estudiante> diosVen;
    @FXML
    private TableColumn<Estudiante, String> slotCarne;
    @FXML
    private TableColumn<Estudiante, String> slotNombre;
    @FXML
    private TableColumn<Estudiante, String> slotCorreo;
    @FXML
    private TableColumn<Estudiante, String> slotTelef;
    @FXML
    private TableColumn<Estudiante, String> slotNickname;
    @FXML
    private TableColumn<Estudiante, String> slotTipo;
    @FXML
    private TableColumn<Estudiante, Integer> slotNPE;
    @FXML
    private TableColumn<Estudiante, Integer> slotNPQ;
    @FXML
    private TableColumn<Estudiante, Integer> slotNPT;
    @FXML
    private TableColumn<Estudiante, Integer> slotNP1;
    @FXML
    private TableColumn<Estudiante, Integer> slotNP2;
    @FXML
    private TableColumn<Estudiante, Integer> slotNP3;
    @FXML
    private TableColumn<Estudiante, Integer> slotPA;
    @FXML
    private TableColumn<Estudiante, Integer> slotPB;
    @FXML
    private TableColumn<Estudiante, Integer> slotFinal;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        estudianteS = FXCollections.observableArrayList();
        this.slotCarne.setCellValueFactory(new PropertyValueFactory<>("carne"));
        this.slotNombre.setCellValueFactory(new PropertyValueFactory<>("nombreApellidos"));
        this.slotCorreo.setCellValueFactory(new PropertyValueFactory<>("correo"));
        this.slotTelef.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        this.slotNickname.setCellValueFactory(new PropertyValueFactory<>("nickname"));
        this.slotTipo.setCellValueFactory(new PropertyValueFactory<>("tipoEstudiante"));
        this.slotNPE.setCellValueFactory(new PropertyValueFactory<>("notaPromedioE"));
        this.slotNPQ.setCellValueFactory(new PropertyValueFactory<>("notaPromedioQ"));
        this.slotNPT.setCellValueFactory(new PropertyValueFactory<>("notaPromedioT"));
        this.slotNP1.setCellValueFactory(new PropertyValueFactory<>("notaP1"));
        this.slotNP2.setCellValueFactory(new PropertyValueFactory<>("notaP2"));
        this.slotNP3.setCellValueFactory(new PropertyValueFactory<>("notaP3"));
        this.slotPA.setCellValueFactory(new PropertyValueFactory<>("notaPromedioTipoA"));
        this.slotPB.setCellValueFactory(new PropertyValueFactory<>("notaPromedioTipoB"));
        this.slotFinal.setCellValueFactory(new PropertyValueFactory<>("notaFinal"));


    }
    @FXML
    private void empezarFiesta() throws Exception{
        int var = 1;
        int con = 0;
        int n = 0;
        int m = 0;

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
                            Integer.parseInt(listaBacana.get(11))," "," ",0));
                }
                else{
                    estudiB.add(new EstudianteB(listaBacana.get(0), listaBacana.get(1), listaBacana.get(2), listaBacana.get(3),
                            listaBacana.get(4), listaBacana.get(5), Integer.parseInt(listaBacana.get(6)), Integer.parseInt(listaBacana.get(7)),
                            Integer.parseInt(listaBacana.get(8)), Integer.parseInt(listaBacana.get(9)), Integer.parseInt(listaBacana.get(10)),
                            Integer.parseInt(listaBacana.get(11))," "," ",0));
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
                    Integer.parseInt(listaBacana.get(11))," "," ",0));
        }
        else{
            estudiB.add(new EstudianteB(listaBacana.get(0), listaBacana.get(1), listaBacana.get(2), listaBacana.get(3),
                    listaBacana.get(4), listaBacana.get(5), Integer.parseInt(listaBacana.get(6)), Integer.parseInt(listaBacana.get(7)),
                    Integer.parseInt(listaBacana.get(8)), Integer.parseInt(listaBacana.get(9)), Integer.parseInt(listaBacana.get(10)),
                    Integer.parseInt(listaBacana.get(11))," "," ",0));
        }
        while(n < estudiA.size()){
            estudiA.get(n).notaFinal();
            estudiA.get(n).notaPromedio();
            n++;
        }
        while(m < estudiB.size()){
            estudiB.get(m).notaFinal();
            estudiB.get(m).notaPromedio();
            m++;
        }
        System.out.print(estudiA.get(1).notaFinal() + "\n");
        System.out.print(estudiB.get(0).notaFinal());
        estudianteS.addAll(estudiA);
        estudianteS.addAll(estudiB);
        this.diosVen.setItems(estudianteS);
        lector.close();
    }
}
