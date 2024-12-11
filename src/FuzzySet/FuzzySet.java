package FuzzySet;

import java.util.ArrayList;
import java.util.List;

public abstract class FuzzySet {
    public FuzzySet(String name, ArrayList<Double> values) {
        this.name = name;
        this.values = values;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getValues() {
        return values;
    }

    public void setValues(List<Double> values) {
        this.values = values;
    }

    String name;
    List<Double> values;
    public abstract double CheckMembership(double value);

}
