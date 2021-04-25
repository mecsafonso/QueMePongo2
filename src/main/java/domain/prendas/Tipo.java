package domain.prendas;


public class Tipo implements  Atributo{
  Categoria categoria;

  public Tipo(Categoria categoria) {
    this.categoria = categoria;
  }

  public Categoria getCategoria() {
    return categoria;
  }

}
