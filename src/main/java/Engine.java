import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Engine {
    private Double power;
    private Unit unit;
    private Double engineCapacity;
    private Fuel fuel;

    public void startEngine() throws Exception {
        if(fuel == Fuel.DISEL){
            throw new Exception();
        }
        System.out.println("engine start");
    }
}
