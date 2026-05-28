import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
  ProductNumbers service;

  @GetMapping("/multi")
  public multiplyNumbers(int a, int b) {
    return service.products(a, b);
  }
}
