import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SubstractTest {

  SubstractController controller = new SubstractController();

  @Test
  void substractTest() {
    assertEquals(2, controller.difference(5, 3));
  }
}
