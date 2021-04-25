import domain.atuendos.Uniforme;
import domain.prendas.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AtuendoTest {

  @Test
  public void elAtuendoDelInstitutoJohnsonTiene3Prendas(){
    assertEquals(atuendoInstitutoJohnson().getPrendas().size(),3);
  }

  @Test
  public void elAtuendoDelInstitutoJohnsonCorrespondeAEsaInstitucion(){
    assertEquals(atuendoInstitutoJohnson().getNombreInstitucion(),"Instituto Johnson");
  }

  private Uniforme atuendoInstitutoJohnson(){
    return new Uniforme("Instituto Johnson",this.camisaBlanca(),this.pantalonVestirNegro(),this.zapatoNegro());
  }

  private Prenda pantalonVestirNegro(){
    return new Prenda(new Tipo(Categoria.INFERIOR), Material.GABARDINA, new Color(0,0,0),null,null);
  }

  private Prenda zapatoNegro(){
    return new Prenda(new Tipo(Categoria.CALZADO),Material.CUERO,new Color(0,0,0),null,null);
  }

  private Prenda camisaBlanca(){
    return new Prenda(new Tipo(Categoria.SUPERIOR),Material.TELA,new Color(255,255,255),null,null);
  }

}