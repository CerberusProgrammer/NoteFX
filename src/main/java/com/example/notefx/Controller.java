package com.example.notefx;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label labelWelcome;

    @FXML
    private VBox boxNotes;

    @FXML
    private TilePane tileImportantNotes;

    @FXML
    private TextField fieldTitulo;

    @FXML
    private Button cancelButton;

    @FXML
    Button addNote;

    @FXML
    private TextArea fieldContent;

    ArrayList<Note> notes = new ArrayList<>();
    public static Stage stage = new Stage();

    @FXML
    void createNote(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("note.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 720);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void addNewNote(ActionEvent event) {
        Note note = new Note(fieldTitulo.getText(), LocalDate.now().toString(), fieldContent.getText());
        notes.add(note);
        stage.close();
    }

    @FXML
    void cancelNewNote(ActionEvent event) {
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}