package at.porscheinformatik.docker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarInitializer {

    @Bean
    public CommandLineRunner initCars(CarRepository carRepository) {
        return strings -> {
            if (carRepository.count() == 0) {
                carRepository.save(new Car("WVWZZZ1K1342347H"));
                carRepository.save(new Car("WAUZZZ1F1J234234"));
            }
        };
    }
}
