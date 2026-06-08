import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class startmenu extends Application {

    @Override
    public void start(Stage stage) {
        Label l = new Label("JavaFX funktioniert!");
        Scene scene = new Scene(l, 300, 200);
        stage.setScene(scene);
        stage.setTitle("Test1");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
