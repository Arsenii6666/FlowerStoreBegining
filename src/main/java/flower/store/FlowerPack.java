package flower.store;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FlowerPack {
    private Flower flower;
    private int quantity;
    FlowerPack(Flower flower, int quantity){
        setFlower(flower);
        setQuantity(quantity);
    }
}
