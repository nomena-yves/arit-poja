import static org.junit.jupiter.api.Assertions.assertEquals;

import hei.arit.demo.AddNumbersController;
import hei.arit.demo.AddNumbersService;
import org.junit.jupiter.api.Test;

class AddTest {
  @Test
  void testNumber() {
    AddNumbersService service = new AddNumbersService();
    AddNumbersController controller = new AddNumbersController(service);
    assertEquals(3, controller.addNumbers(1, 2));
  }
}
