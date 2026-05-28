import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DivideTest {
  DivideService service = new DivideService();
  DivideController controller = new DivideController(service);

  @Test
  void divideTest() {
    assertEquals(2.00, controller.divideDouble(6.00, 3.00));
  }
}
