package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;


public class Main extends Application{
	@Override
	public void start(Stage primaryStage)throws Exception {
		
			Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
			primaryStage.initStyle(StageStyle.TRANSPARENT);
			Scene scene = new Scene(root);
			scene.setFill(Color.TRANSPARENT);
			primaryStage.setTitle("Calculator");
			primaryStage.setScene(scene);
			primaryStage.show();
		 
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
