package liabrarian;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class SignupL {
	
        Stage stage;
		Scene scene;
		ArrayList<String> alist=new ArrayList<String>();
		public SignupL(){
			
			stage= new Stage();
			stage.setTitle("Librarian Signup Screen");
			stage.setWidth(400);
			stage.setHeight(600);
			stage.setResizable(false);
			addcomponent();
			stage.setScene(scene);
			stage.show();
			
		}
			
		
		private void addcomponent(){
			
			Label lblname= new Label("Name");
			TextField txtname = new TextField();
			String name = txtname.getText();
			Label lblpass = new Label("Password");
			PasswordField txtpass = new PasswordField();
			
			Label lblgender= new Label("Gender");
			RadioButton rmale = new RadioButton("Male");
			RadioButton rfemale = new RadioButton("Female");
			
			Label code=new Label("Enter the code given by Admin");
			TextField code1= new TextField();
			
			ToggleGroup group = new ToggleGroup();
			rmale.setToggleGroup(group);
			rfemale.setToggleGroup(group);
			
			
			
			  Label cnic=new Label("Cnic");
			  TextField cnic1= new TextField();
			
			
			
			
			Label DOB=new Label("Date of Birth");
			DatePicker datepicker=new DatePicker();
			
			
			
			Button signup = new Button("SignUp");
			
			
			GridPane grid = new GridPane();
			grid.setAlignment(Pos.BASELINE_CENTER);
			grid.setVgap(20);
			grid.setHgap(20);
			
			grid.add(lblname, 0, 0);
			grid.add(txtname, 1, 0);
	        
			grid.add(lblpass, 0, 1);
			grid.add(txtpass, 1, 1);
			
			
			grid.add(DOB, 0,2);
			grid.add(datepicker, 1,2);
			 
			  
			  grid.add(cnic, 0, 5);
			  grid.add(cnic1, 1, 5);
			
			grid.add(lblgender, 0, 3);
			grid.add(rmale, 1, 3);
			grid.add(rfemale, 1, 3);
			GridPane.setMargin(rfemale, new Insets(0,0,0, 60));
		
			
			grid.add(code, 0, 4);
			grid.add(code1, 1, 4);
			grid.add(signup, 1,7);
			
			grid.setBackground(new Background(new BackgroundFill(Color.BEIGE,null, null)));
			
			grid.setPadding(new Insets(50,0,0,0));
			 Image image=new Image("file:signup.jpg");
				ImageView iv=new ImageView(image);
				BackgroundSize bz=new BackgroundSize(300, 200, false, false, false, false);
				//BackgroundSize bsize =new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, false);
				grid.setBackground(new Background(new BackgroundImage(image,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,bz)));
				
			scene = new Scene(grid);
			
			signup.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					
					String a=code1.getText();
					if(a.equals("1234"))
					{
							ArrayList al =new ArrayList();
							
					ShowL.name = txtname.getText();
					LiabLIst.name = txtname.getText();
					ShowL.pass = txtpass.getText();
					ShowL.cnic = cnic1.getText();
					
					
					if(rmale.isSelected())
						ShowL.gender = "Male";
					if(rfemale.isSelected())
						ShowL.gender = "Female";
					ShowL.date = datepicker.getValue().toString();
				Alert msg = new Alert(AlertType.INFORMATION);
				msg.setHeaderText(null);
					msg.setContentText("Signed Up Successfully");
				msg.show();
					stage.hide();
				}
				else {
					Alert msg = new Alert(AlertType.INFORMATION);
					msg.setHeaderText(null);
						msg.setContentText("wrong code entered");
					msg.show();
				}
				}
			});
			
	
	}
		
	}


