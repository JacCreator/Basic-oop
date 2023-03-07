package pl.komputer.file.musicfile;

public class MP3File extends AbstractMusicFile implements MusicFile {
    private int quality;

    public MP3File(String name, int size, String bandName, String title, int quality) {
        super(name, size, bandName, title);
        this.quality=quality;
    }

    @Override
    public void play() {

    }

    public int getQuality() {
        return quality;
    }

    @Override
    public String getName() {
        return "Plik nazywa się "+super.getName();
    }

    @Override
    public String toString() {
        return "MP3File{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", bandName='" + bandName + '\'' +
                ", title='" + title + '\'' +
                ", quality=" + quality +
                '}';
    }
}
