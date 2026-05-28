import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SubstractTest {

  ProductService service = new ProductService();
  public SubstractController controller = new SubstractController(service);

  @Test
  void substractTest() {
    assertEquals(2, controller.difference(5, 3));
  }
}
