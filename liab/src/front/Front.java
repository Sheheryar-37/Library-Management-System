package front;
import admin.LoginPA;
import liabrarian.SorLofL;
import member.SorLofM;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Front extends Application {
   
	
Stage stage;
Scene scene;

public void start (Stage s) throws Exception {
	
	stage=s;
	stage.setTitle("Main Page");
	stage.setHeight(400);
	stage.setWidth(600);
	stage.setResizable(false);
	addcomponent();
	stage.setScene(scene);
	stage.show();
	
}

private void addcomponent() {
	
	Button admin=new Button("Admin");
	Button lib=new Button("Liabrarian");
	Button mem=new Button("Member");
	admin.setPrefSize(130, 50);
	lib.setPrefSize(130, 50);
	mem.setPrefSize(130, 50);
	GridPane grid =new GridPane();
	Text user = new Text("ONLINE LIABRARY");
	Font f;
	f= Font.font("Calibri", 16);
	
	grid.add(user,0,1);
	user.setFont(Font.font("Arial", 20));
	GridPane.setMargin(user,new Insets(0,0,0,40));
    
	admin.setStyle("-fx-background-color: lightblue;");
    lib.setStyle("-fx-background-color:lightblue ;");
	mem.setStyle("-fx-background-color: lightblue;");
	
	grid.setAlignment(Pos.CENTER);

	grid.add(admin, 0,7);
	GridPane.setMargin(admin,new Insets(0,0,0,40));
	grid.add(lib, 0,14);
	GridPane.setMargin(lib,new Insets(0,0,0,40));
	grid.add(mem, 0, 21);
	GridPane.setMargin(mem,new Insets(0,0,0,40));
	grid.setHgap(10);
	grid.setVgap(10);

	Image image=new Image("liabrary.jpg");
	ImageView iv=new ImageView(image);
	BackgroundSize bz=new BackgroundSize(600, 400, false, false, true, true);

	grid.setBackground(new Background(new BackgroundImage(image,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,bz)));
	
	
	
	
    
   
	
	scene =new Scene(grid);
	
	lib.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent event) {
		
			new SorLofL();
			
		}
	});
	mem.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent event) {
		
			new SorLofM();
		}
	});
	admin.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent event) {
		
			new LoginPA();
		}
	});
}
 
public static void main(String[] args) throws Exception {
    
    launch(args);
  }
}