package homework_7.myGeneric;

class Pair<T, V> {
    private T first;
    private V second;

    private Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public static <T, V> Pair of(T first, V second) {
        return new Pair<>(first, second);
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    @Override
    public int hashCode() {
        if (getFirst() != null && getSecond() != null) {
            return 31 * (getFirst().hashCode() - getSecond().hashCode());
        } else return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        } else if (this.first == ((Pair<?, ?>) obj).first && this.second == ((Pair<?, ?>) obj).second) {
            return true;
        } else return false;
    }
}
