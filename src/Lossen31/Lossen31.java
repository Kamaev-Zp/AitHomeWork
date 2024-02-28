package Lossen31;

import java.util.Scanner;

import static Lossen31.Lossen31.Moon.*;

public class Lossen31 {
    enum Moon {
        NEW_MOON(" 1 New Moon", "\uD83C\uDF11"),
        WAXING_CRESCENT(" 2 Waxing Crescent", "\uD83C\uDF12"),
        FIRST_QUARTER(" 3 First Quarter", "\uD83C\uDF13"),
        WAXING_GIBBOUS(" 4 Waxing Gibbous", "\uD83C\uDF14"),
        FULL_MOON(" 5 Full Moon", "\uD83C\uDF15"),
        WANING_GIBBOUS(" 6 Waning Gibbous", "\uD83C\uDF16"),
        LAST_QUARTER(" 7 Last Quarter", "\uD83C\uDF17"),
        WANING_CRESCENT(" 8 Waning Crescent", "\uD83C\uDF18");


        private final String description;

        private final String s;

        Moon(String description, String s) {
            this.description = description;
            this.s = s;

        }

        public String getDescription() {
            return description;
        }

        public String getS() {
            return s;
        }

    }


    public static void main(String[] args) {

        Moon[] moons = Moon.values();
        for (Moon moon : moons) {
            System.out.println(moon.getDescription() + moon.getS());
        }

        System.out.println("Выберите какая луна Вам нужна " );
        System.out.println("Введите номер :");
        Scanner scanner = new Scanner(System.in);
        int moonname = scanner.nextInt();

        switch (moonname) {
            case 1:
                System.out.println("Новолуние " + "\uD83C\uDF11");
                break;


            case 2:
                System.out.println("Восходящий полумесяц  "+ "\uD83C\uDF12");
                break;


            case 3:
                System.out.println("Первая четверть"+ "\uD83C\uDF13" );
                break;


            case 4:
                System.out.println("Восходящая луна " + "\uD83C\uDF14");
                break;


            case 5:
                System.out.println("Полнолуние" + "\uD83C\uDF15");
                break;


            case 6:
                System.out.println("Убывающая луна " + "\uD83C\uDF16");
                break;


            case 7:
                System.out.println("Последняя четверть " + "\uD83C\uDF17");
                break;


            case 8:
                System.out.println("Нисходящий полумесяц " + "\uD83C\uDF18");
                break;

            default:
                System.out.println("Нету такой луны" + "\uD83D\uDE31");
        }
        }
    }



