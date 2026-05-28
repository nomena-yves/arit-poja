import static org.junit.jupiter.api.Assertions.assertEquals;

import hei.arit.demo.ProductController;
import hei.arit.demo.ProductService;
import org.junit.jupiter.api.Test;

public class ProductTest {
  @Test
  void TestProduct() {
    ProductService service = new ProductService();
    ProductController products = new ProductController(service);
    assertEquals(6, products.multiplyNumbers(2, 3));
  }
}
