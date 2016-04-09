package main.java.ua.goit.Module3.MusicStore;

/**
 * class MusicStore
 *
 * Create a UML diagram with guitar, piano, trumpet, musical instrument using a class.
 * Open Music Store.
 *
 * Write to the corresponding Java classes
 * UML diagramhttps://github.com/andrey-gabchak/GoJavaOnlineLabs/blob/master/src/UML/musical_instrumets(correct).jpg
 * From job to Module 2.
 * Create a project with a source code and upload it to GitHub.
 *
 * Created by coura on 03.03.2016.
 */

class MusicStore {

    static void someInstrumetn() {

        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Trumpet trumpet = new Trumpet();

        System.out.println(guitar.getInstrumentName());
        System.out.println(piano.getInstrumentName());
        System.out.println(trumpet.getInstrumentName());
    }

}
