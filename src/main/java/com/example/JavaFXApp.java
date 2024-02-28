package com.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXApp extends Application {
    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;

        showLoginScene();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void showLoginScene() {
        BorderPane loginPane = new BorderPane();
        loginPane.setPadding(new Insets(20));

        VBox loginBox = new VBox(10);
        loginBox.setPadding(new Insets(10));

        Label titleLabel = new Label("Login");
        TextField usernameField = new TextField();
        usernameField.setPromptText("Username");
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");
        Button loginButton = new Button("Login");

        loginButton.setOnAction(e -> showHomeScene());

        loginBox.getChildren().addAll(titleLabel, usernameField, passwordField, loginButton);

        loginPane.setCenter(loginBox);

        Scene loginScene = new Scene(loginPane, 400, 300);
        primaryStage.setTitle("JavaFX Maven App - Login");
        primaryStage.setScene(loginScene);
        primaryStage.show();
    }

    public void showHomeScene() {
        StackPane homePane = new StackPane();
        homePane.setPadding(new Insets(20));

        Label welcomeLabel = new Label("Welcome to the Home Page!");

        homePane.getChildren().add(welcomeLabel);

        Scene homeScene = new Scene(homePane, 400, 300);
        primaryStage.setTitle("JavaFX Maven App - Home");
        primaryStage.setScene(homeScene);
        primaryStage.show();
    }
}
