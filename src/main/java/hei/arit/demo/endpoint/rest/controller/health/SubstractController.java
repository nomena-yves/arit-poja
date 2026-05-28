import org.springframework.web.bind.annotation.GetMapping;

public class SubstractController {
  SubstractService service;

  @GetMapping("/sub")
  public Integer difference(Integer a, Integer b) {
    return service.substractNumbers(a, b);
  }
}
