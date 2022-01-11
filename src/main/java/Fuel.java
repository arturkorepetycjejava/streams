import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum Fuel {
    PETROL("Petrol"),
    DISEL("Diesel"),
    ELECTRIC("Electric"),
    CNG("CNG"),
    LPG;
    private String desc;
}
