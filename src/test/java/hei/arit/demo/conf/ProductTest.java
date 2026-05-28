import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProductTest {
  @Test
  void TestProduct() {
    ProductController products = new ProductController();
    assertEquals(6, products.multiplyNumbers(2, 3));
  }
}
