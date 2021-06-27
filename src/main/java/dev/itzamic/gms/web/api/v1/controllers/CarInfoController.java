package dev.itzamic.gms.web.api.v1.controllers;

import dev.itzamic.gms.web.api.v1.resources.CarEntity;
import dev.itzamic.gms.web.api.v1.resources.CarInfoEntity;
import dev.itzamic.gms.web.api.v1.services.CarInfoService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/car")
public class CarInfoController {

  private final CarInfoService service;

  public CarInfoController(CarInfoService service) {
    this.service = service;
  }

  @GetMapping
  public ResponseEntity<List<CarEntity>> getCars() {
    return service.getAllCars();
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<CarInfoEntity> getCar(@PathVariable String id) {
    return service.getCar(id);
  }

  @PostMapping
  public ResponseEntity<CarInfoEntity> create(@RequestBody CarInfoEntity payload) {
    return service.create(payload);
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<CarInfoEntity> update(
      @PathVariable String id, @RequestBody CarInfoEntity payload) {
    return service.update(id, payload);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> delete(@PathVariable String id) {
    service.delete(id);
    return ResponseEntity.noContent().build();
  }
}
