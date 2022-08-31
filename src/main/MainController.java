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
    private TableView<EstudianteA> diosVen;
    @FXML
    private TableColumn<EstudianteA, String> slotCarne;
    @FXML
    private TableColumn<EstudianteA, String> slotNombre;
    @FXML
    private TableColumn<EstudianteA, String> slotCorreo;
    @FXML
    private TableColumn<EstudianteA, String> slotTelef;
    @FXML
    private TableColumn<EstudianteA, String> slotNickname;
    @FXML
    private TableColumn<EstudianteA, String> slotTipo;
    @FXML
    private TableColumn<EstudianteA, Integer> slotNPE;
    @FXML
    private TableColumn<EstudianteA, Integer> slotNPQ;
    @FXML
    private TableColumn<EstudianteA, Integer> slotNPT;
    @FXML
    private TableColumn<EstudianteA, Integer> slotNP1;
    @FXML
    private TableColumn<EstudianteA, Integer> slotNP2;
    @FXML
    private TableColumn<EstudianteA, Integer> slotNP3;
    @FXML
    private TableColumn<EstudianteA, Integer> slotPA;
    @FXML
    private TableColumn<EstudianteA, Integer> slotPB;
    @FXML
    private TableColumn<EstudianteA, Integer> slotFinal;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        estudianteBS = FXCollections.observableArrayList();
        estudianteAS = FXCollections.observableArrayList();
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
        this.slotPA.setCellValueFactory(new PropertyValueFactory<>("notaPromedio)"));


    }
    @FXML
    private void empezarFiesta() throws Exception{
        int var = 1;
        int con = 0;

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
                    estudianteAS.add(new EstudianteA(listaBacana.get(0), listaBacana.get(1), listaBacana.get(2), listaBacana.get(3),
                            listaBacana.get(4), listaBacana.get(5), Integer.parseInt(listaBacana.get(6)), Integer.parseInt(listaBacana.get(7)),
                            Integer.parseInt(listaBacana.get(8)), Integer.parseInt(listaBacana.get(9)), Integer.parseInt(listaBacana.get(10)),
                            Integer.parseInt(listaBacana.get(11))));
                }
                else{
                    estudianteBS.add(new EstudianteB(listaBacana.get(0), listaBacana.get(1), listaBacana.get(2), listaBacana.get(3),
                            listaBacana.get(4), listaBacana.get(5), Integer.parseInt(listaBacana.get(6)), Integer.parseInt(listaBacana.get(7)),
                            Integer.parseInt(listaBacana.get(8)), Integer.parseInt(listaBacana.get(9)), Integer.parseInt(listaBacana.get(10)),
                            Integer.parseInt(listaBacana.get(11))));
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
            estudianteAS.add(new EstudianteA(listaBacana.get(0), listaBacana.get(1), listaBacana.get(2), listaBacana.get(3),
                    listaBacana.get(4), listaBacana.get(5), Integer.parseInt(listaBacana.get(6)), Integer.parseInt(listaBacana.get(7)),
                    Integer.parseInt(listaBacana.get(8)), Integer.parseInt(listaBacana.get(9)), Integer.parseInt(listaBacana.get(10)),
                    Integer.parseInt(listaBacana.get(11))));
        }
        else{
            estudianteBS.add(new EstudianteB(listaBacana.get(0), listaBacana.get(1), listaBacana.get(2), listaBacana.get(3),
                    listaBacana.get(4), listaBacana.get(5), Integer.parseInt(listaBacana.get(6)), Integer.parseInt(listaBacana.get(7)),
                    Integer.parseInt(listaBacana.get(8)), Integer.parseInt(listaBacana.get(9)), Integer.parseInt(listaBacana.get(10)),
                    Integer.parseInt(listaBacana.get(11))));
        }
        System.out.print(estudianteAS.get(1).notaPromedio() + "\n");
        System.out.print(estudianteBS.get(0).notaFinal());
        this.diosVen.setItems(estudianteAS);
        this.diosVen.setItems(estudianteBS);
        lector.close();
    }
}
