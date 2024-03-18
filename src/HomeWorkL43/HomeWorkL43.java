package HomeWorkL43;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HomeWorkL43 {


        // BufferedReader используется для буферизированного чтения
// текста из файла. Метод readLine() читает текст построчно
// до тех пор, пока не встретит null, что означает конец файла.

        public static void main(String[] args) {
            try (FileReader fr = new FileReader("resources/fileH.txt")) {
                BufferedReader br = new BufferedReader(fr);

                do {
                    // Чтение построчно
                    String line = br.readLine();
                    if (line == null) // когда кончились данные
                        break;
                    // Вывод прочитанных данных на экран
                    System.out.print(line);
                } while (true);
            } catch (IOException e) {
                System.out.print("Ошибка ввода вывода");
            }
        }
    }


