package org.example;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class City {
    private String slug;
    private Coordinates coords;
}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
class Coordinates {
    private double lat;
    private double lon;
}