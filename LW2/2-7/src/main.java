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
    private Label go, engine, wheel, fueltank, result, status;
    private Button button1, button2, button3, button4;

    public void start(Stage stage){
        car car = new car("BMW");
        this.stage = stage;
        stage.setTitle("Car");
        pane = new Pane();

        go = new Label("Hi,where are we going today?");
        engine = new Label("Engine");
        wheel = new Label("Wheel");
        fueltank = new Label("Fueltank");
        result = new Label("Result");
        status = new Label("Engine status:");

        button1 = new Button("Go");
        button2 = new Button("Start");
        button3 = new Button("Get fuel");
        button4 = new Button("Rotate");
        button1.setPrefSize(100,20);
        button2.setPrefSize(100,20);
        button3.setPrefSize(100,20);
        button4.setPrefSize(100,20);

        pane.getChildren().addAll(go, engine, wheel, fueltank, result, status, button1, button2, button3, button4);
        go.setLayoutX(165);

        engine.setLayoutX(85);
        engine.setLayoutY(50);

        wheel.setLayoutX(280);
        wheel.setLayoutY(50);
        
        fueltank.setLayoutX(470);
        fueltank.setLayoutY(50);

        button2.setLayoutX(65);
        button2.setLayoutY(100);

        button3.setLayoutX(250);
        button3.setLayoutY(100);

        button4.setLayoutX(450);
        button4.setLayoutY(100);

        status.setLayoutX(150);
        status.setLayoutY(170);

        result.setLayoutX(150);
        result.setLayoutY(150);

        button1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String end;
                end = car.go();
                result.setText(end);
            }
        });

        button2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String end;
                end = car.rule(0,1);
                result.setText(end);
                status.setText(car.rule(0,2));
            }
        });

        button3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String end;
                end = car.rule(1,1);
                result.setText(end);
            }
        });

        button4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String end;
                end = car.rule(2,1);
                result.setText(end);
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
    