package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
///String methods
        //startsWith
        //endsWith
        //substring
//        String s="buckyrobertsbuckyroberts";
//        System.out.println(s.indexOf("rob",10));

        //concatenation
        String a = "Bacon";
        String b = "moster";
        System.out.println(a.concat(b));
        //replace
        System.out.println(a.replace('B', 'F'));
        //toUpperCase
        System.out.println(b.toUpperCase());//turns every letter
        //trim
        // deletes blank spaces
        String b2 = "     monster    ";
        System.out.println(b2.trim());
        //recursion
//        public static long fact(long n){
//            if(n<=1) return 1;
//            else return  n* fact(n-1);
        //Array list
//        String[] things = {"egg", "lasers", "hats", "pie"};
//        List<Object> list = new ArrayList<Object>();
//        for (String x : things) {
//            list.add(x);
//            list.add(1);
//        }
//        String[] morethings = {"lasers", "hats", "pies"};
//        List<String> list2 = new ArrayList<String>();
//        for (String y : morethings)
//            list2.add(y);
//        for (int x = 0; x < list.size(); x++) {
//            System.out.printf("%s ", list.get(x));
//        }
//        void editlst(List<String> l1, List<String> l2) {
//            Iterator<String> it = l1.iterator();
//            while (it.hasNext()) {
//                if (l2.contains(it.next()))
//                    it.remove();
//
//            }
//        }
        //LinkedList
        List<String> list2=new LinkedList<String>();
        list2.add("asdf");
        list2.add("hi muy brother");
        list2.add("hihhihahahihahah");
        list2.add("asdef");
        list2.add("asddf");
        List list=new LinkedList<String>();
//        printMe(list);
//        reverseMe(list2);
//        removeMe(list2,1,3);
//        public static void printMe(List<String> l){
//            for(String x:l){
//                System.out.println(x);
//            }
//        }
//        public static void removeMe(List<String> l,int from,int to){
//            l.subList(from,to).clear();
//        }
//        public static void reverseMe(List<String> l){
//            ListIterator<String> iter=l.listIterator(l.size());
//            System.out.println("last one "+iter.previous());
//            while(iter.hasPrevious()){
//                if(iter.hasPrevious())
//                    System.out.println(iter.previous());
//            }
//    }

}
}

