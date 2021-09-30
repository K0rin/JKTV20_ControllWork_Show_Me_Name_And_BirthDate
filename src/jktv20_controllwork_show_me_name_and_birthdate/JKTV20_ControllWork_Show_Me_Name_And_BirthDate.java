/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv20_controllwork_show_me_name_and_birthdate;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JKTV20_ControllWork_Show_Me_Name_And_BirthDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = "";
        name = scanner.nextLine();
        System.out.println("Введите вашу фамилию");
        String lastname = "";
        lastname = scanner.nextLine();
        System.out.println("Введите год рождения");
        int year;
        year = scanner.nextInt();
        System.out.println("Введите месяц рождения цифрой");
        int month;
        month = scanner.nextInt();
        System.out.println("Введите день рождения");
        int day;
        day = scanner.nextInt();
        String month_name = "";
        switch (month){
            case 1:
             month_name = "января";
             break;
            case 2:
             month_name = "февраля";
             break;
            case 3:
             month_name = "марта";
             break;
            case 4:
             month_name = "апреля";
             break;
            case 5:
             month_name = "мая";
             break;
            case 6:
             month_name = "июня";
             break;
            case 7:
             month_name = "июля";
             break;
            case 8:
             month_name = "августа";
             break;
            case 9:
             month_name = "сентября";
             break;
            case 10:
             month_name = "октября";
             break;
            case 11:
             month_name = "ноября";
             break;
            case 12:
             month_name = "декабря";
             break;
        }
        String answer = name+" "+lastname+" "+"родился"+" "+day+" "+month_name+" "+year+" "+"года";
        System.out.println(answer);
    }
    
}
