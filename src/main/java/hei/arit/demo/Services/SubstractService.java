import org.springframework.stereotype.Service;

@Service
public class SubstractService {
  public int substractNumbers(int a, int b) {
    if (a == null || b == null) {
      throw new IllegalArgumentExeption("a or b is invalid");
    }
    int result = a - b;
    return result;
  }
}
