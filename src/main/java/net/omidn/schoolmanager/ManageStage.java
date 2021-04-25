package net.omidn.schoolmanager;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ManageStage {

    private static Stage stage;
    private static Scene scene;

    public static void show(){
        Parent root = null;
        try {
            root = FXMLLoader.load(ManageStage.class.getClassLoader().getResource("stage-management.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        scene = new Scene(root);

        stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

}
