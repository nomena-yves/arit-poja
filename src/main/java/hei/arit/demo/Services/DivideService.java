import org.springframework.stereotype.Service;

@Service
public class DivideService {
  public double divideNumbers(double a, double b) {
    if (b == 0) {
      throw new IllegalArgumentException("b is invalid");
    }
    double result = a / b;
    return result;
  }
}
