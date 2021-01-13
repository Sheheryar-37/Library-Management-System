package member;

import book.Booklist;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import liabrarian.ShowL;

public class ShowM {
	
	Stage stage = new Stage();
	Scene scene;
	public static String name;
	static String gender="";
	static String cnic="";
	static String pass="";
	static String date;
	
	public ShowM()
	{
		stage.setTitle("Member Information");
		stage.setWidth(400);
		stage.setHeight(600);
		stage.setResizable(false);
		addComponents();
		stage.setScene(scene);
		stage.show();
	}
	public void addComponents()
	{
		
		Text user = new Text("USER'S INFORMATION");
		Text name = new Text("Name: ");
		Text tname = new Text(); 
		tname.setText(ShowM.name);
	
		Text gender =  new Text("Gender: ");
		Text tgender = new Text();
		tgender.setText(ShowM.gender);
		
		Text cnic =  new Text("Cnic: ");
		Text tcnic = new Text();
		tcnic.setText(ShowM.cnic);
		
		Text DOB = new Text("Date Of Birth: ");
		Text tdate = new Text();
		tdate.setText(ShowM.date);
		
		Button signout = new Button("Sign Out");
		Button bl = new Button("Book List");
		Button pb = new Button("Purchased Book");
		Button ap = new Button("Add to Purchase");
		
		
		
		Font f;
		f= Font.font("Calibri", 16);
		GridPane grid = new GridPane();
		grid.add(user,0,1);
		user.setFont(Font.font("Arial", 20));
		GridPane.setMargin(user,new Insets(0,0,0,150));
		
		grid.add(name,0,3);
		name.setFont(f);
		grid.add(tname,0,3);
		tname.setFont(f);
		GridPane.setMargin(tname,new Insets(0,0,0,50));
		
		grid.add(DOB,0,4);
		DOB.setFont(f);
		grid.add(tdate,0,4);
		tdate.setFont(f);
		GridPane.setMargin(tdate,new Insets(0,0,0,90));
		
		grid.add(gender,0,5);
		gender.setFont(f);
		grid.add(tgender,0,5);
		tgender.setFont(f);
		GridPane.setMargin(tgender,new Insets(0,0,0,60));
		
		grid.add(cnic,0,6);
		cnic.setFont(f);
		grid.add(tcnic,0,6);
		tcnic.setFont(f);
		GridPane.setMargin(tcnic ,new Insets(0,0,0,40));
		
		
		
		grid.add(signout,0,9);
		grid.add(bl,0,10);
		grid.add(pb,0,11);
		grid.add(ap,0,12);
		
		GridPane.setMargin(signout,new Insets(30,0,0,0));
		
		grid.setHgap(10);
		grid.setVgap(10);
		
		grid.setBackground(new Background(new BackgroundFill(Color.BEIGE,null, null)));
		
		 
		scene = new Scene(grid);
		
		signout.setOnAction(new EventHandler<ActionEvent>(){
			
			public void handle(ActionEvent event){
				stage.hide();
			}
		});
		 bl.setOnAction(new EventHandler<ActionEvent>(){
				
				public void handle(ActionEvent event){
					new Booklist();
				}
			});
		 ap.setOnAction(new EventHandler<ActionEvent>(){
				
				public void handle(ActionEvent event){
					new Purchasebook();
				}
			});
		 pb.setOnAction(new EventHandler<ActionEvent>(){
				
				public void handle(ActionEvent event){
					new Purchasedlist();
				}
			});
	}
}


