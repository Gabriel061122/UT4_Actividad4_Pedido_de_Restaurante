package Pedido_de_Restaurante;
import java.util.HashSet;
import java.util.Set;

class ColeccionId {

    private Set<Integer> ids;

    public ColeccionId() {
        ids = new HashSet<>();
    }

    public boolean agregarId(int id) {
        return ids.add(id);
    }

    public boolean existeId(int id) {
        return ids.contains(id);
    }
}

