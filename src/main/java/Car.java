import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Car {
    private Brand brand;
    private String model;
    private Integer productionYear;
    private Engine engine;
    private Integer price;
    private Integer mileage;
}
