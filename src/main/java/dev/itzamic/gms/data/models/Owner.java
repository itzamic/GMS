package dev.itzamic.gms.data.models;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Owner extends BaseEntity {
  private String firstName;
  private String lastName;
  private String email;
  private String phone;

  @OneToMany(mappedBy = "owner")
  private Set<Car> cars;
}
