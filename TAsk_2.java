/*
 *  Реализовать программу ,которая выведет список сотрудников с кол-ом их повторений(по убыванию)
 */

package HomeWork_5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TAsk_2 {
    public static void main(String[] args) {
        String listmen = "Ваня, Петя, Миша, Саша, Ирина, Ольга, Даша, Петя, Ирина, Ольга, Ваня, Петя, Миша, Саша, Ирина, Ольга";
        String[] list = listmen.split(", ");
        System.out.println(listmen);
        Map<String,Integer> countmen = new HashMap<String,Integer>();
        for(String el:list){
            
            if (countmen.containsKey(el)){
                countmen.put(el,countmen.get(el)+1);
            }else{
                countmen.put(el,1);
            }


        }

        System.out.println(countmen);

        List <Map.Entry<String,Integer>> valuesList = new ArrayList(countmen.entrySet());
        Collections.sort(valuesList, new Comparator<Map.Entry<String,Integer>>() {
            public int compare(Map.Entry<String,Integer> o1, Map.Entry<String,Integer> o2) {
                return o2.getValue().compareTo(o1.getValue()); // по убыванию
                //return o1.getValue().compareTo(o2.getValue()); // по возрастанию
            }
        });

        System.out.println(valuesList); 
    }
    
}
