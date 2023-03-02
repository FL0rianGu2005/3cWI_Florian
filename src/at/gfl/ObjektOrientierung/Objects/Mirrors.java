package at.gfl.ObjektOrientierung.Objects;

public class Mirrors {
    private int ammountMirrors;
    private int sizeofMirror;

    public Mirrors(int ammountMirrors, int sizeofMirror) {
        this.ammountMirrors = ammountMirrors;
        this.sizeofMirror = sizeofMirror;
    }
    public void MIrrorInforamtions() {
        System.out.println(this.ammountMirrors);
        System.out.println(this.sizeofMirror);
    }

    public int getAmmountMirrors() {
        return ammountMirrors;
    }

    public void setAmmountMirrors(int ammountMirrors) {
        this.ammountMirrors = ammountMirrors;
    }

    public int getSizeofMirror() {
        return sizeofMirror;
    }

    public void setSizeofMirror(int sizeofMirror) {
        this.sizeofMirror = sizeofMirror;
    }
}
