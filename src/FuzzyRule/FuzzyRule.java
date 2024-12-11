package FuzzyRule;

import FuzzySet.FuzzySet;
import FuzzyVariable.FuzzyVariable;
import utilities.Operator;
import utilities.Pair;

import java.util.HashMap;
import java.util.List;

public class FuzzyRule {
    public FuzzyRule(Pair<Pair<FuzzyVariable, FuzzySet>, Pair<FuzzyVariable, FuzzySet>> inVariable, Pair<FuzzyVariable, FuzzySet> outVariable, Operator operator) {
        this.inVariable = inVariable;
        this.outVariable = outVariable;
        this.operator = operator;
    }

    Pair<Pair<FuzzyVariable, FuzzySet> , Pair<FuzzyVariable, FuzzySet>> inVariable;
    Pair<FuzzyVariable, FuzzySet> outVariable;
    Operator operator;

    public Pair<Pair<FuzzyVariable, FuzzySet>, Pair<FuzzyVariable, FuzzySet>> getInVariable() {
        return inVariable;
    }

    public void setInVariable(Pair<Pair<FuzzyVariable, FuzzySet>, Pair<FuzzyVariable, FuzzySet>> inVariable) {
        this.inVariable = inVariable;
    }

    public Pair<FuzzyVariable, FuzzySet> getOutVariable() {
        return outVariable;
    }

    public void setOutVariable(Pair<FuzzyVariable, FuzzySet> outVariable) {
        this.outVariable = outVariable;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
