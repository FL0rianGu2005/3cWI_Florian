package at.gfl.ObjektOrientierung.Car.Objects;

public class Tyres {
    private String brand;
    private int frontPressure;
    private int backPressure;
    private int profile;
    private String seasons;

    public Tyres(String brand, int frontPressure, int backPressure, int profile, String seasons)
    {
        this.brand = brand;
        this.frontPressure = frontPressure;
        this.backPressure = backPressure;
        this.profile = profile;
        this.seasons = seasons;
    }


    public void TyreInforamtions(){
        System.out.println(this.brand);
        System.out.println(this.frontPressure);
        System.out.println(this.backPressure);
        System.out.println(this.profile);
        System.out.println(this.seasons);
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPressure() {
        return frontPressure;
    }

    public void setPressure(int pressure) {
        this.frontPressure = pressure;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public String getSeasons() {
        return seasons;
    }

    public void setSeasons(String seasons) {
        this.seasons = seasons;
    }

    public int getBackPressure() {
        return backPressure;
    }

    public void setBackPressure(int backPressure) {
        this.backPressure = backPressure;
    }
}
