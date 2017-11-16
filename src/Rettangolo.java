public class Rettangolo extends Forma {

    private double base;
    private double altezza;

    public Rettangolo(Colore colore, double base, double altezza) {
        super(colore);
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public double getAltezza() {
        return altezza;
    }

    @Override
    public double primetro() {
        return ((this.base+this.altezza)*2);
    }

    @Override
    public double area() {
        return (this.altezza*this.base);
    }

    public String toString(){
        return ("Rettangolo; Base: "+this.base+" Alatezza: "+this.altezza+" Colore: "+this.getColore());
    }
}
