package FuzzyVariable;

import FuzzySet.FuzzySet;
import utilities.Pair;
import utilities.VariableType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FuzzyVariable {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pair<Double, Double> getRange() {
        return range;
    }

    public void setRange(Pair<Double, Double> range) {
        this.range = range;
    }

    public VariableType getType() {
        return type;
    }

    public void setType(VariableType type) {
        this.type = type;
    }

    public HashMap<String, FuzzySet> getFuzzySets() {
        return fuzzySets;
    }

    public void setFuzzySets(HashMap<String, FuzzySet> fuzzySets) {
        this.fuzzySets = fuzzySets;
    }

    String name;
    Pair<Double , Double> range;
    VariableType type;
    HashMap<String , FuzzySet> fuzzySets;

    public double getCrispValue() {
        return crispValue;
    }

    public void setCrispValue(double crispValue) {
        this.crispValue = crispValue;
    }

    double crispValue;
    public FuzzyVariable(String name, Pair<Double , Double> range, VariableType type){
        this.name = name;
        this.range = range;
        this.type = type;
        this.fuzzySets = new HashMap<>();
    }

    public void AddFuzzySet(FuzzySet fuzzySet){
        fuzzySets.put(fuzzySet.getName() , fuzzySet);
    }
}
