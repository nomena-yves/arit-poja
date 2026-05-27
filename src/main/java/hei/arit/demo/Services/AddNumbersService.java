import org.springframework.stereotype.Service;

@Service
public class AddNumbersService {
  public int sumNumbers(int a, int b) {
    return a + b;
  }
}
