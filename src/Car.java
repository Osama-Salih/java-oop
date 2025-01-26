public class Car<T> implements GenericInterface<T> {
    @SuppressWarnings("unchecked")
    @Override
    public T carModel() {
        return (T) new CarV1();
    }
} 