package domain.prendas;

import java.util.List;

import static java.util.Objects.requireNonNull;

public class Prenda {
  private final Tipo tipo;
  private List<Atributo> atributos;


  public Prenda(Tipo tipo, Material material,  Color colorPrimario, Color colorSecundario, Trama trama) {
    this.tipo = requireNonNull(tipo, "Se requiere un Tipo para crear una Prenda");
    this.agregarAtributo(colorPrimario);
    this.agregarAtributo(colorSecundario);
    this.agregarAtributo(trama);
    this.agregarAtributo(material);
  }

  void agregarAtributo(Atributo atributo){
    // Aca voy a validar si el atributo es valido para el tipo de Prenda con el que se creó el objeto
    if(atributo != null && true){
      atributos.add(atributo);
    } // No quiero que la List se llene de nulls
  }

  Categoria getCategoria() {
    return this.tipo.getCategoria();
  }



}

