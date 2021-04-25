import domain.prendas.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrendaTest {

  @Test
  public void elZapatoNegroConCategoriaColorMaterialTipoEstaCompleto() {
    assertTrue(zapatoNegro().completa());
  }



  private Prenda zapatoNegro(){
  Prenda zapatoNegro = new Prenda(new Tipo(Categoria.CALZADO),Material.CUERO,new Color(0,0,0),null,null);
  return zapatoNegro;
  }
}