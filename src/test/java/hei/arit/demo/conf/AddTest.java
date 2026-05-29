package hei.arit.demo.conf;

import static org.junit.jupiter.api.Assertions.assertEquals;

import hei.arit.demo.Services.AddNumbersService;
import hei.arit.demo.endpoint.rest.controller.health.AddNumbersController;
import org.junit.jupiter.api.Test;

class AddTest {
  @Test
  void testNumber() {
    AddNumbersService service = new AddNumbersService();
    AddNumbersController controller = new AddNumbersController(service);
    assertEquals(3L, controller.addNumbers(1L, 2L));
  }

  void testCount() {
    AddNumbersService service = new AddNumbersService();
    AddNumbersController controller = new AddNumbersController(service);
    assertEquals(4L, controller.addNumbers(2L, 2L));
  }

  void testNumberS() {
    AddNumbersService service = new AddNumbersService();
    AddNumbersController controller = new AddNumbersController(service);
    assertEquals(2L, controller.addNumbers(-3L, 5L));
  }

  void testab() {
    AddNumbersService service = new AddNumbersService();
    AddNumbersController controller = new AddNumbersController(service);
    assertEquals(4L, controller.addNumbers(-1L, 5L));
  }
}
