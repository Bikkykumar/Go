import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.Scene;


public class HelloWorld extends Application{

	private GridPane pane;
	private Label label;
	
	public void init() {
		pane = new GridPane();
		label = new Label("Hello world");
		pane.getChildren().addAll(label);
	}
	
	public void start(Stage primaryStage) {
		primaryStage.setTitle("helllo world");
		primaryStage.setScene(new Scene(pane, 300, 400));
		primaryStage.show();
	}
	
	public void stop() {}
	
	public static void main(String args[]) {
		launch(args);
	};
}
