import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DivideController {
  DivideService service;

  @GetMapping("/divid")
  public divideDouble(double a, double b) {
    return service.divideNumbers(a, b);
  }
}
