package flower.store;

import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }

    public boolean equals(Flower obj){
        if ((this.getSepalLength()== obj.getSepalLength())&&
                (this.getFlowerType().equals(obj.getFlowerType()))&&
                (this.getColor().equals(obj.getColor()))){
            return true;
        }
        return false;
    }
}
