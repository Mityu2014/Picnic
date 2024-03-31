import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Integer> basketsProd = new HashMap<String, Integer>();
        int lenWord = 0;
        List<String> listWord = new ArrayList<String>();
        // Загрузка данных из файла
        File input = new File("input.txt");
        Scanner data = new Scanner(input);
        // Анализ данных
        while (data.hasNextLine()) listWord.add(data.next());
        for (String elem : listWord) {
            if (basketsProd.containsKey(elem)) {
                int val = basketsProd.get(elem);
                basketsProd.replace(elem,val + 1);
            }else basketsProd.put(elem, 1);
            if (elem.length() > lenWord) lenWord = elem.length();
        }
        System.out.println("Ввего слов: " + listWord.size() + "\nСамые длинные слова состоят из " + lenWord + " букв");
        System.out.println("Анализ количества уникальных слов\n" + basketsProd);
    }
}