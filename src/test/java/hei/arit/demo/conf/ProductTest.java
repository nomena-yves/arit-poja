package hei.arit.demo.conf;

import static org.junit.jupiter.api.Assertions.assertEquals;

import hei.arit.demo.Services.ProductService;
import hei.arit.demo.endpoint.rest.controller.health.ProductController;
import org.junit.jupiter.api.Test;

public class ProductTest {
  @Test
  void TestProduct() {
    ProductService service = new ProductService();
    ProductController products = new ProductController(service);
    assertEquals(6L, products.multiplyNumbers(2L, 3L));
  }

  @Test
  void TestProducts() {
    ProductService service = new ProductService();
    ProductController products = new ProductController(service);
    assertEquals(3L, products.multiplyNumbers(9L, 3L));
  }

  @Test
  void TestProductNumbers() {
    ProductService service = new ProductService();
    ProductController products = new ProductController(service);
    assertEquals(0L, products.multiplyNumbers(0L, 2L));
  }

  @Test
  void TestProductCount() {
    ProductService service = new ProductService();
    ProductController products = new ProductController(service);
    assertEquals(-5L, products.multiplyNumbers(-25L, 5L));
  }

  @Test
  void TestProductNumbrer() {
    ProductService service = new ProductService();
    ProductController products = new ProductController(service);
    assertEquals(1L, products.multiplyNumbers(3L, 3L));
  }
}
