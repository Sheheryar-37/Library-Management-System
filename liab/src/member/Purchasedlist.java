package member;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Purchasedlist {
	Stage stage;
	Scene scene;
	public static String name;
public  Purchasedlist() {
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
	
	Text lblname= new Text();
	lblname.setText(Purchasedlist.name);
	
	GridPane grid =new GridPane();
	grid.add(lblname, 0, 0);
	
	scene= new Scene(grid);
	
}

}
