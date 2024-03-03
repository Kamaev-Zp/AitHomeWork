package HomeWork33;

public class HomeWork33Ait {
    public static class Box<T> {
        private T data;

        public Box() {
            this.data = null;
        }

        public T get() {
            return data;
        }

        public void set(T data) {
            this.data = data;
        }

        public boolean isValueEqual(Object value) {
            if (data == null) {
                return value == null;
            }
            return data.equals(value);
        }

        public static <T> boolean isEqual(Box<T> box1, Box<T> box2) {
            if (box1 == null || box2 == null) {
                return false;
            }
            T data1 = box1.get();
            T data2 = box2.get();
            if (data1 == null) {
                return data2 == null;
            }
            return data1.equals(data2);
        }
    }
}




