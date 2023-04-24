package at.gfl.ObjektOrientierung.Handy;

public class Camera {
    private int res;
    private String NameOfPicture;
    private String extension;

    public Camera(int res, String NameOfPicture, String extension)
    {
        this.res = res;
        this.NameOfPicture = NameOfPicture;
        this.extension=extension;
    }

    public int getRes() {
        return res;
    }

    public String getExtension() {
        return extension;
    }

    public String getNameOfPicture() {
        return NameOfPicture;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setNameOfPicture(String nameOfPicture) {
        this.NameOfPicture = nameOfPicture;
    }
}
