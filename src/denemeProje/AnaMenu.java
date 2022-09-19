package denemeProje;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

import static denemeProje.Ekleme.KullaniciGiris.giris;

public class AnaMenu {

    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {
        giris();

    }
}
