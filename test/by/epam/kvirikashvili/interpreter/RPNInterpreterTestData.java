package by.epam.kvirikashvili.interpreter;

import org.testng.annotations.DataProvider;

public class RPNInterpreterTestData {
    @DataProvider(name = "interpreterTest")
    public Object[] testRPNInterpreter() {
        return new Object[][]{
                {"(8^5<<1&2|(2|5<<2&7))^12|(14^3)&(4|59>>2)^3", "15"},
                {"5|(1&2&(3|(4&(2^5|6&47)|3)|2)|1)", "5"},
                {"(71&(2&3|(3|(2&1>>2|2)&2)|10&2))|78", "79"},
                {"(8^5|1&2<<(2|5>>2&71))|1200", "1213"}
        };
    }
}
