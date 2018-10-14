package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;



   /* @FXML
    public void onClickMethod(){
        btn1.setText("Thanks!");
    }

    @FXML
    public void onClickMethod2(){
        btn2.setOnAction(EventHandler<>);
    }*/


    @FXML

    public void handleButtonAction( ActionEvent event) throws Exception {
        Stage stage = null;
        Parent root = null;

        if(event.getSource()==btn1){
           /* stage = (Stage) btn1.getScene().getWindow();*/
            btn1.setText("Toogled!");
        }
        else {
            if (event.getSource() == btn2) {
                stage = (Stage) btn2.getScene().getWindow();
                try {
                    root = FXMLLoader.load(getClass().getClassLoader().getResource("f2.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                stage = (Stage) btn3.getScene().getWindow();
                try {
                    root = FXMLLoader.load(getClass().getClassLoader().getResource("sample.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

/*    @FXML
    public void initialize(){
        btn1.addEventHandler(
                MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        btn1.setText("Toggled!");
                    }
                }
        );
    }*/
}
