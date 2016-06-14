package javalabs.javatask06.musicshop;

import java.util.*;

public class MusicShop {
    private List<MusicalInstrument> musicalInstruments;

    public MusicShop() {
        musicalInstruments = new ArrayList<>();
    }

    public List<MusicalInstrument> getMusicalInstruments() {
        return musicalInstruments;
    }

    public void setMusicalInstruments(List<MusicalInstrument> musicalInstruments) {
        this.musicalInstruments = musicalInstruments;
    }

    public List<MusicalInstrument> prepareInstruments(Map<String, Integer> order){
        orderTest(order);
        Integer value = order.get(MusicalInstrument.GUITAR);
        if (value != null) {
            Iterator<MusicalInstrument> iter = musicalInstruments.iterator();
            while (value != 0) {
                if (iter.next() instanceof Guitar) {
                    iter.remove();
                    value--;
                }
           }
        }
        value = order.get(MusicalInstrument.PIANO);
        if (value != null) {
            Iterator<MusicalInstrument> iter = musicalInstruments.iterator();
            while (value != 0) {
                if (iter.next() instanceof Piano) {
                   iter.remove();
                   value--;
                }
            }
        }
        value = order.get(MusicalInstrument.TUBE);
        if (value != null) {
            Iterator<MusicalInstrument> iter = musicalInstruments.iterator();
            while (value != 0) {
                if (iter.next() instanceof Tube) {
                    iter.remove();
                    value--;
                }
            }
        }
        return musicalInstruments;
    }

    private void orderTest(Map<String, Integer> order) {
        if (order == null || order.isEmpty()) {
            return;
        }
        Collection<Integer> values = order.values();
        for (Integer value: values) {
            if (value <= 0) {
                throw new IllegalArgumentException("Value of instruments in order can not be <= 0!");
            }
        }
        Map<String, Integer> musicShopInstruments = countsOfInstrumentsOfParticularType();
        if ((order.get(MusicalInstrument.GUITAR) != null && (order.get(MusicalInstrument.GUITAR) > musicShopInstruments.get(MusicalInstrument.GUITAR))) ||
                (order.get(MusicalInstrument.TUBE) != null && (order.get(MusicalInstrument.TUBE) > musicShopInstruments.get(MusicalInstrument.TUBE))) ||
                (order.get(MusicalInstrument.PIANO) != null && (order.get(MusicalInstrument.PIANO) > musicShopInstruments.get(MusicalInstrument.PIANO)))) {
            throw new IllegalArgumentException("Value of instruments in order can not be bigger then amount in shop!");
        }
        Set<String> keySet = order.keySet();
        for (String name: keySet) {
            if (!name.equalsIgnoreCase(MusicalInstrument.GUITAR) && !name.equalsIgnoreCase(MusicalInstrument.TUBE) && !name.equalsIgnoreCase(MusicalInstrument.PIANO)) {
                throw new WrongKeyValueOfInstrumentException();
            }
        }
    }

    private Map<String, Integer> countsOfInstrumentsOfParticularType() {
        Map<String, Integer> countOfInstruments = new HashMap<>();
        Integer guitars = 0;
        Integer tubes = 0;
        Integer pianos = 0;
        for (MusicalInstrument instrument: musicalInstruments) {
            if (instrument instanceof Guitar) {
                guitars++;
            }
            if (instrument instanceof Tube) {
                tubes++;
            }
            if (instrument instanceof Piano) {
                pianos++;
            }
        }
        countOfInstruments.put(MusicalInstrument.GUITAR, guitars);
        countOfInstruments.put(MusicalInstrument.PIANO, pianos);
        countOfInstruments.put(MusicalInstrument.TUBE, tubes);
        return countOfInstruments;
    }

    @Override
    public String toString() {
        return "MusicShop" + musicalInstruments;
    }
}
