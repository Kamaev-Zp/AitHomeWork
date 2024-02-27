package homework30;


import java.util.Scanner;

interface Button {

        void press();
        void say();
        void login();
        void password();
    }


@FunctionalInterface
interface Age {
    int operate(int a, int b);
}


    class main {
        public static void main(String[] args) {

            Button button = new Button() {
                @Override
                public void press() {
                    System.out.println("Вы нажали кнопочку");

                }

                @Override
                public void say() {
                    System.out.println("Добро пожаловать : ");

                }
                @Override
                public void login() {
                    System.out.println("Введите логин : ");
                }


                @Override
                public void password() {
                    System.out.println("Введите пороль : ");
                }
            };
            button.press();
            button.say();
            button.login();
            button.password();



            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите ваш год рождение : ");
            int oldAge = scanner.nextInt();


            Age add = new Age() {
                @Override
                public int operate(int a, int b) {
                    return a - b;

                }
            };

            System.out.println("Введите ваш год рождение :" );
            int result = add.operate(2024, oldAge);
            System.out.println("Ваш возраст : " + result);




            Scanner scanner1 = new Scanner(System.in);
            int oldAge1 = scanner1.nextInt();
            Age add1 = (a, b) -> a - b;

            System.out.println("Ваш Возраст :" + add1.operate(2024, oldAge1));

        }

}




