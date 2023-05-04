package at.gfl.ObjektOrientierung.Handy;

public class File {
    private String name;
    private int size;

    private String extension;

    public File(int size, String name, String extension)
    {
        this.size=size;
        this.name=name;
        this.extension=extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public String getExtension() {
        return extension;
    }
}
