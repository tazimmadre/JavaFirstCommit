package com.company;

import java.util.*;

public class Main {
    static class code  {
        private final int serialNo;
        private final String serialID;

        public code(int serialNo, String serialID) {
            this.serialNo = serialNo;
            this.serialID = serialID;
        }

        public int getSerialNo() {
            return serialNo;
        }

        public String getSerialID() {
            return serialID;
        }

        @Override
        public String toString() {
            return "code{" +
                    "serialNo=" + serialNo +
                    ", SerialID='" + serialID + '\'' +
                    '}';
        }
        static class SortbyString implements Comparator<code>{
            @Override
            public int compare(code o1, code o2) {
                return o1.serialID.compareTo(o2.serialID);

            }
        }

    }
    public static void main(String[] args) {
	    code c1=new code(1,"A0");
	    TreeSet codeSet=new TreeSet<code>(new code.SortbyString());

        codeSet.add(c1);
        codeSet.add(new code(2,"B0"));
        codeSet.add(new code(6,"C0"));
        codeSet.add(new code(3,"F0"));
        codeSet.add(new code(4,"E0"));
        codeSet.add(new code(5,"D0"));

//        for (Object set:codeSet) {
////            System.out.println(set.getSerialID()+  " , " + set.getSerialNo());
//            System.out.println(set.getSerialID() + set.getSerialNo());
//        }
        Iterator<code> iterator =codeSet.iterator();
        System.out.println("Treee Set Data");
        try {
            while (iterator.hasNext()) {
                System.out.println(iterator.next()+",");

            }
            System.out.println("Out of While LOOP");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
