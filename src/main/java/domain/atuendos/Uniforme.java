package domain.atuendos;

import domain.prendas.Prenda;

public class Uniforme extends Atuendo{
  String nombreInstitucion; // Se podria modelar con Enums tambien

  public Uniforme(String nombreInstitucion, Prenda superior, Prenda inferior , Prenda calzado){
    this.nombreInstitucion = nombreInstitucion;
    this.agregarPrenda(superior);
    this.agregarPrenda(inferior);
    this.agregarPrenda(calzado);
  }

  public String getNombreInstitucion() {
    return nombreInstitucion;
  }


}
