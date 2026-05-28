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
    assertEquals(3, controller.addNumbers(1, 2));
  }
}
