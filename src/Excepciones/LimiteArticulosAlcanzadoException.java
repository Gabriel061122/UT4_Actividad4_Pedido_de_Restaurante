package Excepciones;

public class LimiteArticulosAlcanzadoException extends Exception{
    public LimiteArticulosAlcanzadoException( ) {

        super("limite de articulos alcanzado");
    }

    String sugerencia(){
        return "Retire uno de sus artículos para poder añadir aquel que desea";
    }

    @Override
    public String getMessage(){
        return  super.getMessage() + "\n" + sugerencia();
    }
}
