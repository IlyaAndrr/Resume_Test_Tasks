import java.io.BufferedReader;
import java.io.FileReader;
//    Напишите программу, которая рассчитывает положение точки относительно окружности.
//        Координаты центра окружности и его радиус считываются из файла1.
//        Пример:
//        1 1
//        5
//        Координаты точек считываются из файла2.
//        Пример:
//        0 0
//        1 6
//        6 6
//        Файлы передаются программе в качестве аргументов. Файл с координатами и радиусом окружности - 1 аргумент, файл с координатами точек - 2 аргумент.
//        Координаты в диапазоне float. Количество точек от 1 до 100. Вывод каждого положения точки заканчивается символом новой строки.
//        Соответствия ответов:
//        0 - точка лежит на окружности 1 - точка внутри 2 - точка снаружи

public class Solution {
    //Метод для нахождения расстоянию от центра окружности до точки, и его сравнение с радиусом
    public static int poisk(double coord1, double coord2, double centr1, double centr2, double rad) {
        double l = Math.sqrt(Math.abs((centr1 - coord1) * (centr1 - coord1)) + Math.abs((centr2 - coord2) * (centr2 - coord2)));
        int x=0;
        if (rad > l) x=1;
        if (rad < l) x=2;
        if (rad == l) x=0;
        return x;
    }

    public static void main(String[] args) throws Exception {
        double centrX; //Координаты центра по X
        double centrY; //Координаты центра по Y
        double coordY; //Координата точки по Y
        double coordX; //Координата точки по X
        double rad;
        String s;
        //String filename1 ="D:\\ResumeTestFiles1\\1.txt";//Для проверки вручную, файл согласно шаблону1
        //String filename2 ="D:\\ResumeTestFiles1\\2.txt";//Для проверки вручную, файл согласно шаблону2
        String filename1 = args[0];
        String filename2 =args[1];
        //Координаты центра считываем вручную,без циклов, всегда вид 2 числа сверху, одно снизу
        FileReader reader = new FileReader(filename1);
        BufferedReader readerstr = new BufferedReader(reader);
        s = readerstr.readLine();
        String[] array = s.split(" ");
        centrX = Double.parseDouble(array[0]);
        centrY = Double.parseDouble(array[1]);
        rad = Double.parseDouble(readerstr.readLine());
        //Идём по каждой строчке, разделяя числа пробелами и используя поиск по ним
        FileReader reader2 = new FileReader(filename2);
        BufferedReader readercoord = new BufferedReader(reader2);
        while((s=readercoord.readLine())!=null) {
            String[] array1 = s.split(" ");
            coordX = Double.parseDouble(array1[0]);
            coordY = Double.parseDouble(array1[1]);
            System.out.println(poisk(coordX,coordY,centrX,centrY,rad));
        }
    }
}
