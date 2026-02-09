package Excepciones;

public class CantidadInvalidaDeArticulo extends Exception{
    public CantidadInvalidaDeArticulo(){
        super("El articulo no puede tener una cantidad menor a 1");
    }

    public String sugerencia(){
        return "Use la opción 'Eliminar' en el menú ";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "\n" + sugerencia();
    }
}
