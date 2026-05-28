package hei.arit.demo.endpoint.rest.controller.health;

import hei.arit.demo.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ProductController {
  public ProductService service;

  @GetMapping("/multi")
  public int multiplyNumbers(int a, int b) {
    return service.products(a, b);
  }
}
