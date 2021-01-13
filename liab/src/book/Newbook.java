package book;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;
import javax.swing.plaf.OptionPaneUI;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import liabrarian.ShowL;

public class Newbook {
	Stage stage = new Stage();
	Scene scene;
	String name ;
	public static String filepath = "d:/books.txt";
	
	public Newbook()
	{
	stage.setTitle("Information Page");
	stage.setWidth(400);
	stage.setHeight(600);
	stage.setResizable(false);
	addComponents();
	stage.setScene(scene);
	stage.show();
}
	public void addComponents(){
		
	
		Label bn=new Label("Book Name");
		TextField bnn=new TextField();
		
		Button ab=new Button("Add Book");
		
		GridPane layout=new GridPane();
	
		layout.add(bn,0,2);
		layout.add(bnn,0,3);
		
		layout.add(ab,1,4);
		
		
		
		scene = new Scene(layout);
		
	
		
		ab.setOnAction(new EventHandler<ActionEvent>(){
			
			public void handle(ActionEvent event){
				
				name= bnn.getText();
	
				try {
					
					FileWriter fw = new FileWriter(filepath , true);
					BufferedWriter bw = new BufferedWriter(fw);
					PrintWriter pw = new PrintWriter(bw);
					pw.println(name);
					pw.flush();
					pw.close();
					
					JOptionPane.showMessageDialog(null, "Record has been saved");
					
				}
				
				catch(Exception e)
				{
				JOptionPane.showMessageDialog(null, "Record not saved");
				}
			stage.hide();
			}
		});
	}
}
