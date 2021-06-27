package dev.itzamic.gms.web.api.v1.services;

import dev.itzamic.gms.web.api.v1.resources.CarEntity;
import dev.itzamic.gms.web.api.v1.resources.CarInfoEntity;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CarInfoService {
  public ResponseEntity<CarInfoEntity> getCar(String id) {
    return null;
  }

  public ResponseEntity<List<CarEntity>> getAllCars() {
    return null;
  }

  public ResponseEntity<CarInfoEntity> create(CarInfoEntity payload) {
    return null;
  }

  public ResponseEntity<CarInfoEntity> update(String id, CarInfoEntity payload) {
    return null;
  }

  public void delete(String id) {}
}
