import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AddTest {
  @Test
  void testNumber() {
    AddNumbersService service = new AddNumbersService();
    AddNumbersController controller = new AddNumbersController(service);
    assertEquals(3, controller.addNumbers(1, 2));
  }
}
