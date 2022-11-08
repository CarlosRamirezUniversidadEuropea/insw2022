//package com.ue.insw.proyecto.exercises.pruebas;
//
////todo importar Junit en maven y ejecutar test
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.RepeatedTest;
//import org.junit.jupiter.api.Test;
//
//
//class CalculatorTestCase {
//
//
//    Calculator calculator;
//
//    @BeforeEach
//    void setUp() {
//        calculator = new Calculator();
//    }
//
//    @Test
//    @DisplayName("Simple multiplication should work")
//    void testMultiply() {
//        assertEquals(20, calculator.multiply(4, 5),
//                "Regular multiplication should work");
//    }
//
//    @RepeatedTest(5)
//    @DisplayName("Ensure correct handling of zero")
//    void testMultiplyWithZero() {
//        assertEquals(0, calculator.multiply(0, 5), "Multiple with zero should be zero");
//        assertEquals(0, calculator.multiply(5, 0), "Multiple with zero should be zero");
//    }
//
//    @Test
//    @DisplayName("Simple concatenation should work")
//    void testConcat() {
//        assertEquals("HolaMundo", calculator.concat("Hola", "Mundo"),
//                "Regular concatenation should work");
//    }
//
//    @Test
//    @DisplayName("Simple concatenation should work")
//    void testNull() {
//        assertEquals("Hola", calculator.concat("Hola", null),
//                "Regular concatenation should work");
//    }
//
//    @Test
//    @DisplayName("Simple concatenation should work")
//    void testNull2() {
//        assertEquals("Hola", calculator.concat(null, "Hola"),
//                "Regular concatenation should work");
//    }
//
//    @Test
//    @DisplayName("Simple concatenation should work")
//    void testConcat2() {
//        assertEquals("HolaMundo", calculator.concat2("Hola", "Mundo"),
//                "Regular concatenation should work");
//    }
//
//    @Test
//    @DisplayName("Simple concatenation should work")
//    void testNull3() {
//        assertEquals(Calculator.EMPTY, calculator.concat2("Hola", null),
//                "Regular concatenation should work");
//    }
//
//}
