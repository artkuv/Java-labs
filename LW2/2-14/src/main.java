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
    private Label pat, med, status;
    private Button button1, button2, button3;

    public void start(Stage stage){
        this.stage = stage;
        stage.setTitle("At the doctor");
        pane = new Pane();

        pat = new Label("Patient");
        med = new Label("Medic");
        status = new Label("Status");

        button1 = new Button("Ñomplain");
        button2 = new Button("Diagnose");
        button3 = new Button("Heal");

        button1.setPrefSize(100,20);
        button2.setPrefSize(100,20);
        button3.setPrefSize(100,20);

        pane.getChildren().addAll(pat, med, status, button1, button2, button3);

        pat.setLayoutX(50);
        pat.setLayoutY(40);
        
        med.setLayoutX(250);
        med.setLayoutY(40);
        
        button1.setLayoutX(30);
        button1.setLayoutY(70);

        button2.setLayoutX(170);
        button2.setLayoutY(70);
        
        button3.setLayoutX(280);
        button3.setLayoutY(70);

        status.setLayoutX(135);
        status.setLayoutY(120);

        button1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String end;
                end = patient.complain();
                status.setText(end);
            }
        });

        button2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
              	issue issue = new issue();
                String end;
                end = medic.diagnose(issue);
                status.setText(end);
            }
        });
        
        button3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String end;
                end = medic.heal();
                status.setText(end);
            }
        });

        scene = new Scene(pane, 400, 150);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
    