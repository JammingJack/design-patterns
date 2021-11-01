package state.state;

public class AvionImpl implements Avion {
    private State state;

    public AvionImpl() {
        state=new EtatEnPiste();
    }

    @Override
    public void sortirDuGarage() {
      state.executeSortirDuGarage();
    }

    @Override
    public void entrerAuGarage() {
        state.executeEntrerAuGarage();
    }

    @Override
    public void decoller() {
        state.executeDecoller();
    }

    @Override
    public void atterir() {
        state.executeAtterir();
    }

    @Override
    public void doActivity() {
        state.executeDoActivity();
    }

    abstract class State {
        abstract void executeSortirDuGarage();
        abstract void executeEntrerAuGarage();
        abstract void executeDecoller();
        abstract void executeAtterir();
        abstract void executeDoActivity();
    }

    class EtatEnPiste extends State{

        @Override
        void executeSortirDuGarage() {
            System.out.println("impossible de sortir, je suis déjà en piste");
        }

        @Override
        void executeEntrerAuGarage() {
            System.out.println("transition d'état de En Piste => Garage");
            state=new EtatAuGarage();
        }

        @Override
        void executeDecoller() {
            System.out.println("transition d'état de En Piste => Décollage");
            state=new EtatEnLair();
        }

        @Override
        void executeAtterir() {
            System.out.println("impossible , je suis déjà en piste");
        }

        @Override
        void executeDoActivity() {
            for (int i=0;i<10;i++) {
                System.out.println("Activité de l'état en piste ......."+i);
            }
        }
    }

    class EtatAuGarage extends State{

        @Override
        void executeSortirDuGarage() {
            System.out.println("transition d'état de Garage => Piste");
            state=new EtatEnPiste();
        }

        @Override
        void executeEntrerAuGarage() {
            System.out.println("impossible , je suis déjà au garage");
        }

        @Override
        void executeDecoller() {
            System.out.println("impossible de décoller, je suis au garage");

        }

        @Override
        void executeAtterir() {
            System.out.println("impossible d'attérir, je suis au garage");
        }

        @Override
        void executeDoActivity() {
            for (int i=0;i<10;i++) {
                System.out.println("Activité de l'état au garage ......."+i);
            }
        }


        }
        class EtatEnLair extends State{

            @Override
            void executeSortirDuGarage() {
                System.out.println("impossible de sortir, je suis en l'air");
            }

            @Override
            void executeEntrerAuGarage() {
                System.out.println("impossible d'entrer, je suis en l'air");

            }

            @Override
            void executeDecoller() {
                System.out.println("impossible de décoller, je suis déjà en l'air");
            }

            @Override
            void executeAtterir() {
                System.out.println("transition d'état de En l'air => Piste");
                state=new EtatEnPiste();

            }

            @Override
            void executeDoActivity() {
                for (int i=0;i<10;i++) {
                    System.out.println("Activité de l'état en l'air ......."+i);
                }
            }
    }
}
