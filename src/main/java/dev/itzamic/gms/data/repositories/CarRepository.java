package dev.itzamic.gms.data.repositories;

import dev.itzamic.gms.data.models.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {}
