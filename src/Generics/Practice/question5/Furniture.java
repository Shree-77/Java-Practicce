package Generics.Practice.question5;

/**
 * Develop a generic class Furniture with generic type Material.
 * The class should have a generic method thatreceives the Material
 * type as input and generates the price of the furniture.
 * 
 */

public class Furniture<Material> {

    Material material;

    public Furniture(Material material) {
        this.material = material;
    }

    public double GeneratePrice() {
        double price = 100;
        if (material.equals("Wood"))
            price *= 2.5;
        if (material.equals("Iron"))
            price *= 3;
        if (material.equals("Leather"))
            price *= 1.5;

        return price;
    }

    public static void main(String[] args) {
        Furniture<String> Table = new Furniture<String>("Wood");
        Furniture<String> Chair = new Furniture<String>("Iron");

        System.out.println("Table Price : " + Table.GeneratePrice());
        System.out.println("Chair price : " + Chair.GeneratePrice());
    }
}
