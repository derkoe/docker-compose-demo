package at.porscheinformatik.docker;

import javax.persistence.*;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CAR_SEQ")
    @SequenceGenerator(name = "CAR_SEQ", sequenceName = "CAR_SEQ")
    public Integer id;

    @Column(length = 17)
    public String vin;

    public Car() {
    }

    public Car(String vin) {
        this.vin = vin;
    }
}
