package FuzzySystem;

import FuzzyRule.FuzzyRule;
import FuzzySet.FuzzySet;
import FuzzyVariable.FuzzyVariable;
import utilities.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FuzzySystem {
    List<FuzzyRule> fuzzyRules;
    HashMap<String , FuzzyVariable> inVariables;
    HashMap<String , FuzzyVariable> outVariables;
    String name;
    String description;

    public HashMap<String , HashMap<String , Double>> Fuzzification(){
        HashMap<String , HashMap<String , Double>> out = new HashMap<>();
        for ( HashMap.Entry<String , FuzzyVariable> fuzzyVariable : inVariables.entrySet()){
            Double crispValue = fuzzyVariable.getValue().getCrispValue();
            HashMap<String , Double> newVariables = new HashMap<>();
            for (HashMap.Entry<String , FuzzySet> set : fuzzyVariable.getValue().getFuzzySets().entrySet() ){
                newVariables.put(set.getKey() , set.getValue().CheckMembership(crispValue));
            }
            out.put(fuzzyVariable.getKey() , newVariables);

        }
        return out;
    }

    public HashMap<Pair<String , String> , Double> Inference ( HashMap<String , HashMap<String , Double>> memberShip){
        HashMap<Pair<String , String> , Double> out = new HashMap<>();

        for (FuzzyRule rule : fuzzyRules) {
            double value1 = memberShip.get(rule.getInVariable().first().first().getName()).get(rule.getInVariable().first().second().getName());
            double value2 = memberShip.get(rule.getInVariable().second().first().getName()).get(rule.getInVariable().second().second().getName());
            double value = rule.getOperator().execute(value1, value2);
            out.put(new Pair<>(rule.getOutVariable().first().getName(), rule.getOutVariable().second().getName()), value);
        }
        return out;
    }


}
