import org.json.JSONArray;
import java.io.BufferedReader;
import java.io.FileReader;

//Условие: Получить значение из json: 262517
//На входе: Массив объектов Json и Id
public class Solution {
    public static void main(String[] args) throws Exception {
   //     String jsonstr = readFile("Путь к файлу");
    //    String jsonid="6104546";//Первый айди
        String jsonstr = readFile(args[0]);//Путь до файла
        String jsonid=args[1];//айди в файле
        System.out.println(jsonById(jsonstr,jsonid));

    }
    //Нахождение конкретного элемента Json массива по содержанию в нём указанного айди
protected static String jsonById(String jsonArrayStr,String id) throws Exception{
        String jsonById="";
    JSONArray json = new JSONArray(jsonArrayStr);
    for (int i = 0; i < json.length(); i++) {
        if (json.getJSONObject(i).get("id").toString().equals(id))
            jsonById=json.getJSONObject(i).toString();
    }
        return jsonById;
}
//Построчное чтение файла
    protected static String readFile(String file) throws Exception {
        String s;
        StringBuilder result = new StringBuilder();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while ((s = bufferedReader.readLine()) != null) result.append(s);
        return result.toString();
    }
}

