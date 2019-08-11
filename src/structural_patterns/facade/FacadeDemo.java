package structural_patterns.facade;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class FacadeDemo {
    public static void main(String[] args) throws IOException {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        System.out.println(mp4Video);
    }

    public static void everyDayExample() throws IOException {
        URL url = new URL("https", "online.manulife.com.ph", 80, "");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
    }
}
