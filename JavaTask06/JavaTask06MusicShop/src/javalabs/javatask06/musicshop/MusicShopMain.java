package javalabs.javatask06.musicshop;

import java.util.HashMap;
import java.util.Map;

public class MusicShopMain {
    public static void main(String[] args) {
        MusicShop test = new MusicShop();
        test.getMusicalInstruments().add(new Guitar());
        test.getMusicalInstruments().add(new Piano());
        test.getMusicalInstruments().add(new Tube());
        test.getMusicalInstruments().add(new Tube());

        System.out.println(test.toString());

        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("Piano", 1);
        testMap.put("Tube", 1);
        testMap.put("Guitar", 1);

        test.prepareInstruments(testMap);

        System.out.println(test.toString());
    }
}
