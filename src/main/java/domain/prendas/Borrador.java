package domain.prendas;

import java.util.HashMap;
import java.util.Map;
//WIP
public class Borrador {
  private final Tipo tipo;
  // private List<Atributo> atributos;
  private Map<Clave,Atributo> atributos = new HashMap<Clave, Atributo>();;
  public Borrador(Tipo tipo, Map<Clave,Atributo> atributos) {
    this.tipo = tipo;
    this.atributos = atributos;
  }

  public void setAtributos(Map<Clave, Atributo> atributos) {
    this.atributos = atributos;
  }

  public Tipo getTipo() {
    return tipo;
  }

  public Map<Clave, Atributo> getAtributos() {
    return atributos;
  }
}
