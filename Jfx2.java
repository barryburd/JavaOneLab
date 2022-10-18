//DEPS org.openjfx:javafx-controls:18.0.2:${os.detected.jfxname}
//DEPS org.openjfx:javafx-graphics:18.0.2:${os.detected.jfxname}
//SOURCES **.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;

/**
 * Shows a simple JavaFX Canvas.
 */
public class Jfx2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Canvas canvas = new Canvas();
        canvas.setHeight(512);
        canvas.setWidth(512);

        GraphicsContext graphicsContext2D = canvas.getGraphicsContext2D();

        Logic.first(graphicsContext2D); 

        Canvas canvas2 = new Canvas();
        canvas2.setHeight(512);
        canvas2.setWidth(512);

        GraphicsContext graphicsContext2D2 = canvas2.getGraphicsContext2D();

        Logic.second(graphicsContext2D2);

        CheckBox checkBox1 = new CheckBox("ON");
        CheckBox checkBox2 = new CheckBox("OFF");
        Label label = new Label("Pressed!");


        HBox hbox1 = new HBox(8);
        hbox1.getChildren().addAll(checkBox1);

        VBox vbox = new VBox(8);
        vbox.getChildren().addAll(hbox1, canvas);
        checkBox1.setOnAction(event ->  {if (checkBox1.isSelected())
                                             vbox.getChildren().setAll(hbox1, canvas2);
                                        else
                                             vbox.getChildren().setAll(hbox1, canvas);}
                                       );

        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
