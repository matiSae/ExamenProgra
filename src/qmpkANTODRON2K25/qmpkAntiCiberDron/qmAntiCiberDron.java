package qmpkANTODRON2K25.qmpkAntiCiberDron;

public class qmAntiCiberDron implements qmIIA {

    private qmBBA qmBomba;

    public qmAntiCiberDron(qmBBA bomba){
        this.qmBomba = bomba;
    }

@Override
public boolean qmBuscar(String qmTa) {

    int q = 0;

    for (char c : qmTa.toCharArray()) {

        switch (q) {

            case 0:
                if (c == 'a') q = 1;
                else return false;
            break;

            case 1:
                if (c == 'b') q = 2;
                else return false;
            break;

            case 2:
                if (c == 'c') q = 3;
                else return false;
            break;

            case 3:
                return false;
        }
    }
    return (q == 1 || q == 3);
}

    public qmBBA getQmBomba() { return qmBomba; }
    public void setQmBomba(qmBBA qmBomba) { this.qmBomba = qmBomba; }
}
