package com.github.berkbavas.game2048fx.application;

import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.util.Objects;

public class MainWindow extends Application {
    static {
        Font.loadFont(Objects.requireNonNull(MainWindow.class.getResource("/font/ClearSans-Regular.ttf")).toExternalForm(), 0);
        Font.loadFont(Objects.requireNonNull(MainWindow.class.getResource("/font/ClearSans-Medium.ttf")).toExternalForm(), 0);
        Font.loadFont(Objects.requireNonNull(MainWindow.class.getResource("/font/ClearSans-Light.ttf")).toExternalForm(), 0);
        Font.loadFont(Objects.requireNonNull(MainWindow.class.getResource("/font/ClearSans-Thin.ttf")).toExternalForm(), 0);
        Font.loadFont(Objects.requireNonNull(MainWindow.class.getResource("/font/ClearSans-Bold.ttf")).toExternalForm(), 0);
    }

    GameManager manager = new GameManager();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(manager.getRoot());
        scene.setOnKeyPressed(event -> {
            manager.move(event.getCode());
        });

        // Icons
        stage.getIcons().add(new Image(Objects.requireNonNull(MainWindow.class.getResource("/icons/2048-icon-512.png")).toExternalForm()));
        stage.getIcons().add(new Image(Objects.requireNonNull(MainWindow.class.getResource("/icons/2048-icon-256.png")).toExternalForm()));
        stage.getIcons().add(new Image(Objects.requireNonNull(MainWindow.class.getResource("/icons/2048-icon-128.png")).toExternalForm()));
        stage.getIcons().add(new Image(Objects.requireNonNull(MainWindow.class.getResource("/icons/2048-icon-64.png")).toExternalForm()));
        stage.getIcons().add(new Image(Objects.requireNonNull(MainWindow.class.getResource("/icons/2048-icon-32.png")).toExternalForm()));

        // Bounds
        Bounds bounds = manager.getContainer().getLayoutBounds();
        Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();
        double factor = Math.min(visualBounds.getWidth() / bounds.getWidth(), visualBounds.getHeight() / bounds.getHeight());

        stage.setMinWidth(bounds.getWidth() / 1.25);
        stage.setMinHeight(bounds.getHeight() / 1.25);
        stage.setWidth(bounds.getWidth() * factor / 1.2);
        stage.setHeight(bounds.getHeight() * factor / 1.2);


        stage.setTitle("2048");
        stage.setScene(scene);
        stage.show();
    }
}
