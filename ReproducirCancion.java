import javafx.application.Platform;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

class ReproducirCancion implements Runnable {
    @Override
    public void run() {
        
        String cancionPath = "file:///cancion.mp3"; 
        Media media = new Media(cancionPath);

        Platform.runLater(() -> {
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
            mediaPlayer.setOnEndOfMedia(() -> Platform.exit());
        });
    }
}