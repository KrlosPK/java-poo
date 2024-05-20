package Collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LinkedLists {
    public static void main (String[] args ) {
        List<Factura> invoices = new ArrayList<>();

        Factura fac1 = new Factura();
        Factura fac2 = new Factura(1, new Date(), "factura 1");

        invoices.add(fac1);
        invoices.addFirst(fac2);

//        for (Factura factura : invoices) {
//            System.out.println(factura.getIdFactura());
//        }

        for (int i = 0; i < invoices.size(); i++) {
            System.out.println(invoices.get(i).getNombreFactura());
        }
    }
}
