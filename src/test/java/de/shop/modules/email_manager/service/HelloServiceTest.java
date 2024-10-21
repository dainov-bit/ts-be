package de.shop.modules.email_manager.service;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class HelloServiceTest {
    private HelloService helloService;
    private static boolean status; // статус должен быть статическим
    private static int count = 0; // количество также статическое

    @BeforeAll
    public static void start() { // метод должен быть статическим
        System.out.println("Запуск тестов");
        System.out.println("Статус: " + status);
        System.out.println("Количество: " + count);
    }

    @BeforeEach
    public void init() {
        count++;
        helloService = new HelloService();
        System.out.println("TEST №" + count);
    }

    @AfterAll
    public static void endAll() { // метод должен быть статическим
        System.out.println("Тестирование завершено.\n Количество тестов: " + count);
    }

    @Test
    public void testHello() {
        String name = "Artem";
        String expected = "My name Artem";  // Ожидаемое значение
        String actual = helloService.myname(name);  // Фактическое значение

        // Сообщение на русском языке в случае ошибки
        assertEquals(expected, actual, "Ожидалось: 'My name Artem', но получено: '" + actual + "'");
    }
    @Test
    public void test2() {
        String x = "Art";
        String s = "My name "+x;
        String result = "My name Artem";
        assertEquals(result,s,"Неа.\n Должно быть так: "+result+"\n А получилось: "+s);
    }
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5,-5,-6})
    public void pos(int number) {
        assertTrue(number > 0,  "Ау, число должно быть больше нуля");
    }

}
