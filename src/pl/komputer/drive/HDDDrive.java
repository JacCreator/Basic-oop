package pl.komputer.drive;

import pl.komputer.file.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class HDDDrive implements Drive{
    private List<File> files = new LinkedList<>();

    @Override
    public void addFile(File file) {
        files.add(file);
    }

    @Override
    public void listFiles() {
        for(File file:files) {
            System.out.println(file.getName());
        }
    }

    @Override
    public File findFile(String name) {
        Optional<File> foundFile = files.stream()
                .filter(file -> file.getName().equals(name))
                .findFirst();
        return foundFile.orElseThrow();
    }
}
