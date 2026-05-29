package hei.arit.demo.Services;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
  public int products(Integer a, Integer b) {
    if (a == null || b == null) {
      throw new IllegalArgumentException("a or b is invalid");
    }
    int result = a * b;
    return result;
  }
}
