package org.example;

import java.util.Arrays;

import static org.example.Test.*;

import org.junit.jupiter.api.Test;

//Напишите тесты для метода take(numbers, n), который возвращает массив из первых n
// значений массива numbers. Метод take() уже импортирован в файл с тестами.
//
//        Метод принимает два параметра:
//
//        массив чисел int[] numbers
//        количество элементов в новом массиве, число int n
//        Идея метода взята из библиотеки org.apache.commons.lang3 — ArrayUtils.subarray()
public class testss {
    @Test
    public void testtake() {
        int[] numbers = {1, 2, 3};
        int[] emptynumbers = {};
        var test1 = take(numbers, numbers.length+1); //индекс больше длины
        assert Arrays.equals(numbers, test1);
        var test2 = take(emptynumbers, 2); //пустой массив
        assert Arrays.equals(emptynumbers, test2);
        var test3 = take(numbers, -1);  //минусовое значение
        assert Arrays.equals(test3, emptynumbers);
        var test4 = take(numbers,numbers.length);
        assert  Arrays.equals(test4,numbers);
        var test5 = take(numbers,0);
        assert Arrays.equals(test5,emptynumbers);


    }

}
