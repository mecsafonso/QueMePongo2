package domain.prendas;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Objects.requireNonNull;

public class Prenda {
  private final Tipo tipo;
  // private List<Atributo> atributos;
  private Map<Clave,Atributo> atributos = new HashMap<Clave, Atributo>();;

  public Prenda(Tipo tipo, Material material,Color colorPrimario, Color colorSecundario, Trama trama) {
    this.tipo = requireNonNull(tipo, "Se requiere un Tipo para crear una Prenda");
    this.agregarAtributo(colorPrimario,Clave.COLORPRIMARIO);
    this.agregarAtributo(colorSecundario, Clave.COLORSECUNDARIO);
    this.agregarAtributo(trama, Clave.TRAMA);
    if(trama == null){ // No me convence mucho esta parte todavía.
      this.agregarAtributo(Trama.LISA, Clave.TRAMA);
    }
    this.agregarAtributo(material, Clave.MATERIAL);
  }

  public void agregarAtributo(Atributo atributo, Clave clave){
    // Aca voy a validar si el atributo es valido para el tipo de Prenda con el que se creó el objeto
    if(atributo != null && true){
      atributos.put(clave,atributo);
    } // No quiero que la List se llene de nulls
  }

  public Categoria getCategoria() {
    return this.tipo.getCategoria();
  }

  // una Prenda está completa cuando tiene minimamente una categoria; una material y un colorPrimario (adicionalmente puede tener colorSecundario) (Tipo siempre debe tener).
  public boolean completa() {
    return
        atributos.containsKey(Clave.COLORPRIMARIO) && atributos.containsKey(Clave.MATERIAL) && this.getCategoria() != null;
  }

}

