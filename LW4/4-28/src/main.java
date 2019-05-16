import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class main extends Application {
    private Stage stage;
    private Scene scene;
    private Pane pane;
    private Label num, result;
    private Button compare;
    private TextField first, second;
    boolean flag;
    String name;

    public void start(Stage stage){
        this.stage = stage;
        stage.setTitle("Comparator");
        pane = new Pane();

        first = new TextField();
        second = new TextField();
        num = new Label("");
        result = new Label("");
        compare = new Button("Comapare");

        compare.setPrefSize(200,20);
        first.setPrefSize(180, 20);
        second.setPrefSize(180, 20);
        
        pane.getChildren().addAll(first, second, num, result, compare);
        
        num.setLayoutX(100);
        num.setLayoutY(100);

        result.setLayoutX(200);
        result.setLayoutY(100);

        compare.setLayoutX(105);
        compare.setLayoutY(60);
        
        first.setLayoutX(20);
        first.setLayoutY(20);

        second.setLayoutX(220);
        second.setLayoutY(20);

        compare.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            	String str1 = first.getText();
            	String str2 = second.getText();
            	
            	if(str1.length()==str2.length())
            	{
                        for (int i = 0; i <= str1.length(); i++)
                        { 
		        Comporator comp = new Comporator();	//Создание потока
			
			comp.start();	//Запуск потока
			
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){}
			
			comp.finish();	//Инициация завершения побочного потока   
            	}
            	else 
            		result.setText("Words are not equal!");
                
            }
        });

        scene = new Scene(pane, 400, 130);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
