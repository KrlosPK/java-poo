package SobreCarga_SobreEscritura;

public abstract class Animal {
    int animal_id;
    String animal_name;
    double animal_age;

    protected abstract void move();

    public void breathe() {
        System.out.println("The animal breathes");
    }

    // Sobrecarga del método "breathe()"
    public void breathe(String animal_name) {
        System.out.println("The animal " + animal_name + " breathes.");
    }
}
