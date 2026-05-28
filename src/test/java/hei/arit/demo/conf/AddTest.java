import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AddTest {
  @Test
  void testNumber() {
    AddNumbersController controller = new AddNumbersController();
    AddNumbersService service = new AddNumbersService();
    assertEquals(3, controller.addNumbers(1, 2));
  }
}
