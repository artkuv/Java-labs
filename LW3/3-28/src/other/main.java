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
import messages.Forum;
import messages.Message;
import users.User;
import users.LoginedUser;
import users.Admin;
import users.DB;

public class main extends Application {
    private Stage stage;
    private Scene scene;
    private Pane pane;
    private Label greetings, usr, countmsg, countusr, login, status, mode;
    private Button giveall, newmsg, loginbtn, changeusr, delmsg, delusr;
    private TextField inpmsg, inplog;
    boolean flag;
    String name;

    public void start(Stage stage){
        User user = new User();
        LoginedUser loguser = new LoginedUser();
        Admin admin = new Admin();
        ArrayList<Message> messages = new ArrayList<>();
        DB db = new DB();
        this.stage = stage;
        stage.setTitle("Admin weekdays");
        pane = new Pane();

        inpmsg = new TextField();
        inplog = new TextField();
        greetings = new Label("Welcome to the coolest forum in the internet");
        usr = new Label("User");
        login = new Label("Log In here");
        countmsg = new Label("Messages in the topic: 0");
        countusr = new Label("Users in the topic: 0");
        status = new Label("Waiting for events");
        mode = new Label("Admin mode: OFF");

        giveall = new Button("Give me all messages");
        newmsg = new Button("Create new message");
        loginbtn = new Button("Log In");
        changeusr = new Button("Change user");
        delusr = new Button("Delete user");
        delmsg = new Button("Delete message");
        delmsg.setVisible(false);
        delusr.setVisible(false);
        giveall.setPrefSize(200,20);
        newmsg.setPrefSize(150,20);
        loginbtn.setPrefSize(80,20);
        changeusr.setPrefSize(100,20);
        delmsg.setPrefSize(120,20);
        delusr.setPrefSize(120,20);
        inpmsg.setPrefSize(120, 20);
        inplog.setPrefSize(140, 20);
        
        pane.getChildren().addAll(greetings,usr,login,giveall,newmsg,loginbtn,changeusr,delmsg,delusr, status,countmsg,countusr,inpmsg,inplog,mode);
        
        greetings.setLayoutX(10);
        greetings.setLayoutY(5);

        usr.setLayoutX(85);
        usr.setLayoutY(70);

        login.setLayoutX(455);
        login.setLayoutY(70);
        
        mode.setLayoutX(230);
        mode.setLayoutY(70);

        giveall.setLayoutX(55);
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
        
        delmsg.setLayoutX(225);
        delmsg.setLayoutY(140);
        
        delusr.setLayoutX(225);
        delusr.setLayoutY(100);
        
        changeusr.setLayoutX(490);
        changeusr.setLayoutY(140);

        countmsg.setLayoutX(400);
        countmsg.setLayoutY(5);
        
        countusr.setLayoutX(400);
        countusr.setLayoutY(35);

        giveall.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                Forum.GiveAllMessages(messages);
                status.setText("Now we have full history");
            }
        });

        newmsg.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            	user.createMessage(messages, inpmsg.getText(), true);
                countmsg.setText("Messages in the topic: " + messages.size());
            }
        });
        
        loginbtn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            	name = loguser.logIn();
                if(name.equals("Admin"))
                {
                	status.setText("Welcome back, Admin");
                	mode.setText("Admin mode: ON");
                	delmsg.setVisible(true);
                	delusr.setVisible(true);
                }
                else if(name.equals("Error"))
                	status.setText("Try one more time");
                else
                {
                	status.setText("Welcome back, " + name);
                	mode.setText("Admin mode: OFF");
                	delmsg.setVisible(false);
                	delusr.setVisible(false);
                }
                countusr.setText("Users in the topic:" + db.database.size());
            }
        });

        changeusr.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            	loguser.changeLogin(inplog.getText());
            }
        });
        
        delmsg.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            	name = loguser.logIn();
            	if(name.equals("Admin"))
            		admin.deleteMessage(messages);
            	countmsg.setText("Messages in the topic: " + messages.size());
            }
        });
        
        delusr.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            	name = loguser.logIn();
            	if(name.equals("Admin"))
            		admin.deleteUser(db.database, inplog.getText());
            	countusr.setText("Users in the topic:" + db.database.size());
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
