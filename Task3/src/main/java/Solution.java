import com.google.gson.Gson;
import lombok.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
//Task3
//        На вход в качестве аргументов программы поступают два файла: tests.json и values.json (в приложении к заданию находятся примеры этих файлов)
//        • values.json содержит результаты прохождения тестов с уникальными id
//        • tests.json содержит структуру для построения отчёта на основе прошедших тестов (вложенность может быть большей, чем в примере)
//        Напишите программу, которая формирует файл report.json с заполненными полями value для структуры tests.json на основании values.json.
//        Пример:
//        Часть структуры tests.json:
//        {"id": 122, "title": "Security test", "value": "",
//        "values": [
//        {"id": 5321, "title": "Confidentiality", "value": ""},
//        {"id": 5322, "title": "Integrity", "value": ""}]}
//        После заполнения в соответствии с values.json:
//        {"values": [
//        {"id": 122, "value": "failed"},
//        {"id": 5321,"value": "passed"},
//        {"id": 5322,"value": "failed"}]}
//        Будет иметь следующий вид в файле report.json:
//        {"id": 122, "title": "Security test", "value": "failed",
//        "values": [
//        {"id": 5321, "title": "Confidentiality", "value": "passed"},
//        {"id": 5322, "title": "Integrity", "value": "failed"}]}
//Для тестового режима вывода в консоль,закоммитить  37,38,39, раскоммитить 40,41,42,53,86,
public class Solution {
    static List<Value> values;
    public static void main(String[] args) {
             String jsonTests = readFile(args[0]);
             String jsonValue = readFile(args[1]);
             String jsonReport= args[3];
        //     String jsonTests = readFile("D:\\Resume_Test1\\tests.json");//Указываем тестовый тест
        //     String jsonValue = readFile("D:\\Resume_Test1\\values.json");//Указываем тестовое значение
        //     String jsonReport= "D:\\Resume_Test1\\report.json";//Указываем тестовый репорт
        //Извлекаем из строки обьекты в список
        List<Test> tests = new Gson().fromJson(jsonTests, TestObject.class).getTests();
        //Извлекаем из строки обьекты в список
        values = new Gson().fromJson(jsonValue, ValueObject.class).getValues();
        //Заполняем значения методом рекурсии и возвращаем в лист tests
        tests.stream().peek(Solution::recursion).collect(Collectors.toList());
        //Преобразователь списка обьектов json в строку
        String jsonStr = new Gson().toJson(new TestObject(tests));
         try (FileWriter report = new FileWriter(jsonReport))
        {
       //     System.out.println(jsonStr); //Вывод в консоль
            report.write(jsonStr);
        }catch (IOException ex) {
            System.out.println("Ошибка при записи файла");
        }
    }
//Метод для рекурсивного прохождения вложений json
protected static void recursion(Test test) {
        //Если в тесте есть пустой список значений
        if (test.getValues() != null && test.getValues().size() == 0) {
            //Если значение есть то находим его
            Optional<Value> value = values.stream().filter(a -> a.getId().equals(test.getId())).findFirst();
            //Если объект не пустой, присваиваем ему значение или если есть значение, то присваиваем ему новое
            value.ifPresent(value1 -> test.setValue(value1.getValue()));
            test.getValues().stream().peek(Solution::recursion);
        } else {
            //Если значение есть то находим его
            Optional<Value> value = values.stream().filter(a -> a.getId().equals(test.getId())).findFirst();
            //Если объект не пустой, присваиваем ему значение или если есть значение, то присваиваем ему новое
            value.ifPresent(value1 -> test.setValue(value1.getValue()));
        }
    }
//Чтение файлов в строку
    protected static String readFile(String file) {
        String json = "";
        try (FileReader reader = new FileReader(file)) {
            Scanner scan = new Scanner(reader);
            while (scan.hasNextLine()) {
                json +=scan.nextLine();
            }
        } catch (IOException ex) {
            System.out.println("Ошибка при чтении файла" + file);
        }
       // System.out.println(json); //Вывод в консоль
        return json;
    }

    @Setter
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    static
    class TestObject {
        List<Test> tests;
    }

    @Setter
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    class Test {
        String id;
        String title;
        String value;
        List<Test> values;
    }

    @Setter
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    class ValueObject {
        List<Value> values;
    }

    @Setter
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    class Value {
        String id;
        String value;
    }
}
