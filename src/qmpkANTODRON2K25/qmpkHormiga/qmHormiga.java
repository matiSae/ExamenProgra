package qmpkANTODRON2K25.qmpkHormiga;

public abstract class qmHormiga implements qmIHormiga{
    private String qmTipoAlimentacion;
    private String qmTipoHormiga;

    public qmHormiga(String qmTipoHorimiga, String qmTipoAlimentacion){
        this.qmTipoAlimentacion=qmTipoAlimentacion;
        this.qmTipoHormiga=qmTipoHorimiga;
    }


    public String getQmTipoAlimentacion() {
        return qmTipoAlimentacion;
    }
    public void setQmTipoAlimentacion(String qmTipoAlimentacion) {
        this.qmTipoAlimentacion = qmTipoAlimentacion;
    }
    public String getQmTipoHormiga() {
        return qmTipoHormiga;
    }
    public void setQmTipoHormiga(String qmTipoHormiga) {
        this.qmTipoHormiga = qmTipoHormiga;
    }

}
