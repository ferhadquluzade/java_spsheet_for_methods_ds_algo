package com.company;

import java.text.CollationElementIterator;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("as");
        List<String> list2=new ArrayList<>();
        list2.add("asd");
        ///String methods
        //startsWith
        //endsWith
        //substring
//        String s="buckyrobertsbuckyroberts";
//        System.out.println(s.indexOf("rob",10));

        //concatenation
//        String a = "Bacon";
//        String b = "moster";
//        System.out.println(a.concat(b));
        //replace
//        System.out.println(a.replace('B', 'F'));
        //toUpperCase
//        System.out.println(b.toUpperCase());//turns every letter
        //trim
        // deletes blank spaces
//        String b2 = "     monster    ";
//        System.out.println(b2.trim());
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
//        List<String> list2=new LinkedList<String>();
//        list2.add("asdf");
//        list2.add("hi muy brother");
//        list2.add("hihhihahahihahah");
//        list2.add("asdef");
//        list2.add("asddf");
//        List list=new LinkedList<String>();
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
        //listToArray
//         String[]  things=["babies","melons","watermelon"];
//         LinkedList<String> theList=new LinkedList<String>(Arrays.asList(things));
//         theList.add("thinfg");//adds to the last
//         theList.addFirst("Firstelement");//this is a list element not an array one and adds to the starts
////convert back to an array
//        things=theList.toArray(new String[theList.size()]);

        //Sorting
//        String[] thing={"appke","spa","hp"};
//List<String> list1=Arrays.asList(thing);
//Collections.sort(list1);
//        System.out.println(list1);
//Collections.sort(list1,Collections.reverseOrder());
        //copy,reverse,fill
//        String[] arg={"sdf","sdf"};
//        List<String> list=Arrays.asList(arg);
//        Collections.reverse(list);
//        System.out.println(list);
//        Collections.fill(list,"X");//it works like replace but replaces all elements with X in this case
        //addAll method
//        String[] stuff={"apples","beef","bacon"};
//        List<String> list3=Arrays.asList(stuff);
//        ArrayList<String> arr_list=new ArrayList<String>();
//        arr_list.add("youtube");
//        arr_list.add("google");
//        for(String x:arr_list)
//            System.out.println(x);
//         Collections.addAll(arr_list,stuff);
//        System.out.println("after adding");
//        for (String a2 : arr_list)
//            System.out.println(a2);
        //frequency
        //returns number of an elememt in a collection
//        ArrayList<String> arr=new ArrayList<String>();
//        Collections.addAll(arr,"as","ad");
//        System.out.println(Collections.frequency(arr,"as"));
        //disjoint

        //checks if there is not a joint thing between lists.
//                System.out.println(Collections.disjoint(list,list2));
        //Stack
//         Stack<String> stck=new Stack<String>();
//    stck.push("str");
//    stck.pop();
//        System.out.println(stck);
        //Priority Queue
//        PriorityQueue<String> q=new PriorityQueue<>();
//        q.offer("first");
//        q.offer("second");
//        q.offer("third");
//        System.out.println(q);
//        System.out.println(q.peek());
//        q.poll();
//        System.out.println(q);
        //Set
//String[] things={"appe","bob","bob","appe"};
//List<String> list3=Arrays.asList(things);
//Set<String> set=new HashSet<String>(list3);
//        System.out.println(set);
        //Generics
//        Integer[] iray={1,2,3,4};
//        Character[] cray={'a','b'};
//        printMe(iray);
//        printMe(cray);
//////////////////////////////
//        System.out.println(max(15,34,66));
//        System.out.println(max("str","string","String"));
////        public static <T> void printMe(T[] x){
////            for(T b:x)
////                System.out.print(b);
////            System.out.println("");
////        }
//        public static <T extends Comparable<T>> T max (T a,T b,T c){
//            T m=a;
//            if(b.compareTo(a)>0)
//                m=a;
//            if(c.compareTo(b)>0)
//                m=c;
//            return m;
//        }
        //https://www.codewars.com/kata/51675d17e0c1bed195000001/solutions
        Collections.max();//gives the maximum number

    }

}

