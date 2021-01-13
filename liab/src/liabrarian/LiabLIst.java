package liabrarian;

import book.Booklist;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LiabLIst {
	Stage stage = new Stage();
	Scene scene;
	public static String name;
	
 public LiabLIst()
	{
		stage.setTitle("Liabrarian List");
		stage.setWidth(400);
		stage.setHeight(600);
		stage.setResizable(false);
		addComponents();
		stage.setScene(scene);
		stage.show();
	}
 public void addComponents()
	{
	 Button back=new Button("Back");
		
		
		Text name = new Text("Name: ");
		Text name2 = new Text(); 
		name2.setText(LiabLIst.name);
		
		
		GridPane grid=new GridPane();
		grid.add(name,0,2);
		grid.add(name2,0,3);
		grid.add(back,2,10);
		
		
		scene = new Scene(grid);
		
		
back.setOnAction(new EventHandler<ActionEvent>(){
			
			public void handle(ActionEvent event){
				
			stage.hide();
			}
		});
	 
	 
	 
	 
	 
	}
}
