package flower.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class StoreTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;

    private Store store;

    @BeforeEach
    public void init() {
        store = new Store();
    }
    @Test
    public void testFind(){
        Flower fl1=new Rose();
        int quantity1=RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        int quantity2=RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        fl1.setSepalLength(3);
        Flower fl2=new Rose();
        fl2.setSepalLength(4);
        Flower fl3 =new Tulip();
        Flower fl4 = new Chamomile();
        FlowerPack pack1=new FlowerPack(fl1, quantity1);
        FlowerPack pack2=new FlowerPack(fl1, quantity2);
        FlowerPack pack3=new FlowerPack(fl2, RANDOM_GENERATOR.nextInt(MAX_QUANTITY));
        FlowerPack pack4=new FlowerPack(fl3, RANDOM_GENERATOR.nextInt(MAX_QUANTITY));
        FlowerPack pack5=new FlowerPack(fl4, RANDOM_GENERATOR.nextInt(MAX_QUANTITY));
        FlowerBucket bucket1=new FlowerBucket();
        bucket1.add(pack1); bucket1.add(pack2); bucket1.add(pack3);
        FlowerBucket bucket2=new FlowerBucket();
        bucket2.add(pack4); bucket2.add(pack5);
        store.add(bucket1); store.add(bucket2);
        Assertions.assertEquals(quantity1+quantity2, store.find(fl1) );
    }
}
