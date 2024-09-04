package org.example;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Coords {
    private double lat;
    private double lon;
}

@Getter
@Setter
@RequiredArgsConstructor
public class City {
    final private String slug;
    final private Coords coords;
}