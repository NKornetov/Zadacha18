import java.io.*;

public class Zadacha18 {


    public static void main(String[] args) {
        String output;
        String input;
        int count = 0;
        int count1 = 0;


        try (BufferedReader s = new BufferedReader(new FileReader("text.txt"))) { //Чтение файла

            while ((output = s.readLine()) != null) {
                count++; // считаем строки в файле

                System.out.println(output);
            }

        } catch (IOException exc) {

            System.out.println("Ошибка! " + exc);}

            BufferedReader ff = new BufferedReader(new InputStreamReader(System.in)); // Запись в файл

            try (FileWriter p = new FileWriter("text.txt")) {

                System.out.println("Наберите текст для записи в файл: ");
                do {
                    input = ff.readLine();

                    input = input + "\r\n";
                    count1++; // считаем введенные строки

                    p.write(input);

                }

                while (count1 < count); //выполняем пока количество введенных строк меньше тех, что было изначально

            } catch (IOException excl) {

                System.out.println("Ошибка! " + excl);

            }

        }
    }

