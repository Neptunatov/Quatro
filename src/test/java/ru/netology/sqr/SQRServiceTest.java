package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @Test
    void rangeEqualToZero() {
        SQRService service = new SQRService();

        int upRange = 0;
        int lowRange = 0;
        int expected = 0;

        int quantity = service.calculate(upRange, lowRange);
        assertEquals(expected, quantity);
    }

    @Test
    void rangesNegativeValues() {
        SQRService service = new SQRService();

        int upRange = -800;
        int lowRange = -700;
        int expected = 0;

        int quantity = service.calculate(upRange, lowRange);
        assertEquals(expected, quantity);
    }

    @Test
    void rangeNotBeInt() {
        SQRService service = new SQRService();

        int upRange = (int) Math.pow(10, 63);
        int lowRange = (int) Math.pow(20, 64);
        int expected = 0;

        int quantity = service.calculate(upRange, lowRange);
        assertEquals(expected, quantity);
    }
}

