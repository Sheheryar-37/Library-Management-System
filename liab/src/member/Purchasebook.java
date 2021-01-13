package member;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JOptionPane;

import book.Newbook;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Purchasebook {
	
	Stage stage;
	Scene scene;
	
public  Purchasebook() {
	stage =new Stage();
	stage.setTitle("Purchase Book");
	stage.setHeight(600);
	stage.setWidth(400);
	stage.setResizable(false);
	addcomponent();
	stage.setScene(scene);
	stage.show();




}
private void addcomponent() {
	Label name=new Label("Name");
	TextField name1=new TextField();
	Button pur=new Button("Purchase");
	GridPane grid=new GridPane();
	grid.add(name, 0, 0);
	grid.add(name1, 1, 0);
	grid.add(pur, 1, 1);
	scene=new Scene(grid);
	
	pur.setOnAction(new EventHandler<ActionEvent>()
			{
	@Override
	public void handle(ActionEvent event) {
		String a=name1.getText();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(new File(Newbook.filepath)))) {

		       String line;
		       boolean flag=true;
		       while ((line = reader.readLine()) != null)
		       {
		    	  if (a.equals(line))
		    	  {
		    		  flag=true;
		    		 Purchasedlist.name = a.toString();
		    	  JOptionPane.showMessageDialog(null, "added to purchase");
		    	  break;
		    	  }
		    	  else {
		    		  flag=false;
		    	  }
		       
		       }
		       if(flag==false) {
		    	   JOptionPane.showMessageDialog(null, "book not found");
		       }
		       
		       
		     			} catch (Exception e) {
		    	        e.printStackTrace();
		    	    }
	}
			});
	
	
	
	
}
}
