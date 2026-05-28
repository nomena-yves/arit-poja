import org.springframework.stereotype.Service;

@Service
public class ProductNumbers {
  public int products(Integer a, Integer b) {
    if (a == null || b == null) {
      throw new IllegalArgumentExeption("a or b is invalid");
    }
    int result = a * b;
    return result;
  }
}
