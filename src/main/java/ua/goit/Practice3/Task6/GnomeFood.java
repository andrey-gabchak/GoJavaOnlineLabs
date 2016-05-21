package ua.goit.Practice3.Task6;

import java.util.*;

/**
 * Created by coura on 21.05.2016.
 *
 * В країні гномів прийнято, що більша порція їжі дістається вищому гному.
 Дано два мисиви int[] довжиною N, з висотами гномів в першому і кілограмами їжі в другому.
 Для кожного i-го гнома треба знайти j-ту порцію їжі і записати в результат j-індекси.
 Приклад:
 [5, 7, 6, 9, 4] - гноми
 [8, 5, 6, 2, 3] - порції
 Найвищому гному з висотою 9 дістається найбільша порція 8 з індексом 0.
 Другий за висотою гном (7), отримує другу завбільшки порцію (6) з індексом 2, і т.д.
 Найнищий (4) отримує найменшу порцію 2 (індекс 3)
 Резульнат
 [4, 2, 1, 0, 3]
 */
public class GnomeFood {
    public int[] find(int[] gnames, int[] portions) {
        Map<Integer, Integer> gnamesMap = new HashMap<>();
        Map<Integer, Integer> foodMap = new HashMap<>();
        for (int i = 0; i < gnames.length; i++) {
            gnamesMap.put(i, gnames[i]);
            foodMap.put(i, portions[i]);
        }
        gnamesMap = sortMapByValue(gnamesMap);
        foodMap = sortMapByValue(foodMap);
        Iterator iterator = foodMap.keySet().iterator();
        int result[] = new int[gnames.length];
        for (Integer integer : gnamesMap.keySet()) {
            result[integer] = (int) iterator.next();
        }
        return result;
    }

    private Map<Integer, Integer> sortMapByValue(Map<Integer, Integer> sortMap) {
        List<Map.Entry<Integer, Integer>> list =
                new LinkedList<>(sortMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        Map<Integer, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : list)
            result.put(entry.getKey(), entry.getValue());
        return result;
    }
}
