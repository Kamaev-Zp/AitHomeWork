package HomeWork33;

    public  class Main {
        public static void main(String[] args) {


            HomeWork33Ait.Box<Integer> box1 = new HomeWork33Ait.Box<>();
            HomeWork33Ait.Box<Integer> box2 = new HomeWork33Ait.Box<>();

            box1.set(10);
            box2.set(20);

            int value1 = box1.get();
            int value2 = box2.get();
            System.out.println("Value in box1: " + value1);
            System.out.println("Value in box2: " + value2);

            System.out.println("Is value in box1 equal to 10? " + box1.isValueEqual(10));
            System.out.println("Is value in box2 equal to 20? " + box2.isValueEqual(20));

            System.out.println("Are the boxes equal? " + HomeWork33Ait.Box.isEqual(box1, box2));
        }
    }
