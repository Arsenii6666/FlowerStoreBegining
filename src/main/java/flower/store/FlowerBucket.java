package flower.store;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public class FlowerBucket {
    private ArrayList<FlowerPack> FlowerPacks=new ArrayList();
    private int price=0;
    public void add(FlowerPack flowerPack){
        FlowerPacks.add(flowerPack);
        price+= flowerPack.getPrice();
    }
    public int find_flowers(Flower flower){
        int fl_num=0;
        for(FlowerPack fl_pack: FlowerPacks){
            if (fl_pack.equals(flower)){
                fl_num+=fl_pack.getQuantity();
            }
        }
        return fl_num;
    }
}
