package ua.goit.Core.Module3.BouquetOfFlowers;

/**
 * class Aster
 *
 * Create a UML diagram with the classes of Rose, Chamomile, Aster, using flower class.
 * Collect Bouquet of flowers. To supplement the system classes and Pink Tulip bush.
 *
 * Write to the corresponding Java classes
 * UML diagram https://github.com/andrey-gabchak/GoJavaOnlineLabs/blob/master/src/UML/flowers.jpg
 * From job to Module 2.
 * Create a project with a source code and upload it to GitHub.
 *
 * Created by coura on 06.03.2016.
 */

class Aster implements Flower {

    private String flowersName = "Aster";

    @Override
    public String getFlowersName() {
        return this.flowersName;
    }
}
