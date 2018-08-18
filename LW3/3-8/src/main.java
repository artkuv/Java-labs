import client.client;
import company.manager;
import company.order;
import company.rushorder;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class main extends Application {
    private Stage stage;
    private Scene scene;
    private Pane pane;
    private Label clien, comp, rush, status;
    private Button button1, button2, button3, button4, button5;

    public void start(Stage stage){
        this.stage = stage;
        stage.setTitle("Order");
        pane = new Pane();

        clien = new Label("Client");
        comp = new Label("Company");
        rush = new Label("Rush order");
        status = new Label("Status:");
        
        button1 = new Button("To order");
        button2 = new Button("Pay");
        button3 = new Button("Change name");
        button4 = new Button("Change plan");
        button5 = new Button("Check time");
        button1.setPrefSize(100,20);
        button2.setPrefSize(100,20);
        button3.setPrefSize(110,20);
        button4.setPrefSize(100,20);
        button5.setPrefSize(100,20);
        
        pane.getChildren().addAll(clien, comp, rush, status, button1, button2, button3, button4, button5);
        
        clien.setLayoutX(85);
        clien.setLayoutY(50);

        comp.setLayoutX(332);
        comp.setLayoutY(50);

        rush.setLayoutX(518);
        rush.setLayoutY(50);
        
        button1.setLayoutX(10);
        button1.setLayoutY(100);
        
        button2.setLayoutX(110);
        button2.setLayoutY(100);

        button3.setLayoutX(250);
        button3.setLayoutY(100);

        button4.setLayoutX(360);
        button4.setLayoutY(100);
        
        button5.setLayoutX(500);
        button5.setLayoutY(100);

        status.setLayoutX(150);
        status.setLayoutY(150);

        button1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String end;
                end = client.getorder();
                status.setText(end);
            }
        });

        button2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String end;
                end = client.givemoney();
                status.setText(end);
            }
        });

        button3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            	String end;
                end = manager.chname();
                status.setText(end);
            }
        });

        button4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            	String end;
                end = manager.chplan();
                status.setText(end);
            }
        });

        button5.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            	String end;
                end = rushorder.check();
                status.setText(end);
            }
        });
        
        scene = new Scene(pane, 588, 200);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
