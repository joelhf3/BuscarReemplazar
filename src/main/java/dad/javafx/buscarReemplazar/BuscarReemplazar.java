package dad.javafx.buscarReemplazar;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarReemplazar extends Application {

	private Label lblBuscar, lblReemplazar;
	private Button btnBuscar, btnReemplazar, btnTodo, btnCerrar, btnAyuda;
	private TextField tfBuscar, tfReemplazar;
	private CheckBox cbMayusMinus, cbAtras, cbExpresion, cbResaltar;
	private BorderPane contenedor;
	private VBox derecha;
	private GridPane izquierda;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		lblBuscar = new Label("Buscar:");
		lblReemplazar = new Label("Reemplazar con:");
		
		btnBuscar = new Button("Buscar");
		btnBuscar.setMaxWidth(Double.MAX_VALUE);
		btnReemplazar = new Button("Reemplazar");
		btnReemplazar.setMaxWidth(Double.MAX_VALUE);
		btnTodo = new Button("Reemplazar todo");
		btnTodo.setMaxWidth(Double.MAX_VALUE);
		btnCerrar = new Button("Cerrar");
		btnCerrar.setMaxWidth(Double.MAX_VALUE);
		btnAyuda = new Button("Ayuda");
		btnAyuda.setMaxWidth(Double.MAX_VALUE);
				
		cbMayusMinus = new CheckBox("Mayúsculas y Minúsculas");
		cbExpresion = new CheckBox("Expresión regular");
		cbAtras = new CheckBox("Buscar hacia atrás");
		cbResaltar = new CheckBox("Resaltar resultados");
		
		izquierda = new GridPane();
		
		derecha = new VBox(btnBuscar, btnReemplazar, btnTodo, btnCerrar, btnAyuda);
		derecha.setSpacing(5);
		derecha.setPadding(new Insets(5));
		derecha.setStyle("-fx-background-color: orange;");

		contenedor = new BorderPane();
		contenedor.setLeft(izquierda);
		contenedor.setRight(derecha);
		
		Scene scene = new Scene(contenedor, 600, 300);
		primaryStage.setTitle("Buscar y Reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}