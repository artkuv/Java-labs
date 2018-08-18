package other;

import car.car;
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
    private Label go, door, status, wheel, engine;
    private Button button1, button2, button3, button4, button5;

    public void start(Stage stage){
        tractor tractor = new tractor("Volvo");
        this.stage = stage;
        stage.setTitle("Car");
        pane = new Pane();

        go = new Label("Where are we go today?");
        door = new Label("Door");
        wheel = new Label("Wheel");
        status = new Label("Status:");
        engine = new Label("Engine");

        button1 = new Button("Go");
        button2 = new Button("Open door");
        button3 = new Button("Close door");
        button4 = new Button("Inflate wheel");
        button5 = new Button("Start engine");
        button1.setPrefSize(100,20);
        button2.setPrefSize(100,20);
        button3.setPrefSize(100,20);
        button4.setPrefSize(100,20);
        button5.setPrefSize(100,20);
        
        pane.getChildren().addAll(go, door, status, wheel, engine, button1, button2, button3, button4, button5);
        go.setLayoutX(165);

        door.setLayoutX(85);
        door.setLayoutY(50);

        wheel.setLayoutX(332);
        wheel.setLayoutY(50);

        engine.setLayoutX(539);
        engine.setLayoutY(50);
        
        button2.setLayoutY(100);
        
        button3.setLayoutX(100);
        button3.setLayoutY(100);

        button4.setLayoutX(300);
        button4.setLayoutY(100);

        button5.setLayoutX(498);
        button5.setLayoutY(100);

        status.setLayoutX(150);
        status.setLayoutY(150);

        button1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String end;
                end = tractor.go();
                status.setText(end);
            }
        });

        button2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String end;
                end = driver.rule(1);
                status.setText(end);
            }
        });

        button3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            	String end;
                end = driver.rule(2);
                status.setText(end);
            }
        });

        button4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            	String end;
                end = driver.inflate();
                status.setText(end);
            }
        });

        button5.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            	String end;
                end = tractor.rule(0);
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
