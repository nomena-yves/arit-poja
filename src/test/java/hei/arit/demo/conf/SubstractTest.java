import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SubstractTest {
  SubstractController controller;

  @Test
  void substractTest() {
    assertEquals(2, controller.substractNumbers(5, 3));
  }
}
