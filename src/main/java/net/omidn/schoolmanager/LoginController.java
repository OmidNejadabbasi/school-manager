package net.omidn.schoolmanager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class LoginController {

    @FXML
    TextField userNameField;

    @FXML
    TextField passwordField;

    @FXML
    Button loginBtn;


    public void onLoginClicked(ActionEvent actionEvent) {

        ManageStage.show();

    }
}
