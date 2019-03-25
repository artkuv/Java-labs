package other;
import java.util.ArrayList;
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
import users.User;
import users.LoginedUser;
import users.Admin;

public class main extends Application {
    private Stage stage;
    private Scene scene;
    private Pane pane;
    private Label greetings, usr, adm, counter, login, status, mode;
    private Button giveall, newmsg, loginbtn, changeusr, del;
    private TextField inpmsg, inplog;
    boolean flag;

    public void start(Stage stage){
        User user = new User();
        LoginedUser loguser = new LoginedUser();
        Admin admin = new Admin();
        ArrayList<Message> messages = new ArrayList<>();
        this.stage = stage;
        stage.setTitle("Admin weekdays");
        pane = new Pane();

        inpmsg = new TextField();
        inplog = new TextField();
        greetings = new Label("Welcome to the coolest forum in the internet");
        usr = new Label("User");
        login = new Label("Log In here");
        adm = new Label("For Admin only");
        counter = new Label("Messages in the topic:");
        status = new Label("Status:");
        mode = new Label("Admin mode: OFF");

        giveall = new Button("Give me all messages");
        newmsg = new Button("Create new message");
        loginbtn = new Button("Log In");
        changeusr = new Button("Change user");
        del = new Button("Delete message");
        giveall.setPrefSize(200,20);
        newmsg.setPrefSize(150,20);
        loginbtn.setPrefSize(80,20);
        changeusr.setPrefSize(100,20);
        del.setPrefSize(120,20);
        inpmsg.setPrefSize(120, 20);
        inplog.setPrefSize(140, 20);
        
        pane.getChildren().addAll(greetings,usr,login,adm,giveall,newmsg,loginbtn,changeusr,del,status,counter,inpmsg,inplog,mode);
        
        greetings.setLayoutX(10);
        greetings.setLayoutY(5);

        usr.setLayoutX(85);
        usr.setLayoutY(70);

        login.setLayoutX(455);
        login.setLayoutY(70);

        adm.setLayoutX(235);
        adm.setLayoutY(70);
        
        mode.setLayoutX(230);
        mode.setLayoutY(105);

        giveall.setLayoutX(185);
        giveall.setLayoutY(30);

        status.setLayoutX(140);
        status.setLayoutY(180);
        
        inpmsg.setLayoutX(40);
        inpmsg.setLayoutY(100);
        
        newmsg.setLayoutX(25);
        newmsg.setLayoutY(140);
        
        inplog.setLayoutX(420);
        inplog.setLayoutY(100);
        
        loginbtn.setLayoutX(400);
        loginbtn.setLayoutY(140);
        
        del.setLayoutX(225);
        del.setLayoutY(140);
        
        changeusr.setLayoutX(490);
        changeusr.setLayoutY(140);

        counter.setLayoutX(400);
        counter.setLayoutY(5);

        giveall.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                Forum.GiveAllMessages(messages);
                status.setText("Now we have full history");
            }
        });

        newmsg.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            	flag = false;
                flag = user.createMessage(messages, inpmsg.getText(), true);
                if(!flag)
                	status.setText("Error! New message wasn't added");
                else	
                	status.setText("New message added");
                counter.setText("Messages in the topic:" + messages.size());
            }
        });

        loginbtn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            	flag = false;
                flag = loguser.logIn();
                if(!flag)
                {
                	status.setText("Wrong login, try again");
                	mode.setText("Admin mode: OFF");
                }
                else
                {
                	status.setText("Welcome back, Admin");
                	mode.setText("Admin mode: ON");
                }
            }
        });

        changeusr.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            	flag = false;
                flag = loguser.changeLogin(inplog.getText());
                if(!flag)
                	status.setText("Error! Login wasn't cahnged");
                else
                	status.setText("Login changed");
            }
        });
        
        del.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            	flag = false;
            	if(loguser.logIn() == true)
            		flag = admin.deleteMessage(messages);
            	if(!flag)
                	status.setText("Error! Message wasn't deleted");
                else
                	status.setText("Message was deleted");
            	counter.setText("Messages in the topic:" + messages.size());
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
