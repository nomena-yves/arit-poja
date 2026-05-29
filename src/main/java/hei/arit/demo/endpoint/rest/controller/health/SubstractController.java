package hei.arit.demo.endpoint.rest.controller.health;

import hei.arit.demo.Services.SubstractService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class SubstractController {
  SubstractService service;

  @GetMapping("/sub")
  public Long difference(Long a, Long b) {
    return service.substractNumbers(a, b);
  }
}
