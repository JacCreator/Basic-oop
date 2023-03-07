package pl.komputer.file.imagefile;

import pl.komputer.file.File;

public class GIFImageFile extends AbstractImagefile implements File {

    public GIFImageFile(String name, int size) {
        super(name, size);
    }

    public void showAnimation() {
        System.out.println("Showing funny GIF");
    }
}
