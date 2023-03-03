/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbgui;
import java.sql.SQLException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author salmamabrouk
 */
public class DBGUI extends Application {

    int i = 0;
    TextField NameArea = new TextField();
    TextField EmailArea = new TextField();
    TextField CellArea = new TextField();
    Label title = new Label("Contact View");
    Label NameLabel = new Label("Name");
    Label EmailLabel = new Label("Email");
    Label CellLabel = new Label("Cell Phone");
    Button firstbtn = new Button("First");
    Button prevbtn = new Button("Previous");
    Button nextbtn = new Button("Next");
    Button lastbtn = new Button("Last");

    BorderPane borderpane;
    FlowPane flowpanebtn;
    FlowPane flowpanelbl;
    FlowPane flowpanetxt;
    static ContactDAO c = new ContactDAO();
    ArrayList<ContactPerson> person = c.Select();

    @Override
    public void init() throws Exception {
        super.init(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        borderpane = new BorderPane();
        flowpanelbl = new FlowPane(Orientation.VERTICAL, 30.0, 30.0, NameLabel, EmailLabel, CellLabel);
        flowpanetxt = new FlowPane(Orientation.VERTICAL, 30.0, 30.0, NameArea, EmailArea, CellArea);
        flowpanebtn = new FlowPane(firstbtn, prevbtn, nextbtn, lastbtn);
        borderpane.setTop(title);
        borderpane.setLeft(flowpanelbl);
        borderpane.setRight(flowpanetxt);
        borderpane.setBottom(flowpanebtn);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(borderpane, 400, 500);
        primaryStage.setTitle("Mai's DB GUI");
        primaryStage.setScene(scene);

        //////////////////////////
        firstbtn.setOnAction((ActionEvent event) -> {
            i = 0;
            NameArea.setText(person.get(i).getName());
            EmailArea.setText(person.get(i).getEmail());
            CellArea.setText(person.get(i).getCellPhone());
        });
        prevbtn.setOnAction((ActionEvent event) -> {
            if (i > 0) {
                i--;
                NameArea.setText(person.get(i).getName());
                EmailArea.setText(person.get(i).getEmail());
                CellArea.setText(person.get(i).getCellPhone());
            }  else if (i <= 0) {
                Alert a = new Alert(AlertType.NONE);
                a.setAlertType(AlertType.INFORMATION);
                a.setContentText("Enough! There's no More to Show!");
                a.show();
                i=0;
            }
            else if (i == 0) {
                NameArea.setText(person.get(i).getName());
                EmailArea.setText(person.get(i).getEmail());
                CellArea.setText(person.get(i).getCellPhone());
            }
        });
        nextbtn.setOnAction((ActionEvent event) -> {
            if (i <person.size()) {
                i++;
                NameArea.setText(person.get(i).getName());
                EmailArea.setText(person.get(i).getEmail());
                CellArea.setText(person.get(i).getCellPhone());
            }
             else if (i >= person.size()) {
                Alert a = new Alert(AlertType.NONE);
                a.setAlertType(AlertType.INFORMATION);
                a.setContentText("Enough! There's no More to Show!");
                a.show();
                i=person.size()-1;
            }
             else if (i ==person.size()-1) {
               
                NameArea.setText(person.get(i).getName());
                EmailArea.setText(person.get(i).getEmail());
                CellArea.setText(person.get(i).getCellPhone());
            }
            
        });
         lastbtn.setOnAction((ActionEvent event) -> {
             i=person.size()-1;
            NameArea.setText(person.get(i).getName());
            EmailArea.setText(person.get(i).getEmail());
            CellArea.setText(person.get(i).getCellPhone());
        });

        ////////////////////////////
        primaryStage.show();
    }

    public static void main(String[] args) {

        System.out.println("DB!");
        try {
            c.Connect();
        } catch (SQLException s) {
            System.out.println(s.getMessage());
        }
        Application.launch(args);
    }

}
