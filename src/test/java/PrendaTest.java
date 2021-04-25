import domain.prendas.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrendaTest {

  @Test
  public void elZapatoNegroConCategoriaColorMaterialTipoEstaCompleto() {
    assertTrue(zapatoNegro().completa());
  }

  @Test
  public void elZapatoNegroConCategoriaMaterialTipoEstaIncompleto() { // Esta incompleto ya que es no tiene un colorPrimario
    assertFalse(zapatoNegroIncompleto().completa());
  }

  @Test
  public void unPantalonDeVestirNegroEsDeCategoriaInferior(){
    assertEquals(this.pantalonVestirNegro().getCategoria(),Categoria.INFERIOR);
  }



  private Prenda zapatoNegro(){
    return new Prenda(new Tipo(Categoria.CALZADO),Material.CUERO,new Color(0,0,0),null,null);
  }

  private Prenda zapatoNegroIncompleto(){
    return new Prenda(new Tipo(Categoria.CALZADO),Material.CUERO,null,null,null);
  }

  private Prenda pantalonVestirNegro(){
    return new Prenda(new Tipo(Categoria.INFERIOR), Material.GABARDINA, new Color(0,0,0),null,null);
  }

}
