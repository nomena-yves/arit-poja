package hei.arit.demo.Services;

import org.springframework.stereotype.Service;

@Service
public class SubstractService {
  public Integer substractNumbers(Integer a, Integer b) {
    if (a == null || b == null) {
      throw new IllegalArgumentException("a or b is invalid");
    }
    Integer result = a - b;
    return result;
  }
}
