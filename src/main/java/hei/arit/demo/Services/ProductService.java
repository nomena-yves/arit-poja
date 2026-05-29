package hei.arit.demo.Services;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
  public Long products(Long a, Long b) {
    if (a == null || b == null) {
      throw new IllegalArgumentException("a or b is invalid");
    }
    Long result = a * b;
    return result;
  }
}
