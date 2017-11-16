public abstract class Forma implements Comparable<Forma>,Misurable {

    private Colore colore;

    public Forma(Colore colore) {
        this.colore = colore;
    }

    public Colore getColore() {
        return colore;
    }



    public int compareTo(Forma f) {
        if (this.area() > f.area()){
            return 1;
        }
        else if (this.area() < f.area()){
            return -1;
        }
        return 0;
    }



}
