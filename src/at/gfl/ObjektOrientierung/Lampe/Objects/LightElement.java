package at.gfl.ObjektOrientierung.Lampe.Objects;

import java.util.List;
import java.util.ArrayList;

public class LightElement {
    private List<Objects> LightElement;

    public LightObject(){
        this.LightElement = new ArrayList<>();
    }
    public void addObjects(Objects objects){
        this.LightElement.add(objects);
    }
    public void showLightNames(){
        for (int i = 0; i < LightElement.size(); i++) {
            System.out.println(LightElement.get(i).getName());
        }
    }

    public void TurnOn(){
        for (int i = 0; i < LightElement.size(); i++) {
            if (LightElement.get(i).isOnOff()==false){
                LightElement.get(i).setOnOff(true);
            }
            else {
                System.out.println("Die Lampe leuchtet schon!");
            }
        }
    }
}