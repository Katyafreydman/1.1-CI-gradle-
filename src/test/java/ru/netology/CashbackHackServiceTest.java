package ru.netology;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public  void shouldReturn() {

        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }
    @Test
    public  void shouldReturn1() {

        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }
    @Test
     public void shouldReturn2() {

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldReturn3() {

        int amount = 200;

        int actual = service.remain(amount);
        int expected = 800;
        assertEquals(expected, actual);
    }

    }
