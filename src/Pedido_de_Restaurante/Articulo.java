package Pedido_de_Restaurante;

public class Articulo {
    private int id = (int)(Math.random()*1000000);
    private String nombre;
    private int cantidad;
    private double precio;

    public Articulo(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio(){
        return this.precio;
    }
}
