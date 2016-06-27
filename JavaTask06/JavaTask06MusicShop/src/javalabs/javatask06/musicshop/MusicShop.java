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
        Set<String> keySetOrder = order.keySet();

        for (String nameOrderInstrument: keySetOrder) {
            Integer value = order.get(nameOrderInstrument);
            Iterator<MusicalInstrument> iter = musicalInstruments.iterator();
            while (value != 0) {
                if (iter.next().getClass().getSimpleName().equalsIgnoreCase(nameOrderInstrument)) {
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
        Set<String> keySetOrder = order.keySet();
        String myPackage = MusicalInstrument.class.getPackage().getName();

        for (String nameOrderInstrument: keySetOrder) {
            try {
                Class.forName(myPackage + "." + nameOrderInstrument);
            } catch (ClassNotFoundException e) {
                throw new WrongKeyValueOfInstrumentException();
            }
            if ((musicShopInstruments.get(nameOrderInstrument) == null) ||
                (order.get(nameOrderInstrument) > musicShopInstruments.get(nameOrderInstrument))) {
                    throw new IllegalArgumentException("Value of instruments in order can not be bigger then amount in shop!");
            }
        }
    }


    private Map<String, Integer> countsOfInstrumentsOfParticularType() {
        Map<String, Integer> countOfInstruments = new HashMap<>();

        for (MusicalInstrument instrument: musicalInstruments) {
                String className = instrument.getClass().getSimpleName();
                   if (countOfInstruments.containsKey(className)) {
                       countOfInstruments.put(className, new Integer(countOfInstruments.get(className) + 1));
                   }
                    else {
                       countOfInstruments.put(className, 1);
                   }
        }
        return countOfInstruments;
    }

    @Override
    public String toString() {
        return "MusicShop" + musicalInstruments;
    }
}
