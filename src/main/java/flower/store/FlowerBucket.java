package flower.store;

import lombok.Getter;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Getter
public class FlowerBucket {
    private ArrayList<FlowerPack> FloverPacks=new ArrayList<FlowerPack>();
    private int price=0;
    public void add(FlowerPack flowerPack){
        FloverPacks.add(flowerPack);
        price+= (flowerPack.getQuantity()*flowerPack.getFlower().getPrice());
    }
}
