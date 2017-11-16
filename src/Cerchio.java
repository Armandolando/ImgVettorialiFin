public class Cerchio extends Forma {

    private double raggio;

    public Cerchio(Colore colore, double raggio) {
        super(colore);
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    @Override
    public double primetro() {
        return (2*Math.PI*this.raggio);
    }

    @Override
    public double area() {
        return (Math.PI*Math.pow(this.raggio,2));
    }

    public String toString(){
        return ("Cerchio; Raggio: "+this.raggio+" Colore: "+this.getColore());
    }
}
