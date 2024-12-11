package FuzzySet;

import java.util.ArrayList;

public class TriangleFuzzySet extends FuzzySet{
    public TriangleFuzzySet(String name , ArrayList<Double> values) {
        super(name , new ArrayList<Double>(values));
    }

    @Override
    public double CheckMembership(double value) {
        return 0;
    }
}
