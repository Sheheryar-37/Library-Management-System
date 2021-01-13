package liabrarian;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginPL {
	Stage stage;
	Scene scene;
	
	 public LoginPL(){
		stage=new Stage();  
		stage.setTitle("Liabrarian Login");
		stage.setHeight(400);
		stage.setWidth(600);
		stage.setResizable(false);
		addcomponent();
		stage.setScene(scene);
		stage.show();
		
	  }
	  
  private void addcomponent() {
	  
	  Label name=new Label("Name");
	  TextField name1= new TextField();
	  Label pass=new Label("Password");
	  PasswordField pass1= new PasswordField();
	  
	
	  Button login =new Button("Login");
	  Button back =new Button("Back");
	  
	  GridPane grid=new GridPane();
	  grid.add(name, 0, 0);
	  
	  grid.add(name1, 1, 0);
	  grid.add(pass, 0, 1);
	  grid.add(pass1, 1, 1);
	  grid.add(login,1,3);
	  grid.add(back,1,4);
	  
	  grid.setHgap(50);
	  grid.setVgap(50);
	  grid.setAlignment(Pos.CENTER);
	  
		
	  Image image=new Image("file:login.png");
		ImageView iv=new ImageView(image);
		BackgroundSize bz=new BackgroundSize(300, 200, false, false, false, false);
		//BackgroundSize bsize =new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, false);
		grid.setBackground(new Background(new BackgroundImage(image,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,bz)));
		scene=new Scene(grid);
		back.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
			
				
				stage.hide();			}
		});
		
		
		login.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String uname,upass;
				uname=name1.getText();
				upass=pass1.getText();
				
				if (uname.equals(ShowL.name) && upass.equals(ShowL.pass)) {
					new ShowL();
					name1.setText("");
					pass1.setText("");
			
				}
				else {
					
					Alert msg = new Alert(AlertType.ERROR);
					msg.setHeaderText(null);
					msg.setContentText("Login Failed");
					msg.show();
					name1.setText("");
					pass1.setText("");
				}
				}
		});
		
		 
  }
  }
