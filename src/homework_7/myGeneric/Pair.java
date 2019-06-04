package homework_7.myGeneric;

class Pair<T, V> {
    private T first;
    private V second;

    private Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public static <T, V> Pair of(T first, V second) {
        return new Pair<T, V>(first, second);
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    @Override
    public int hashCode() {
        if (first != null && second != null) {
            if (first instanceof Number && second instanceof CharSequence) {
                return ((Integer) first) / ((CharSequence) second).length() * 31;

            } else if (first instanceof CharSequence && second instanceof Number) {
                return ((Integer) second) / ((CharSequence) first).length() * 31;

            } else return super.hashCode();

        } else return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pair) {
            if (this == obj || this.getClass() == obj.getClass()) {
                return true;
            } else if (this.first == ((Pair<T, V>) obj).first && this.second == ((Pair<T, V>) obj).second) {
                return true;
            } else return false;
        } else return false;
    }
}
