import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Написать регулярное выражение, которое будет выделаять все имена статических ресурсов с расширением.
//        Например: /source/upload/pic5.jpg
//        Выделить должно pic5.jpg
//        Стат ресурсы могут быть с разным именем и расширением!
public class Solution {
    public static void main(String[] args) throws Exception {
        String s = readFile(args[0]);
        System.out.println(filenames(s));
    }

    //Поиск имени через регулярное выражение
protected static String filenames(String str){
  String result="";
    Pattern pattern = Pattern.compile("(?<=/)[^/\\\" \\t]*?\\.+?[^/ \\t]*?(?=\\\")");
    Matcher matcher = pattern.matcher(str);
    while (matcher.find()) {
        result+=str.substring(matcher.start(), matcher.end())+"\n";
    }
  return result;
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
