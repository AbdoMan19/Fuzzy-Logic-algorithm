package utilities;

public record Pair<T, S>(T first, S second) {

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
