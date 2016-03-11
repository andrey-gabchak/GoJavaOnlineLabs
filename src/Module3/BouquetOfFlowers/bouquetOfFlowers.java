package Module3.BouquetOfFlowers;

import java.util.List;

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
