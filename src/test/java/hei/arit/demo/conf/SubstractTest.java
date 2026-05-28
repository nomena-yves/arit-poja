import static org.junit.jupiter.api.Assertions.assertEquals;

import hei.arit.demo.endpoint.rest.controller.health.SubstractController;
import org.junit.jupiter.api.Test;

class SubstractTest {

  SubstractService service = new SubstractService();
  public SubstractController controller = new SubstractController(service);

  @Test
  void substractTest() {
    assertEquals(2, controller.difference(5, 3));
  }
}
