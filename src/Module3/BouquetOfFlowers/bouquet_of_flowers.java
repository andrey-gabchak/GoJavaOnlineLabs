package Module3.BouquetOfFlowers;

import java.util.List;

/**
 * class bouquet_of_flowers
 *
 * Создать UML диаграмму с классами Роза, Ромашка, Астра, используя класс Цветок.
 * Собрать Букет цветов. Дополнить систему классами Тюльпан и Розовый куст.
 *
 * Написать классы на Java соответствующие
 * UML диаграмме https://github.com/andrey-gabchak/GoJavaOnlineLabs/blob/master/src/UML/flowers.jpg
 * из задания к Модулю 2.
 * Создать проект с исходниками и загрузить его на GitHub.
 *
 * Created by coura on 03.03.2016.
 */

public class bouquet_of_flowers {

    public static void main(String[] args) {

        List<Flower> flowers;

        Aster aster = new Aster();
        Daisy daisy = new Daisy();
        Rose rose = new Rose();
        RoseBush roseBush = new RoseBush();
        Tulip tulip = new Tulip();

        System.out.println(aster.getFlowersName());
        System.out.println(daisy.getFlowersName());
        System.out.println(rose.getFlowersName());
        System.out.println(roseBush.getFlowersName());
        System.out.println(tulip.getFlowersName());
    }



}
