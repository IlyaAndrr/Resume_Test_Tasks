import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    //Запуск мэина с тестовым файлом
    void main() throws Exception {
String[] args = {"Расположение файла"};
Solution.main(args);
    }

    @Test
    //Вырезка из файла, изображения и скрипты
    void filenames() {
        String result="apple-touch-icon-57x57.png\n" +
                "apple-touch-icon-72x72.png\n" +
                "apple-touch-icon-114x114.png\n" +
                "apple-touch-icon-144x144.png\n" +
                "script.js?1399488247\n" +
                "script2.js?1493371307\n" +
                "captcha.js?1399488247\n";
        String str="<link rel=\"apple-touch-icon\" href=\"/apple-touch-icon-57x57.png\">\n" +
                "<link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"/apple-touch-icon-72x72.png\">\n" +
                "<link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"/apple-touch-icon-114x114.png\">\n" +
                "<link rel=\"apple-touch-icon\" sizes=\"144x144\" href=\"/apple-touch-icon-144x144.png\"\n>" +
                "<script type=\"text/javascript\" src=\"/source/js/script.js?1399488247\"></script>\n" +
                "<script type=\"text/javascript\" src=\"/source/js/script2.js?1493371307\"></script>\n" +
                "<script type=\"text/javascript\" src=\"/source/js/captcha.js?1399488247\"></script>";
        Assertions.assertEquals(result,Solution.filenames(str));
        System.out.println(Solution.filenames(str));
    }
}