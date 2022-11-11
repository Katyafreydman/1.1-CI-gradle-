package ru.netology;


import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

class CashbackHackServiceTest {

        CashbackHackService service = new CashbackHackService();

        @org.testng.annotations.Test
        public  void shouldReturn() {

            int amount = 900;

            int actual = service.remain(amount);
            int expected = 100;

            assertEquals(expected, actual);
        }
        @org.testng.annotations.Test
        public  void shouldReturn1() {

            int amount = 0;

            int actual = service.remain(amount);
            int expected = 1000;

            assertEquals(expected, actual);
        }
}