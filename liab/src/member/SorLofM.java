package member;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import liabrarian.LoginPL;
import liabrarian.SignupL;

public class SorLofM {
	Stage stage;
	Scene scene;
	
	  public SorLofM(){
		stage=new Stage();  
		stage.setTitle("Member Login or Signup");
		stage.setHeight(400);
		stage.setWidth(600);
		stage.setResizable(false);
		addcomponent();
		stage.setScene(scene);
		stage.show();
		
	}
  private void addcomponent() {
	
	  Button login =new Button("Login");
	  Button signup =new Button("Signup");
	  Button back =new Button("Back");
	  GridPane grid=new GridPane();
	  grid.add(login,0,0);
	  grid.add(back,0,4);
	  grid.add(signup,0,2);
	  grid.setHgap(50);
	  grid.setVgap(50);
	  grid.setAlignment(Pos.CENTER);
		
	  grid.setStyle("-fx-background-color:blue");
		scene=new Scene(grid);
		back.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
			
				
				stage.hide();			}
		});
		login.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
			
				new LoginPM();
			}
		});
		signup.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
			
				new SignupM();
			}
		});
}



}


