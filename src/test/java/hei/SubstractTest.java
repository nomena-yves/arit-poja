import org.junit.jupiter.api.Assertions.assertEquals;

public class SubstractTest {
  SubstractController controller;

  void substractTest() {
    assertEquals(2, controller.substractNumbers(5, 3));
  }
}
