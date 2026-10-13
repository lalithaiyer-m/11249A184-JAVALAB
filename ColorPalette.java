import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ColorPalette extends Application {

    @Override
    public void start(Stage stage) {
        HBox box = new HBox(10);

        Color[] colors = {
            Color.RED, Color.GREEN, Color.BLUE,
            Color.YELLOW, Color.ORANGE, Color.PINK
        };

        for (Color color : colors) {
            Rectangle r = new Rectangle(60, 60, color);
            box.getChildren().add(r);
        }

        Scene scene = new Scene(box, 450, 100);
        stage.setTitle("Colour Palette");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}