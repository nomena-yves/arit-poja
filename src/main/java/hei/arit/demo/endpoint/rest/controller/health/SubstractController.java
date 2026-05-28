import org.springframework.web.bind.annotation.GetMapping;

public class SubstractController {
  SubstractService service;

  @GetMapping("/sub")
  public int difference(int a, int b) {
    return service.substractNumbers(a, b);
  }
}
