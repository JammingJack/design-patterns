package state;

import state.state.Avion;
import state.state.AvionImpl;

public class Application {
    public static void main(String[] args) {
        Avion avion=new AvionImpl();
        avion.doActivity();
        System.out.println("********************************");
        avion.sortirDuGarage();
        System.out.println("********************************");
        avion.entrerAuGarage();
        avion.doActivity();
        System.out.println("********************************");
        avion.decoller();
        System.out.println("********************************");
        avion.sortirDuGarage();
        avion.doActivity();
        System.out.println("********************************");
        avion.decoller();
        avion.doActivity();
    }
}
