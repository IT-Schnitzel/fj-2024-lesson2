package org.example;

import lombok.Setter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    @Test
    void Cattest(){
        assertEquals("cat", new Cat("cat").getName());
    }
}