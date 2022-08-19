//import java.util.Scanner;

public class Ecap {
    public static void main(String[] args) {
        // Scanner read = new Scanner(System.in);
        // int a = read.nextInt();

        Cat cat = new Cat();
        Fish fish = new Fish();
        Flower flower = new Flower();
        Car car = new Car();

        cat.show_identity("hitam", 4);
        fish.show_identity("paus", "plankton");
        flower.show_identity("bangkai", "merah", 12);
        car.show_identity("sedan", "merah", 4);

        // method getFurColor dalam kodisi private jadi metod tidak bisa dipanggil
        cat.getFurColor();

        // cat.FurColor;
        // cat.show_identity("putih", 3);
        // cat.show_identity("hitam putih", 4);
        // cat.show_identity("poleng-poleng", 3);
        // cat.show_identity("bintik-bintik", 4);

    }
}

class Cat {
    private String fur_color;
    private int num_of_leg;

    public void show_identity(String color, int leg) {
        fur_color = color;
        num_of_leg = leg;
        System.out
                .println("Saya kucing dengan detail, Warna Bulu: " + fur_color + " dengan jumlah kaki: " + num_of_leg);
    }

    protected void getFurColor() {
        System.out.println(fur_color);
    }

}

class Fish {
    protected String type;
    private String feed;

    public void show_identity(String t, String f) {
        type = t;
        feed = f;
        System.out.println("Saya ikan dengan detail, Jenis: " + type + ", makanan " + feed);
    }
}

class Flower {
    public String name;
    private String color;
    protected int num_of_pental;

    public void show_identity(String n, String c, int np) {
        name = n;
        color = c;
        num_of_pental = np;
        System.out.println(
                "Saya Bunga dengan detail, Jenis: " + name + ", color:" + color + ". jumlah kelopak: " + num_of_pental);
    }
}

class Car {
    private String type;
    private String color;
    private int num_of_tire;

    public void show_identity(String n, String c, int np) {
        type = n;
        color = c;
        num_of_tire = np;
        System.out.println(
                "Saya Mobil dengan detail, Type: " + type + ", color:" + color + ", jumlah roda: " + num_of_tire);
    }
}