import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/*
         * Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова,
         * Анна Мусина, Анна Крутова,
         * Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина
         * Светлова, Мария Савина, Мария Рыкова,
         * Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.
         * Написать программу, которая найдет и выведет
         * повторяющиеся имена с количеством повторений. Отсортировать по убыванию
         * популярности. Для сортировки использовать TreeMap.
         */

public class task02home {

    public static void main(String[] args) {
        TreeMap<String, Integer> nameCollection = new TreeMap<>();
        String text = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
        listName(nameCollection,text);
    }

    static TreeMap<String, Integer> listName(TreeMap<String, Integer> nameCollect, String getList) {
        getList.replace(".", "").split(",");
        String[] listS = getList.split(" ");
        List<String> nameList = new ArrayList<>();
        for (int i = 0; i < listS.length; i += 2) {
            nameList.add(listS[i]);
        }
        int count = 1;
        for (String name : nameList) {
            if (nameCollect.containsKey(name)) {
                count = nameCollect.get(name);
                count++;
                nameCollect.put(name, count);
            } else {
                count = 1;
                nameCollect.put(name, count);
            }
        }
        List<Integer> listInt = new ArrayList<>();
        for (Map.Entry getNum : nameCollect.entrySet()) {
            listInt.add((Integer) getNum.getValue());
        }
        Collections.sort(listInt);
        Collections.reverse(listInt);
        HashMap<String, Integer> sorteded = new LinkedHashMap<>();
        for (int i = 0; i < listInt.size(); i++) {
            for (Map.Entry getNum : nameCollect.entrySet()) {
                if (listInt.get(i) == getNum.getValue()) {
                    sorteded.put((String) getNum.getKey(), listInt.get(i));
                }
            }
        }
        System.out.println(sorteded);
        return nameCollect;
    }
}