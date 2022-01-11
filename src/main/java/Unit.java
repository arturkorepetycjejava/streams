import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Unit {
    KW("Kilowatt", "kW"),
    HP("Horsepower", "hp");
    private String unit;
    private String si;

}
