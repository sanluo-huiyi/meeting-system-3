package fzu.zrf.mtsys.client.gui;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
/**
 * @ClassName SecretaryAddMessage
 * @Description TODO
 * @Author Charley Chen
 * @DATE 2021/3/27 16:11
 * @Version 1.0
 **/
public class SecretaryAddMessage extends Application {
    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("秘书，添加消息");
        stage.setWidth(450);
        stage.setHeight(500);
        Label label1 = new Label("消息标题");
        TextField textField = new TextField ();
        HBox hb = new HBox();
        hb.getChildren().addAll(label1, textField);
        hb.setSpacing(10);

        Label label2 = new Label("消息正文");
        TextArea textArea = new TextArea ();
        textArea.setPrefSize(300,300);
        textArea.setWrapText(true);
        HBox hb2 = new HBox();
        hb2.getChildren().addAll(label2, textArea);
        hb2.setSpacing(10);

        final VBox vbox = new VBox();
        vbox.setSpacing(50);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(hb,hb2);
        ((Group) scene.getRoot()).getChildren().addAll(vbox);
        stage.setScene(scene);
        stage.show();
    }
}
