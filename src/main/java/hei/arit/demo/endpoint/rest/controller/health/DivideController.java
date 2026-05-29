package hei.arit.demo.endpoint.rest.controller.health;

import hei.arit.demo.Services.DivideService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class DivideController {
  DivideService service;

  @GetMapping("/divid")
  public double divideDouble(@RequestParam double a, @RequestParam double b) {
    return service.divideNumbers(a, b);
  }
}
