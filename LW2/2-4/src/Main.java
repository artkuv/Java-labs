import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    private Stage stage;
    private Scene scene;
    private Pane pane;
    private Label mozg, nos, rot, result, result2, status;
    private Button button1, button2, button3, button4;

    public void start(Stage stage){
        Brain brain = new Brain(90);
        this.stage = stage;
        stage.setTitle("Human");
        pane = new Pane();

        mozg = new Label("Hi, I am brain! Which organ you would like to rule?");
        nos = new Label("Nose");
        rot = new Label("Mouth");
        result = new Label("");
        result2 = new Label("");
        status = new Label("Status:");

        button1 = new Button("Sniff");
        button2 = new Button("Itch");
        button3 = new Button("Eat");
        button4 = new Button("Speak");
        button1.setPrefSize(100,20);
        button2.setPrefSize(100,20);
        button3.setPrefSize(100,20);
        button4.setPrefSize(100,20);

        pane.getChildren().addAll(mozg,nos,rot,button1,button2,button3,button4,status,result, result2);
        mozg.setLayoutX(165);

        nos.setLayoutX(85);
        nos.setLayoutY(50);

        rot.setLayoutX(332);
        rot.setLayoutY(50);

        button1.setLayoutY(100);

        button2.setLayoutX(100);
        button2.setLayoutY(100);

        button3.setLayoutX(250);
        button3.setLayoutY(100);

        button4.setLayoutX(350);
        button4.setLayoutY(100);

        status.setLayoutX(150);
        status.setLayoutY(150);

        result.setLayoutX(200);
        result.setLayoutY(150);

        result2.setLayoutX(250);
        result2.setLayoutY(170);

        button1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String end;
                end = brain.getResult(0,1);
                result.setText(end);
            }
        });

        button2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String end;
                end = brain.getResult(0,2);
                result.setText(end);
            }
        });

        button3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String end;
                end = brain.getResult(1,1);
                result.setText(end);
            }
        });

        button4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String end;
                end = brain.getResult(1,2);
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
