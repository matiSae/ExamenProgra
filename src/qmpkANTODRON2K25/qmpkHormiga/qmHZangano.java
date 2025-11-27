package qmpkANTODRON2K25.qmpkHormiga;

public class qmHZangano extends qmHormiga{

    public qmHZangano() {
        super("Zangano", "Omnivoro");
    }

    @Override
    public boolean qmComer(qmAlimento alimento) {
       return (alimento instanceof qmOmnivoro);
    }
    
}
