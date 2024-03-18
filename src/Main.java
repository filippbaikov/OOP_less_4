import gb_collections.lists.util.DZ_4.GBLinkedList;
import gb_collections.lists.util.DZ_4.GbLinkedL;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        GbList<String>list=new GbArrayLists<>();
//        list.add("a");
//        list.add("b");
//        System.out.println(list);
      GbLinkedL <String> list=new GBLinkedList<>();
        list.addFirstValue("aaa");
        list.addFirstValue("bbb");
        list.remove1("aaa");
        list.addLastValue("это жесть, я 4 дня мучаюсь");
        list.addFirstValue("пожалейте мои мозги");
        list.remove1("пожалейте мои мозги");

        for(String str:list){
            System.out.println(str);

        }







    }
}