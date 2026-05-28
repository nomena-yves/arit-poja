package hei.arit.demo.endpoint.rest.controller.health;

import hei.arit.demo.services.SubstractService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class SubstractController {
  SubstractService service;

  @GetMapping("/sub")
  public Integer difference(Integer a, Integer b) {
    return service.substractNumbers(a, b);
  }
}
