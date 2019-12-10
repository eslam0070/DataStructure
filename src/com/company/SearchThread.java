package com.company;

import java.util.ArrayList;

public class SearchThread extends Thread{

    private int start,end,v;
    private ArrayList<Integer> data;
    private String threadName;
    private static boolean isFound = false;

    public SearchThread(int start, int end, int v, ArrayList<Integer> data, String threadName) {
        this.start = start;
        this.end = end;
        this.v = v;
        this.data = data;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        super.run();
        for (int i=start;i<end;i++){
            if (isFound){
                System.out.println(threadName + " has stop service");
                return;
            }
            if (data.get(i)==v) {
                isFound = true;
                System.out.println(threadName+" has found value "+i);
                return;
            }
        }
        System.out.println(threadName +" has finished");
    }
}
