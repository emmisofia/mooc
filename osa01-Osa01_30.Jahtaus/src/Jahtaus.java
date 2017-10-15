
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Jahtaus extends Application {

    @Override
    public void start(Stage stage) {
        Image image = new Image("file:happy.png");

        Group root = new Group();
        Canvas piirtoalusta = new Canvas(480, 360);
        GraphicsContext piirturi = piirtoalusta.getGraphicsContext2D();

        root.getChildren().add(piirtoalusta);

        final double[] kuvanSijainti = new double[2];
        final double[] historia = new double[2];

        piirtoalusta.setOnMouseMoved((MouseEvent event) -> {

            // tyhjennetään ruutu
            piirturi.clearRect(0, 0, 480, 360);

            double vanhaHiirenX = historia[0];
            double vanhaHiirenY = historia[1];

            double vanhaKuvanX = kuvanSijainti[0];
            double vanhaKuvanY = kuvanSijainti[1];

            double hiirenX = event.getX();
            double hiirenY = event.getY();

            double kuvanX = hiirenX + 100;
            double kuvanY = hiirenY + 100;

            // piirretään kuva kohtaan kuvanX, kuvanY
            piirturi.drawImage(image, kuvanX, kuvanY, 64, 64);

            // tallennetaan sijainnit tulevaa käyttöä varten
            historia[0] = hiirenX;
            historia[1] = hiirenY;

            kuvanSijainti[0] = kuvanX;
            kuvanSijainti[1] = kuvanY;
        });

        stage.setScene(new Scene(root));
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
