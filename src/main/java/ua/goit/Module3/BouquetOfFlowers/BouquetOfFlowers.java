package ua.goit.Module3.BouquetOfFlowers;

/**
 * class bouquet_of_flowers
 *
 * Create a UML diagram with the classes of Rose, Chamomile, Aster, using flower class.
 * Collect Bouquet of flowers. To supplement the system classes and Pink Tulip bush.
 *
 * Write to the corresponding Java classes
 * UML diagram https://github.com/andrey-gabchak/GoJavaOnlineLabs/blob/master/src/UML/flowers.jpg
 * From job to Module 2.
 * Create a project with a source code and upload it to GitHub.
 *
 * Created by coura on 03.03.2016.
 */

class BouquetOfFlowers {

    static void someFlowers() {

        System.out.println(new Aster().getFlowersName());
        System.out.println(new Daisy().getFlowersName());
        System.out.println(new Rose().getFlowersName());
        System.out.println(new RoseBush().getFlowersName());
        System.out.println(new Tulip().getFlowersName());
    }
}
