package domain.atuendos;

import domain.prendas.Prenda;

public class Uniforme extends Atuendo{

  String nombreInsitucion;

  public Uniforme(String nombreInstitucion, Prenda superior, Prenda inferior , Prenda calzado){
    this.nombreInsitucion = nombreInstitucion;

  }
}
