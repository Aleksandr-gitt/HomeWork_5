package HomeWork_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskPhoneBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String,String> db = new HashMap<String,String>();
        System.out.println("Введите ФИО :");
        String fio = scan.nextLine();
        System.out.println("Введите телефон :");
        String tel = scan.nextLine();
        System.out.println("Добавить в справочник данные? Да(y)/Нет(n)");
        String choice = scan.nextLine();
        while(choice=="y"){
            if (db.containsKey(fio)){
                db.put(fio,db.get(fio) + "; " + tel);
            }else{
                db.put(fio,tel);
            }
        }
        System.out.println(db);
    }
    
}
