package utilities;

public enum Operator {
    OR,
    AND,
    AND_NOT,
    OR_NOT;

    public double execute(double a, double b) {
        return switch (this) {
            case Operator.AND -> Math.min(a, b);
            case Operator.OR -> Math.max(a, b);
            case Operator.AND_NOT -> Math.min(a, 1 - b);
            case Operator.OR_NOT -> Math.max(a, 1 - b);
        };
    }
}
