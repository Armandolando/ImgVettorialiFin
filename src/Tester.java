public class Tester {
    public static void main(String[] args) {
        ImgVect v= new ImgVect(4);
        Stampante s = new Stampante(100);

        Forma f1 = new Rettangolo(Colore.BLACK, 3., 2.);
        Forma f2 = new Cerchio(Colore.RED,3.);
        Forma f3 = new Quadrato(Colore.BLACK, 4.);


        v.aggiungiForma(f1);
        v.aggiungiForma(f2);
        v.aggiungiForma(f3);

        v.stampa(s);


        System.out.println(v.getAreaTotale());
        System.out.println(v.getPerimetroTotale());
        System.out.println(v.getAreaColore(Colore.BLACK));
        System.out.println(v.getPerimetroColore(Colore.RED));

        v.ordina();

        v.stampa(s);
        s.stmplvl();



    }




}
