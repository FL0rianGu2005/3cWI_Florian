package at.gfl.ObjektOrientierung.Lampe.Objects;

public class Objects {
        private String Name;
        private String Color;
        private int status;
        private boolean OnOff;

    public Objects(String Name, String Color, int status, boolean OnOff) {
        this.Name = Name;
        this.Color = Color;
        this.status = status;
        this.OnOff = OnOff;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
       Name = name;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean isOnOff() {
        return OnOff;
    }

    public void setOnOff(boolean onOff) {
        OnOff = onOff;
    }
}
