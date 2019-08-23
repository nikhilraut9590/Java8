package com.loop;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class LoopPerformanceTest {
	private static long startTime;
	private static long endTime;
	private static List<Integer> list = new ArrayList<Integer>();
	static {
		for (int i = 0; i < 100000; i++) {
			list.add(i);
		}
	}

	public static void main(String[] args) {
		LoopPerformanceTest test=new LoopPerformanceTest();
		//System.out.println(list);
		
		//type 1
		startTime=Calendar.getInstance().getTimeInMillis();
		for(long i:list) {
			//System.out.println();
		}
		endTime=Calendar.getInstance().getTimeInMillis();
		System.out.println(endTime-startTime+" : ms");
		
		//type 2
		startTime=Calendar.getInstance().getTimeInMillis();
		for(int i=0;i<list.size();i++) {
			//System.out.println();
		}
		endTime=Calendar.getInstance().getTimeInMillis();
		System.out.println(endTime-startTime+" : ms");
		
		//type 3
		
		startTime=Calendar.getInstance().getTimeInMillis();
		int size=list.size();
		for(int i=0;i<size;i++) {
			//System.out.println();
		}
		endTime=Calendar.getInstance().getTimeInMillis();
		System.out.println(endTime-startTime+" : ms");
		
		
	}
}
