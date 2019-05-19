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
	
	public class Comporator extends Thread
	{
    		private volatile boolean mFinish = false;

    		public void finish()		//Инициирует завершение потока
    		{
    			mFinish = true;
    		}

    		public void run()
    		{
    			do
    			{
    				if(!mFinish)	//Проверка на необходимость завершения
    				{
    					if(str1.equals(str2))	
    						flag = true;
    					else
    						flag = false;
    			        }
    				else
    					return;		//Завершение потока

    				try{
    					Thread.sleep(1000);
    				}catch(InterruptedException e){}
    			}
    			while(true); 
    		}
    		
    		
    }
	
	public Stage stage;
	public Scene scene;
	public Pane pane;
    public Label result;
    public Button compare;
    public TextField first, second;
    public boolean flag;
    public String str1, str2;
    public void start(Stage stage){
        this.stage = stage;
        stage.setTitle("Comparator");
        pane = new Pane();

        first = new TextField();
        second = new TextField();
        result = new Label("");
        compare = new Button("Comapare");

        compare.setPrefSize(200,20);
        first.setPrefSize(180, 20);
        second.setPrefSize(180, 20);
        
        pane.getChildren().addAll(first, second, result, compare);

        result.setLayoutX(150);
        result.setLayoutY(100);

        compare.setLayoutX(105);
        compare.setLayoutY(60);
        
        first.setLayoutX(20);
        first.setLayoutY(20);

        second.setLayoutX(220);
        second.setLayoutY(20);

        compare.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            	str1 = first.getText();
            	str2 = second.getText();
            	
            	if(str1.length()==str2.length())
            	{  	
                    Comporator comp = new Comporator();
				
                    comp.start();	//Запуск потока
				
                    try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
                    
                    comp.finish();	//Инициация завершения побочного потока
                    
                    if(flag)
                    	result.setText("Words are equal");
                    else
                    	result.setText("Words are not equal");
	            }
                else 
	            	result.setText("Words length are not equal!");
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
