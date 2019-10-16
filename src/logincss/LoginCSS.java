/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginCSS;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.color;

import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class LoginCSS extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //Creamos el grid
        GridPane grid=new GridPane();
        //Alineamos el grid de manera central
        grid.setAlignment(Pos.CENTER);
        //Separa las columnas del grid
        grid.setHgap(10);
        //Separa las filas del grid
        grid.setVgap(10);
        //El setPadding mueve el contenido ya sea arriba, abajo, izquierda o derecha
        grid.setPadding(new Insets(25,25,25,25));
        
        //Creamos una escena y le añadimos el grid
        Scene escena=new Scene(grid,512, 287);
        primaryStage.setScene(escena);
        escena.getStylesheets().add(LoginCSS.class.getResource("LoginCSS.css").toExternalForm());
        //Creamos un titulo para la ventana
        primaryStage.setTitle("Login con CSS");
        primaryStage.show();
        
        //Creamos un titulo dentro de la ventana.
        Text titulo=new Text("Bienvenido");
        titulo.setId("bienvenido");
        //Añadimos ese titulo al grid
        grid.add(titulo,0,0,2,1);
        //Creamos una etiqueta usuario y la añadimos al grid
        Label usuario=new Label("Usuario");
        grid.add(usuario,0,1);
        //Creamos un recuadro para introducir un usuario y lo añadimos al grid
        TextField usuarioTextField=new TextField();
        grid.add(usuarioTextField, 1,1);
        //Creamos una etiqueta contraseña y la añadimos al grid
        Label contraseña=new Label("Contraseña");
        //Los numeros indican la posicion, primero fila y luego columna
        grid.add(contraseña,0,2);
        //Creamos un recuadro para introducir una contraseña y la añadimos al grid
        PasswordField contraseñaBox=new PasswordField();
        //Los numeros indican la posicion, primero fila y luego columna
        grid.add(contraseñaBox, 1,2);
        
        Button conectar=new Button("Conectar");
        HBox btn=new HBox(10);
        btn.setAlignment(Pos.BOTTOM_RIGHT);
        btn.getChildren().add(conectar);
        grid.add(btn,1,4);
        
        final Text actiontarget=new Text();
        actiontarget.setId("accion");
        grid.add(actiontarget, 1,5);
        
        conectar.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e){
            actiontarget.setFill(Color.FIREBRICK);
            actiontarget.setText("Conectando...");
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}