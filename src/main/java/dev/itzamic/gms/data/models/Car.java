package dev.itzamic.gms.data.models;

import java.time.Year;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Car extends BaseEntity {
  private String licensePlate;
  private String brand;
  private String model;
  private Year releaseYear;
  private int kilometers;

  @ManyToOne
  @JoinColumn(name = "owner_id")
  private Owner owner;
}
