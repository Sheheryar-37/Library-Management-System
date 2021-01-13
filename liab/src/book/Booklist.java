package book;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import member.ShowM;

public class Booklist {
	Stage stage = new Stage();
	Scene scene;
	public String name;
	public static int i=0;
	 Text bn = new Text("Bookname: ");
	
	
 public Booklist()
	{
		stage.setTitle("Book List");
		stage.setWidth(400);
		stage.setHeight(600);
		stage.setResizable(false);
		addComponents();
		stage.setScene(scene);
		stage.show();
	}
	public void addComponents()
	{
		GridPane grid=new GridPane();
		Text bn =new Text("Books");
		Button btn=new Button("Back");
		grid.add(bn, 1, 0);
	
		try (BufferedReader reader = new BufferedReader(new FileReader(new File(Newbook.filepath)))) {

	       String line;
	       while ((line = reader.readLine()) != null)
	       {
	    	   Text bn2 = new Text();
	    	   bn2.setText(line);
	  			grid.add(bn2,0,i);
	  			
	  			i++;
	       }
	      
		} catch (Exception e) {
	    	        e.printStackTrace();
	    	    }
		
		scene = new Scene(grid);
		
		
		
btn.setOnAction(new EventHandler<ActionEvent>(){
			
			public void handle(ActionEvent event){
				
			stage.hide();
			}
		});
	}
}



