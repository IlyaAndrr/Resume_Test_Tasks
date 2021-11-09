import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
//Task4
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
//Для наглядности закоммитить 21,закрывающая скобка на 35 раскоммитить 22,36,38,43
public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
           String filename = args[0];
      //  String filename = "D:\\ResumeTestFiles1\\3.txt";//Для проверки вручную, в файле числа на каждой строчке
        String s;
        int shagi = 0;
        int summ = 0;
        int ii = 0;
        int srednee;
        //Читаем из файла Числа
        list = readint(filename);
//Преобразуем динамический массив в обычный, как по условию
        Integer[] nums = list.toArray(new Integer[list.size()]);
      System.out.println(massiv(nums)[3]);
    }
        //Заполняем динамический массив числами построчно, где в строчке одно число
        protected static ArrayList<Integer> readint (String filename)throws Exception{
            ArrayList<Integer> readint = new ArrayList<>();
            String s = "";
            FileReader reader = new FileReader(filename);
            BufferedReader readermassiva = new BufferedReader(reader);
            while ((s = readermassiva.readLine()) != null) readint.add(Integer.parseInt(s));
            return readint;
        }
        protected static Integer[] massiv (Integer[]nums){
            int shagi = 0;
            int summ = 0;
            int ii = 0;
            int srednee;
            //Цикл для подсчёта Количества элементов, суммы, среднего
            for (int i = 0; i < nums.length; i++) {
                summ += nums[i];
                ii++;//}
        //        System.out.println("Элемент массива " + nums[i]);
            }
            srednee = (int) Math.round((double) summ / (double) ii);
       //     System.out.println("Сумма элементов " + summ + " Количество " + ii + " Среднее " + srednee);

            //Цикл для подсчёта количества шагов для прихода к среднему значению
            for (int i = 0; i < nums.length; i++) {
                shagi += (int) Math.sqrt((nums[i] - srednee) * (nums[i] - srednee));
            }
         //   System.out.println(shagi);
            Integer[] massiv = {summ, ii, srednee, shagi};
            return massiv;
        }

}
