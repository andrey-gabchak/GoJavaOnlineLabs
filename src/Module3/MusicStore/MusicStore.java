package Module3.MusicStore;

import java.util.List;

/**
 * class Music_store
 *
 * Создать UML диаграмму с классами Гитара, Фортепиано, Труба, используя класс Музыкальный инструмент.
 * Открыть Музыкальный магазин.
 *
 *Написать классы на Java соответствующие
 * UML диаграмме https://github.com/andrey-gabchak/GoJavaOnlineLabs/blob/master/src/UML/musical_instrumets(correct).jpg
 * из задания к Модулю 2.
 * Создать проект с исходниками и загрузить его на GitHub.
 *
 * Created by coura on 03.03.2016.
 */

public class MusicStore {

    public static void main(String[] args) {
        List<MusicalInstrument> musicalInstrumentList; //При чем тут класс MusicalInstrument?

        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Trumpet trumpet = new Trumpet();

        System.out.println(guitar.getInstrumentName());
        System.out.println(piano.getInstrumentName());
        System.out.println(trumpet.getInstrumentName());
    }

}
