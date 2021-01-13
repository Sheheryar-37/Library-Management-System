package member;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Deletemember {
	Stage stage = new Stage();
	Scene scene;
	String name ;
	
	public Deletemember()
	{
	stage.setTitle("Delete Member");
	stage.setWidth(400);
	stage.setHeight(600);
	stage.setResizable(false);
	addComponents();
	stage.setScene(scene);
	stage.show();
}
	public void addComponents(){
		
		
		Label lb=new Label("Member Name");
		TextField lb1=new TextField();
		
		Button l=new Button("Delete");
		
		GridPane layout=new GridPane();
		
		layout.add(lb,0,2);
		layout.add(lb1,0,3);
		
		layout.add(l,1,4);
		
		
		
		scene = new Scene(layout);
		
	
		
		l.setOnAction(new EventHandler<ActionEvent>(){
			
			public void handle(ActionEvent event){
				
				String name= lb1.getText();
			    if(name.equals(ShowM.name))
			    {
			    	ShowM.name="";
			    	Memlist.name="";
			    	JOptionPane.showMessageDialog(null, "Deleted");
			    }
			    else {
			    	JOptionPane.showMessageDialog(null, "No Liabrarian found");
			    }
			stage.hide();
			}
		});
	}
}


