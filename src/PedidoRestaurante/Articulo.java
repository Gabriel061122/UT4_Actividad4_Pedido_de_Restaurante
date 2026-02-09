package PedidoRestaurante;

public class Articulo {
    private int id = (int)(Math.random()*1000000);
    private String nombre;
    private double precio;

    public Articulo(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
