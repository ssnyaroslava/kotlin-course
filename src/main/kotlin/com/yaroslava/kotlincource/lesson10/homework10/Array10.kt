package com.yaroslava.kotlincource.lesson10.homework10

class MyArray {
    fun main() {
        //Задание 1: Создание и Инициализация Массива
        val int: Array<Int> = arrayOf(1, 2, 3, 4, 5)
        //Задание 2: Создание Пустого Массива
        val empty = arrayOfNulls<String>(10)
        //Задание 3: Заполнение Массива в Цикле
        val double = arrayOfNulls<Double?>(5)
        for (i in 0 until 5){
            double[i] = i*2.0
        }
        //Задание 4: Изменение Элементов Массива
        val int2 = arrayOfNulls<Int>(5)
        for(i in 0 until int2.size){
            int2[i] = i*3
        }
        //Задание 5: Работа с Nullable Элементами
        val str = arrayOf(null, "строка1", "строка2")
        //Задание 6: Копирование Массива
        val int3 = arrayOf<Int>(3, 9, 27)
        val intArr = arrayOfNulls<Int>(int3.size)
        for(i in 0 until intArr.size){
            intArr[i] = int3[i]
        }
        //Задание 7: Разница Двух Массивов
        val arr = arrayOf<Int>(3, 9, 27, 81, 243)
        val arr2 = arrayOf<Int>(32, 16, 8, 4, 2)
        val arr3 = arrayOfNulls<Int>(5)
        for(i in 0 until arr2.size){
            arr3[i] = arr[i] - arr2[i]
        }
        //Задание 8: Поиск Индекса Элемента
        val arrInt = arrayOf<Int>(1, 3, 9, 2, 211)
        fun find(a : Int) : Int {
            val index = -1
            for (i in 0 until arrInt.size){
                if(arrInt[i].equals(5)) return i
            }
            return index
        }
        //Задание 9: Перебор Массива
        val intArrr = arrayOf(1, 3, 20, 21, 40)
        for (i in 0 until intArrr.size){
            if (intArrr[i] % 2 == 1){
                println(intArrr[i].toString() + " нечётное")
            } else println(intArrr[i].toString() + " чётное")
        }
        }
}