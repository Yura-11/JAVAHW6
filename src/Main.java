import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main{

    // Добавляем номера в книгу
    public static void addNumber(String key, String value, Map<String, ArrayList<String>> contacts){
        if (contacts.containsKey(key)) {    //Проверяем наличие ключа
            contacts.get(key).add(value);
        } else {                            // Если нет добавляем ключ - значение
            ArrayList<String> list = new ArrayList<>();
            list.add(value);
            contacts.put(key, list);
        }

    }
    // Вывод контактов
    public static void printBook(Map<String, ArrayList<String>> contacts){
        for (var item : contacts.entrySet()) {
            String phones = "";
            for(String el: item.getValue()){
                phones = phones + el + "; ";
            }
            System.out.printf("%s: %s \n", item.getKey() , phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<String>> bookPhone = new HashMap<>();
        addNumber("Иванов", "89177111111", bookPhone);
        addNumber("Петров", "89177222222", bookPhone);
        addNumber("Сидоров", "89177333333", bookPhone);
        addNumber("Сидоров", "8917744444", bookPhone);
        addNumber("Иванов", "89177555555", bookPhone);
        addNumber("Иванов", "89177666666", bookPhone);
        printBook(bookPhone);
    }
}