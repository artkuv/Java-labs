import book.book;
import book.story;
import human.reader;
import human.writer;
import human.critic;
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
    private Label read, write, crit, status;
    private Button button1, button2, button3, button4;

    public void start(Stage stage){
    	book book = new story(0);
        this.stage = stage;
        stage.setTitle("Book");
        pane = new Pane();

        read = new Label("Reader");
        write = new Label("Writer");
        crit = new Label("Critic");
        status = new Label("Status");

        button1 = new Button("Write a book");
        button2 = new Button("Read a book");
        button3 = new Button("Give review");
        button4 = new Button("Give critique");

        button1.setPrefSize(100,20);
        button2.setPrefSize(100,20);
        button3.setPrefSize(100,20);
        button4.setPrefSize(100,20);

        pane.getChildren().addAll(read, write, crit, status, button1, button2, button3, button4);

        write.setLayoutX(50);
        write.setLayoutY(40);
        
        read.setLayoutX(250);
        read.setLayoutY(40);
        
        crit.setLayoutX(450);
        crit.setLayoutY(40);
        
        button1.setLayoutX(30);
        button1.setLayoutY(70);

        button2.setLayoutX(170);
        button2.setLayoutY(70);
        
        button3.setLayoutX(280);
        button3.setLayoutY(70);
        
        button4.setLayoutX(400);
        button4.setLayoutY(70);

        status.setLayoutX(135);
        status.setLayoutY(120);

        button1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String end;
                end = writer.write(book);
                status.setText(end);
            }
        });

        button2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String end;
                end = reader.read(book);
                status.setText(end);
            }
        });
        
        button3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String end;
                end = reader.givereview();
                status.setText(end);
            }
        });
        
        button4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String end;
                end = critic.write(book);
                status.setText(end);
            }
        });

        scene = new Scene(pane, 500, 150);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
    