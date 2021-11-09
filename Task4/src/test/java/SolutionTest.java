import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//        Дан массив целых чисел nums. Напишите программу, выводящую минимальное количество ходов, требуемых для приведения всех элементов к одному числу. За один ход можно уменьшить или увеличить число массива на 1.
//        Пример:
//        nums = [1, 2, 3]
//        Решение: [1, 2, 3] => [2, 2, 3] => [2, 2, 2]
//        Минимальное количество ходов: 2
//        Элементы массива читаются из файла, переданного в качестве аргумента командной строки.
//        Пример: На вход подаётся файл с содержимым:
//        1
//        10
//        2
//        9
//        Вывод в консоль: 16
class SolutionTest {

    @Test
    void readint() {
    }

    @Test
    void massiv() {
        Integer[] nums ={1,2,3};
        System.out.println("Сумма элементов " + Solution.massiv(nums)[0] + " Количество " + Solution.massiv(nums)[1] + " Среднее " + Solution.massiv(nums)[2]+" Шаги "+  Solution.massiv(nums)[3]);
        Assertions.assertEquals(2,Solution.massiv(nums)[3]);

        Integer[] nums1={0,3,5};
        System.out.println("Сумма элементов " + Solution.massiv(nums1)[0] + " Количество " + Solution.massiv(nums1)[1] + " Среднее " + Solution.massiv(nums1)[2]+" Шаги "+  Solution.massiv(nums1)[3]);
        Assertions.assertEquals(5,Solution.massiv(nums1)[3]);

        Integer[] nums2={0,1,3};
        System.out.println("Сумма элементов " + Solution.massiv(nums2)[0] + " Количество " + Solution.massiv(nums2)[1] + " Среднее " + Solution.massiv(nums2)[2]+" Шаги "+  Solution.massiv(nums2)[3]);
        Assertions.assertEquals(3,Solution.massiv(nums2)[3]);

        Integer[] nums3={1,10,2,9};
        System.out.println("Сумма элементов " + Solution.massiv(nums3)[0] + " Количество " + Solution.massiv(nums3)[1] + " Среднее " + Solution.massiv(nums3)[2]+" Шаги "+  Solution.massiv(nums3)[3]);
        Assertions.assertEquals(16,Solution.massiv(nums3)[3]);
    }
}