import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Pane areaResult;

    @FXML
    private Button btnGuardar;

    @FXML
    private Button btnLimpiar;

    @FXML
    private Label lblCodigo;

    @FXML
    private Label lblDatosPersona;

    @FXML
    private Label lblEmail;

    @FXML
    private Label lblNombre;

    @FXML
    private Label lblResultados;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtNombre;
    
    //definiendi variable atributo del modelo
    
    private Persona persona;

    @FXML
    void LimpiarDatos(ActionEvent event) {

    }

    @FXML
    void codigoInt(ActionEvent event) {

    }

    @FXML
    void emailInt(ActionEvent event) {

    }

    @FXML
    void guardarDatos(ActionEvent event) {

    }

    @FXML
    void nombreInt(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert areaResult != null : "fx:id=\"areaResult\" was not injected: check your FXML file 'Untitled'.";
        assert btnGuardar != null : "fx:id=\"btnGuardar\" was not injected: check your FXML file 'Untitled'.";
        assert btnLimpiar != null : "fx:id=\"btnLimpiar\" was not injected: check your FXML file 'Untitled'.";
        assert lblCodigo != null : "fx:id=\"lblCodigo\" was not injected: check your FXML file 'Untitled'.";
        assert lblDatosPersona != null : "fx:id=\"lblDatosPersona\" was not injected: check your FXML file 'Untitled'.";
        assert lblEmail != null : "fx:id=\"lblEmail\" was not injected: check your FXML file 'Untitled'.";
        assert lblNombre != null : "fx:id=\"lblNombre\" was not injected: check your FXML file 'Untitled'.";
        assert lblResultados != null : "fx:id=\"lblResultados\" was not injected: check your FXML file 'Untitled'.";
        assert txtCodigo != null : "fx:id=\"txtCodigo\" was not injected: check your FXML file 'Untitled'.";
        assert txtEmail != null : "fx:id=\"txtEmail\" was not injected: check your FXML file 'Untitled'.";
        assert txtNombre != null : "fx:id=\"txtNombre\" was not injected: check your FXML file 'Untitled'.";

    }

}


