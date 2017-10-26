//Ovidio Castillo
//Purpose: To Display welcome messages for each choice of user
//Date: 10/25/2017
//License: GNU

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class seasons extends Application {

    public enum SystemSeason {January,February,March,April,May,June,July,August,September,October,November,December}

    public void start(Stage primaryStage) {
       SystemSeason accounts [] = {SystemSeason.January,SystemSeason.February, SystemSeason.March, SystemSeason.April, SystemSeason.May, SystemSeason.June, SystemSeason.July, SystemSeason.August, SystemSeason.September, SystemSeason.October, SystemSeason.November, SystemSeason.December };
        primaryStage.setTitle("Choose A Month");
        primaryStage.setWidth(350);
        ObservableList<SystemSeason> options = FXCollections.observableArrayList(accounts);
        ComboBox combobox = new ComboBox(options);

        String SystemSeason = null;

        switch (SystemSeason) {
            case "January":
                System.out.println("Would You Like to Build A Snowman?");
                break;
            case "February":
                System.out.println("Would You Like to Build A Snowman?");
                break;
            case "March":
                System.out.println("Happy Spring Days!");
                break;
            case "April":
                System.out.println("Happy Spring Days!");
                break;
            case "May":
                System.out.println("Happy Spring Days!");
                break;
            case "June":
                System.out.println("It's Summer time.");
                break;
            case "July":
                System.out.println("It's Summer time.");
                break;
            case "August":
                System.out.println("It's Summer time.");
                break;
            case "September":
                System.out.println("Welcome To the Foliage Season!");
                break;
            case "October":
                System.out.println("Welcome To the Foliage Season!");
                 break;
            case "November":
                System.out.println("Welcome To the Foliage Season!");
                break;
            case "December":
                System.out.println("Would You Like to Build A Snowman?");
                break;

        }

        FlowPane pane = new FlowPane();
        Button button = new Button("Cancel");
        button.setOnAction(e->System.exit(0));
        pane.getChildren().add(combobox);
        pane.getChildren().add(button);
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }}

