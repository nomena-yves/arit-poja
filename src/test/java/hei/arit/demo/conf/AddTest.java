import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AddTest {
  @Test
  void testNumber() {
    AddNumbersController controller = new AddNumbersController();
    assertEquals(3, controller.addNumbers(1, 2));
  }
}
