import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        Brand mercedes = Brand.builder()
                .name("Mercedes-Benz")
                .headquarter("Stuttgart, Germany")
                .founded(LocalDate.of(1926, 6, 28))
                .build();

        Brand bmw = Brand.builder()
                .name("BMW")
                .headquarter("Munich, Germany")
                .founded(LocalDate.of(1916, 3, 7))
                .build();

        Brand fiat = Brand.builder()
                .name("Fiat")
                .headquarter("Turin, Piedmont, Italy")
                .founded(LocalDate.of(1899, 6, 11))
                .build();

        Brand ford = Brand.builder()
                .name("Ford")
                .headquarter("Dearborn, Michigan, U.S.")
                .founded(LocalDate.of(1903, 6, 16))
                .build();

        Brand opel = Brand.builder()
                .name("Opel")
                .headquarter("Rüsselsheim, Germany")
                .founded(LocalDate.of(1862, 1, 21))
                .build();


        Car x6 = Car.builder()
                .engine(new Engine(333.0, Unit.HP, 2998.0, Fuel.PETROL))
                .brand(bmw)
                .price(462000)
                .mileage(0)
                .productionYear(2021)
                .model("X6")
                .build();

        Car x3 = Car.builder()
                .engine(new Engine(286.0, Unit.HP, 2993.0, Fuel.DISEL))
                .brand(bmw)
                .price(247800)
                .mileage(10)
                .productionYear(2021)
                .model("X3")
                .build();

        Car s520i = Car.builder()
                .engine(new Engine(170.0, Unit.HP, 2171.0, Fuel.PETROL))
                .brand(bmw)
                .mileage(220000)
                .price(247800)
                .productionYear(2003)
                .model("520i")
                .build();


        Car mondeo1 = Car.builder()
                .engine(new Engine(180.0, Unit.HP, 1997.0, Fuel.DISEL))
                .brand(ford)
                .mileage(148200)
                .price(73900)
                .productionYear(2018)
                .model("Mondeo")
                .build();


        Car kuga1 = Car.builder()
                .engine(new Engine(149.0, Unit.HP, 1997.0, Fuel.DISEL))
                .brand(ford)
                .mileage(36000)
                .price(68900)
                .productionYear(2017)
                .model("Kuga")
                .build();

        Car fiesta1 = Car.builder()
                .engine(new Engine(95.0, Unit.HP, 1560.0, Fuel.DISEL))
                .brand(ford)
                .mileage(194000)
                .price(20000)
                .productionYear(2010)
                .model("Fiesta")
                .build();

        Car fiesta2 = Car.builder()
                .engine(new Engine(150.0, Unit.HP, 1997.0, Fuel.DISEL))
                .brand(ford)
                .mileage(85000)
                .price(99800)
                .productionYear(2017)
                .model("Kuga")
                .build();

        Car grandc = Car.builder()
                .engine(new Engine(140.0, Unit.HP, 1997.0, Fuel.DISEL))
                .brand(ford)
                .mileage(173000)
                .price(26399)
                .productionYear(2011)
                .model("Grand C-MAX")
                .build();

        Car fusion = Car.builder()
                .engine(new Engine(100.0, Unit.HP, 1596.0, Fuel.PETROL))
                .brand(ford)
                .mileage(140000)
                .price(12500)
                .productionYear(2009)
                .model("Fusion")
                .build();

        Car focus = Car.builder()
                .engine(new Engine(162.0, Unit.HP, 1999.0, Fuel.PETROL))
                .brand(ford)
                .mileage(84400)
                .price(48900)
                .productionYear(2017)
                .model("Focus")
                .build();

        Car insignia = Car.builder()
                .engine(new Engine(195.0, Unit.HP, 1956.0, Fuel.DISEL))
                .brand(opel)
                .mileage(223500)
                .price(31890)
                .productionYear(2012)
                .model("Insignia")
                .build();

        Car astra = Car.builder()
                .engine(new Engine(125.0, Unit.HP, 1399.0, Fuel.PETROL))
                .brand(opel)
                .mileage(31975)
                .price(65900)
                .productionYear(2018)
                .model("Astra")
                .build();

        Car corsa = Car.builder()
                .engine(new Engine(80.0, Unit.HP, 1229.0, Fuel.PETROL))
                .brand(opel)
                .mileage(96123)
                .price(18700)
                .productionYear(2006)
                .model("Corsa")
                .build();

        Car insignia2 = Car.builder()
                .engine(new Engine(170.0, Unit.HP, 1956.0, Fuel.DISEL))
                .brand(opel)
                .mileage(101000)
                .price(73800)
                .productionYear(2017)
                .model("Insignia")
                .build();

        Car gle450 = Car.builder()
                .engine(new Engine(367.0, Unit.HP, 2999.0, Fuel.PETROL))
                .brand(mercedes)
                .mileage(58000)
                .price(349000)
                .productionYear(2019)
                .model("GLE 450")
                .build();

        Car b180 = Car.builder()
                .engine(new Engine(109.0, Unit.HP, 1796.0, Fuel.DISEL))
                .brand(mercedes)
                .mileage(203211)
                .price(39000)
                .productionYear(2012)
                .model("B 180")
                .build();


        final var list = List.of(x6, x3, s520i, mondeo1, kuga1, fiesta1, fiesta2, grandc, fusion, focus, insignia, astra, corsa, insignia2, gle450, b180);

        ObjectMapper objectMapper = new ObjectMapper();
        String data = objectMapper.writeValueAsString(list);
        // Creates a FileOutputStream
        FileOutputStream file = new FileOutputStream("files/test.json");

        // Creates a PrintWriter
        PrintWriter output = new PrintWriter(file);
        output.print(data);
        output.close();

        // wyszukiwanie po 1,2 i wiecej parametrów
            //wyświetlanie toStringa
            //zapisywanie do innej kolekcji
        // przygotowanie responsa na podstawie danych i przekazanych parametrów
        // przeliczanie jednostek z HP na KW
        // wyszukiwanie pierwszego wyniku na podstawie przekazanych parametrów
        // sortowanie
            // przykład wykorzystania referencji do metody i Comparatora
        // przykład suppliera w findFirst orElseGet

    }
}
