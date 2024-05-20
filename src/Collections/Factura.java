package Collections;

import java.util.Date;

public class Factura {
    int idFactura;
    Date fechaFactura;
    String nombreFactura;

    public Factura() {
    }

    public Factura(int idFactura, Date fechaFactura, String nombreFactura) {
        this.idFactura = idFactura;
        this.fechaFactura = fechaFactura;
        this.nombreFactura = nombreFactura;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public String getNombreFactura() {
        return nombreFactura;
    }

    public void setNombreFactura(String nombreFactura) {
        this.nombreFactura = nombreFactura;
    }
}
