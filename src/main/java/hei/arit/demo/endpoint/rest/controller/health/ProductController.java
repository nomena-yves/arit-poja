import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
  ProductService service;

  @GetMapping("/multi")
  public int multiplyNumbers(int a, int b) {
    return service.products(a, b);
  }
}
