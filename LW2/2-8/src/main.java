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
    private Label clien, status;
    private Button button1, button2;

    public void start(Stage stage){
        this.stage = stage;
        stage.setTitle("Order");
        pane = new Pane();

        clien = new Label("Client");
        status = new Label("Status");

        button1 = new Button("Make an order");
        button2 = new Button("Pay");
        button1.setPrefSize(120,20);
        button2.setPrefSize(120,20);

        pane.getChildren().addAll(clien, status, button1, button2);

        clien.setLayoutX(135);
        clien.setLayoutY(30);
        
        button1.setLayoutX(30);
        button1.setLayoutY(70);

        button2.setLayoutX(170);
        button2.setLayoutY(70);

        status.setLayoutX(135);
        status.setLayoutY(120);

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

        scene = new Scene(pane, 300, 150);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
    