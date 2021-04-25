package domain.prendas;

// Es posible que tmb se pueda modelar a Tipo como una interface
public class Tipo {
  Categoria categoria;

  public Tipo(Categoria categoria) {
    this.categoria = categoria;
  }

  public Categoria categoria() {
    return categoria;
  }
}

// public enum Tipo {
// ZAPATILLA {
//   Categoria categoria() {
//      return Categoria.CALZADO;
//    }
//  },
//  REMERA_MANGA_LARGA {
//    Categoria categoria() {
//      return Categoria.SUPERIOR;
//    }
//  },
//}