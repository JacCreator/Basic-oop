package pl.komputer;

import pl.komputer.file.File;
import pl.komputer.file.imagefile.GIFImageFile;
import pl.komputer.file.imagefile.JPGImageFile;
import pl.komputer.file.musicfile.MP3File;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        MP3File mp3 = new MP3File("mp3", 200, "Taco Hemingway", "Trójkąt Warszawski", 90);

        System.out.println(mp3);


        JPGImageFile jpg = new JPGImageFile("jpg", 200, 75);
        GIFImageFile gif = new GIFImageFile("gif", 100);

        List<File> files = new LinkedList<>();

        files.add(jpg);
        files.add(gif);
        files.add(gif);

        for(File file:files) {
            if(file instanceof JPGImageFile) {
                System.out.println("To plik JPG");
            } else if(file instanceof GIFImageFile) {
                System.out.println("To plik GIF");
            }
        }

        System.out.println(Monitor.MAX_HEIGHT);
        System.out.println(Monitor.getMaxHeight());
    }
}
