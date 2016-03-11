package Module6;

/**
 * Created by coura on 11.03.2016.
 */
public class FigureExcepion extends Exception {

    private int figureValue;

    public FigureExcepion(int figureValue) {
        this.figureValue = figureValue;
    }

    public int getFigureValue() {
        return figureValue;
    }
}
