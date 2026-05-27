import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AddNumbersController {
  public final AddNumbersService addNumbersService;

  @GetMapping("/add")
  public int addNumbers(int a, int b) {
    return addNumbersService.sumNumbers(a, b);
  }
}
