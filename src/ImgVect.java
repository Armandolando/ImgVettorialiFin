import java.util.Arrays;

public class ImgVect {
    private Forma[] vetForme;
    private int counter;
    private int max;

    private double AreaTotale;
    private double AreaColore;
    private double PerimetroColore;
    private double PerimetroTotale;

    public ImgVect(int max) {
        this.vetForme = new Forma[max];
        this.counter = 0;
        this.max = max;
    }

    public void aggiungiForma(Forma f){
        if(this.counter<this.max){
            this.vetForme[this.counter]=f;
            counter++;
        }
        else{
            System.out.println("Raggiunto il numero massimo di forme.");
        }
    }

    public double getAreaTotale() {
        for(int i=0; i<counter; i++){
            this.AreaTotale+=this.vetForme[i].area();
        }
        return this.AreaTotale;
    }

    public double getPerimetroTotale() {
        for(int i=0; i< counter; i++){
            this.PerimetroTotale+=this.vetForme[i].primetro();
        }
        return PerimetroTotale;
    }

    public double getAreaColore(Colore colore) {
        for(int i=0; i<counter; i++) {
            if(colore==this.vetForme[i].getColore()){
                this.AreaColore+=this.vetForme[i].area();
            }
        }
        return AreaColore;
    }

    public double getPerimetroColore(Colore colore) {
        for(int i=0; i<counter; i++) {
            if(colore==this.vetForme[i].getColore()){
                this.PerimetroColore+=this.vetForme[i].primetro();
            }
        }
        return AreaColore;
    }

    public void stampa(Stampante s){
        s.iniz();
        for(int i=0; i<counter; i++){

            s.livelli(vetForme[i]);
        }

    }

    public void ordina(){
        Arrays.sort(vetForme, 0, counter);
    }
}
