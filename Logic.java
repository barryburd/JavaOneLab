import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Logic {

	static void first(GraphicsContext gc) {
		for (int i = 0; i < 15; i++) {
			if (i % 3 == 0) {
			    gc.setFill(Color.valueOf("#ff0000"));
			} else if (i % 3 == 1){
			    gc.setFill(Color.valueOf("#00ff00"));
			} else {
			    gc.setFill(Color.valueOf("#0000ff"));
			}
			gc.fillRect(20, i * 30, 480, 20);
		    }
	}

	static void second(GraphicsContext gc) {
		for (int i = 0; i < 15; i++) {
			if (i % 3 == 0) {
			    gc.setFill(Color.valueOf("#000000"));
			} else if (i % 3 == 1){
			    gc.setFill(Color.valueOf("#00ff00"));
			} else {
			    gc.setFill(Color.valueOf("#0000ff"));
			}
			gc.fillRect(20, i * 30, 480, 20);
		    }
	}
}
