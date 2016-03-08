package Module3.Directory;

import java.util.List;

/**
 * class Directoty
 *
 * Задание к Модулю 2.
 * Создать UML диаграмму с классами Текстовый файл, Аудио файл, Файл изображения, используя класс Файл.
 * Создать класс Директория, содержащий файлы разных форматов.
 *
 * Задание к Модулю 3.
 * Написать классы на Java соответствующие
 * UML диаграмме https://github.com/andrey-gabchak/GoJavaOnlineLabs/blob/master/src/UML/directory.jpg
 * из задания к Модулю 2.
 * Создать проект с исходниками и загрузить его на GitHub.
 *
 * Created by coura on 03.03.2016.
 */

class Directoty {

    static void someFiles() {

        AudioFile audioFile = new AudioFile();
        PicturesFile picturesFile = new PicturesFile();
        TextFile textFile = new TextFile();

        System.out.println(audioFile.getFileType());
        System.out.println(picturesFile.getFileType());
        System.out.println(textFile.getFileType());
    }
}
