package hei.arit.demo.conf;

import static org.junit.jupiter.api.Assertions.assertEquals;

import hei.arit.demo.Services.SubstractService;
import hei.arit.demo.endpoint.rest.controller.health.SubstractController;
import org.junit.jupiter.api.Test;

class SubstractTest {

  SubstractService service = new SubstractService();
  public SubstractController controller = new SubstractController(service);

  @Test
  void substractTest() {
    assertEquals(2L, controller.difference(5L, 3L));
  }

  @Test
  void substractTestab() {
    assertEquals(3L, controller.difference(6L, 3L));
  }

  @Test
  void substractcount() {
    assertEquals(2L, controller.difference(5L, 3L));
  }
}
