package pl.komputer.file.imagefile;

import pl.komputer.file.File;

public class JPGImageFile extends AbstractImagefile implements File {
    private int compression;

    public JPGImageFile(String name, int size, int compression) {
        super(name, size);
        this.compression=compression;
    }

    public int getCompression() {
        return compression;
    }

}
