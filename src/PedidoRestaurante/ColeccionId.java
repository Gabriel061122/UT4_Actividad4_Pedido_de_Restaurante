package PedidoRestaurante;

import java.util.HashSet;


class ColeccionId {

  private HashSet<Integer> ids;

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
