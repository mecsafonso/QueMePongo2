package domain.atuendos;
import domain.prendas.Prenda;

import java.util.*;

public class Atuendo {
  private List<Prenda> prendas = new ArrayList<Prenda>();

  void agregarPrenda(Prenda prenda){
  if(prenda != null || true){ // Se va a verificar en este if que se pueda agregar la prenda al atuendo, no se tiene el criterio todavia
    prendas.add(prenda);
  }
  }

  public List<Prenda> getPrendas() {
    return prendas;
  }

  public boolean xd() {
    return true;
  }


}