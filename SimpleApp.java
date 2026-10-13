import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;

public class SimpleApp extends Application {

    @Override
    public void start(Stage stage) {
        Label label = new Label("Hello World!");

        Scene scene = new Scene(label, 300, 200);
        stage.setTitle("Simple JavaFX App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
