package member;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Memlist {
	
		Stage stage = new Stage();
		Scene scene;
		public static String name;
		
		public Memlist()
		{
		stage.setTitle("Member List");
		stage.setWidth(400);
		stage.setHeight(600);
		stage.setResizable(false);
		addComponents();
		stage.setScene(scene);
		stage.show();
	}
		public void addComponents(){
			
			Label mn=new Label("Member Name");
			Text mn1=new Text();
			mn1.setText(Memlist.name);
			Button back=new Button("Back");
			
			GridPane layout=new GridPane();
			
			layout.add(mn,0,2);
			layout.add(mn1,0,3);
			
			layout.add(back,2,10);
			
			scene = new Scene(layout);	
		
		
			back.setOnAction(new EventHandler<ActionEvent>(){
				
				public void handle(ActionEvent event){
					
				stage.hide();
				}
			});
		
		}
		}



