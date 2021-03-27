package fzu.zrf.mtsys.client.gui;

import fzu.zrf.mtsys.client.conf.Configuration;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Register extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle(Configuration.BUNDLE.getString("register.title"));

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid);
        stage.setResizable(false);
        stage.setScene(scene);

        grid.add(new Label(Configuration.BUNDLE.getString("register.account.hint")), 0, 0);

        TextField account = new TextField();
        grid.add(account, 1, 0);

        grid.add(new Label(Configuration.BUNDLE.getString("register.password.hint")), 0, 2);

        PasswordField password = new PasswordField();
        grid.add(password, 1, 2);
        
        grid.add(new Label(Configuration.BUNDLE.getString("register.password.confirm.hint")), 0, 4);

        PasswordField confirm = new PasswordField();
        grid.add(confirm, 1, 4);

        HBox buttonBox = new HBox(10);
        buttonBox.setAlignment(Pos.BOTTOM_RIGHT);
        grid.add(buttonBox, 1, 6);

        Button register = new Button(Configuration.BUNDLE.getString("register.register.hint"));
        register.setOnAction(a -> {

        });
        buttonBox.getChildren().add(register);

        stage.show();
    }

}
