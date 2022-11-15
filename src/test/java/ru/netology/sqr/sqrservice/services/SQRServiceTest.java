package ru.netology.sqr.sqrservice.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void calcTest(){
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calc(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcTestCheckOneHundred(){
        SQRService service = new SQRService();

        int expected = 8;
        int actual = service.calc(100, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcTestCheckBorder(){
        SQRService service = new SQRService();

        int expected = 8;
        int actual = service.calc(99, 300);

        Assertions.assertEquals(expected, actual);
    }


}