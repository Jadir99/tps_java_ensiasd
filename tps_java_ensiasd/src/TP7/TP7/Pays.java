package TP7;

public class Pays implements Comparable {
    private String capital;

    public Pays(String capital) {
        this.capital = capital;
    }

    public String getCapital() {
        return capital;
    }

    @Override
    public boolean plusPetit(Object obj) {
        if (obj instanceof Pays) {
            return this.capital.compareTo( ( (Pays) obj ).getCapital() ) < 0;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pays capital: " + capital;
    }
}