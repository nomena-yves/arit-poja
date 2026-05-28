package hei.arit.demo.endpoint.rest;

import hei.arit.demo.services.DivideService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class DivideController {
  DivideService service;

  @GetMapping("/divid")
  public double divideDouble(double a, double b) {
    return service.divideNumbers(a, b);
  }
}
