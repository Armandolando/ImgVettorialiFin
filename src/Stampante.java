public class Stampante {
    private int cartridge[]=new int[Colore.values().length];
    private int lvlMax;


    public Stampante(int lvl) {
        this.lvlMax=lvl;
    }

    public void iniz(){
        for( Colore c : Colore.values()) {
            this.cartridge[c.ordinal()]=lvlMax;
        }
    }

    public void riniz(Colore c){
        this.cartridge[c.ordinal()]=lvlMax;
    }

    public void livelli(Forma f){
        for(Colore c : Colore.values()){
            if (f.getColore()==c){
                this.cartridge[c.ordinal()]-=f.area();
            }
            if(this.cartridge[c.ordinal()]<0){
                System.out.println("Inchiostro Insufficiente");
                riniz(c);
            }

        }
        System.out.println(f);
    }

    public void stmplvl(){
        for(Colore c: Colore.values()){
            System.out.println(c+" "+this.cartridge[c.ordinal()]);
        }
    }
}
