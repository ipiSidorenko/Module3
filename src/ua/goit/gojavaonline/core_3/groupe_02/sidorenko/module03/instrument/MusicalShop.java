package ua.goit.gojavaonline.core_3.groupe_02.sidorenko.module03.instrument;

import java.util.List;

public class MusicalShop {
    private List<MusicalInstrument> musicalInstruments;
    private int item;

    public List<MusicalInstrument> getMusicalInstruments() {
        return musicalInstruments;
    }

    public void setMusicalInstruments(List<MusicalInstrument> musicalInstruments) {
        this.musicalInstruments = musicalInstruments;
    }

    public void addMusicalInstrument(MusicalInstrument musicalInstrument){
        this.musicalInstruments.add(musicalInstrument);
    }
    
    public void sellInstr() {
        for (int i = 0; i < item; i++) {
            ereseDepod(i);
        }

    }

    public void ereseDepod(int i) {
        for (int i = 0; i < item; i++) {
            int item = showItems();
        }
    }

    public void showItems(String instrument) {
        System.out.println();
        for (int i = 0; i <; i++) {
            findIndex(i);
        }
    }
    private int findIndex(String instrument){
        for(int i=0; i<item; i++) {
            if (musicalInstruments.get(i).toString().equals(instrument)) {
                return i;
            }
        }


}




    }
}
