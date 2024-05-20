package Collections;

import java.util.*;

public class ArrayLists {
    public static void main (String[] args) {
        List<Factura> invoices = new ArrayList<>();

        /*Factura fac1 = new Factura();
        Factura fac2 = new Factura();
        Factura fac3 = new Factura();
        invoices.add(fac1);*/

        invoices.add(new Factura(1, new Date(), "Factura Edemco"));
        invoices.add(new Factura(2, new Date(), "Factura Air-e"));
        invoices.addFirst(new Factura(3, new Date(), "Factura EPM"));

        // Invertir el orden de la lista
        // Collections.reverse(invoices);

//        System.out.println("------for------");
        // ? Recorrer por índice
//        for (int i = 0; i < invoices.size(); i++) {
//            System.out.println(invoices.get(i).getIdFactura());
//        }

        System.out.println("------forEach------");

        // Recorrido forEach
        for (Factura factura : invoices) {
            System.out.println(factura.getNombreFactura());
        }
    }
}
