package admin;

import book.Booklist;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
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
import liabrarian.Deleteliabrarian;
import liabrarian.LiabLIst;
import liabrarian.ShowL;
import member.Deletemember;
import member.Memlist;

public class ShowA {
	Stage stage = new Stage();
	Scene scene;
	static String name,gender="",cnic="",pass="",date;
	
	public ShowA()
	{
	stage.setTitle("Admin Information");
	stage.setWidth(400);
	stage.setHeight(600);
	stage.setResizable(false);
	addComponents();
	stage.setScene(scene);
	stage.show();
}
public void addComponents()
{
	
	Text user = new Text("ADMIN'S INFORMATION");
	Text name = new Text("Name: Sheheryar ");
	
	
	Text gender =  new Text("Gender: Male");
	
	
	Text cnic =  new Text("Cnic: 42401-6948885-9");
	
	
	Text DOB = new Text("Date Of Birth: 31-7-99");
	
	
	Button signout = new Button("Sign Out");
	Button ll = new Button("Librarian List");
	Button dl = new Button("Delete Librarian");
	Button dm = new Button("Delete Member");
	Button bl = new Button("Book List");
	Button ml = new Button("Member List");

	
	Font f;
	f= Font.font("Calibri", 16);
	GridPane grid = new GridPane();
	grid.add(user,0,1);
	user.setFont(Font.font("Arial", 20));
	GridPane.setMargin(user,new Insets(0,0,0,5));
	
	grid.add(name,0,2);
	name.setFont(f);
	
	GridPane.setMargin(name,new Insets(0,0,0,5));
	
	
	
	grid.add(DOB,0,4);
	DOB.setFont(f);
	
	GridPane.setMargin(DOB,new Insets(0,0,0,5));
	
	grid.add(gender,0,5);
	gender.setFont(f);
	
	GridPane.setMargin(gender,new Insets(0,0,0,5));
	
	grid.add(cnic,0,3);
	cnic.setFont(f);
	
	GridPane.setMargin(cnic ,new Insets(0,0,0,5));
	
	
	
	grid.add(signout,0,9);
	grid.add(ll,0,10);
	grid.add(dl,0,11);
	grid.add(dm,0,12);
	grid.add(bl,0,13);
	grid.add(ml,0,14);
	
	GridPane.setMargin(signout,new Insets(0,0,0,0));
	
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
 ll.setOnAction(new EventHandler<ActionEvent>(){
		
		public void handle(ActionEvent event){
			new LiabLIst();
		}
	});
 ml.setOnAction(new EventHandler<ActionEvent>(){
		
		public void handle(ActionEvent event){
		new	Memlist();
		}
	});
 dl.setOnAction(new EventHandler<ActionEvent>(){
		
		public void handle(ActionEvent event){
		new	Deleteliabrarian();
		}
	});
 dm.setOnAction(new EventHandler<ActionEvent>(){
		
		public void handle(ActionEvent event){
		new	Deletemember();
		}
	});

 
	
}
}


