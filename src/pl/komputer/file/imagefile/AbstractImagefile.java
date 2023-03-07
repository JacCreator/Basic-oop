package pl.komputer.file.imagefile;
import pl.komputer.file.AbstractFile;
import pl.komputer.file.FileType;

abstract public class AbstractImagefile extends AbstractFile {

    protected AbstractImagefile(String name, int size) {
        super(name, size);
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
