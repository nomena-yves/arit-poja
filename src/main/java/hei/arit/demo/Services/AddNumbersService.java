import org.springframework.stereotype.Service;

@Service
public class AddNumbersService {
  public int sumNumbers(int a, int b) {
    int result = a + b;
    if (result < 0) {
      throw new IllegalArgumentExeption("sum of a and b is invalide");
    }
    return result;
  }
}
