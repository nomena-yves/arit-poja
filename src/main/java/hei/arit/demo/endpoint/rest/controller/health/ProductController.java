package hei.arit.demo.endpoint.rest.controller.health;

import hei.arit.demo.Services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ProductController {
  public ProductService service;

  @GetMapping("/multi")
  public Long multiplyNumbers(Long a, Long b) {
    return service.products(a, b);
  }
}
