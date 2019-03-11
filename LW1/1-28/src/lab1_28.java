import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class lab1_28 extends Application {
	private Scene scene;
	private Pane pane;
	private Label label, text;
	private Button button;
	private TextField count;

	public void start(Stage stage) {
		stage.setTitle("Блуждатель 3000");
		stage.centerOnScreen();
		pane = new Pane();

		label = new Label("Результат:");
		text = new Label("Количество блужданий");
		count = new TextField();
		button = new Button("Получить");

		button.setPrefSize(110, 20);
		count.setPrefSize(90, 20);
		

		pane.getChildren().addAll(label, text, button, count);

		text.setLayoutX(30);
		text.setLayoutY(20);
		
		label.setLayoutX(30);
		label.setLayoutY(65);
		
		count.setLayoutX(188);
		count.setLayoutY(15);
		
		button.setLayoutX(160);
		button.setLayoutY(60);

		button.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Random ran = new Random();
				int end = ran.nextInt(Integer.parseInt(count.getText()));
				label.setText("Результат: " + Integer.toString(end));
			}
		});

		scene = new Scene(pane, 300, 100);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
