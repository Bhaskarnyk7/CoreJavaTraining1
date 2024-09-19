package com.evergent.corejava.collections;

import java.io.DataOutput;
import java.util.Comparator;
import java.util.PriorityQueue;

import javax.sound.midi.Soundbank;

public class QueueDemo1 {
	public static void main(String[] args) {
		PriorityQueue<Integer>k=new PriorityQueue<>(Comparator.reverseOrder());
//		k.add(10);
//		k.add(20);
//		k.add(5);
//		k.offer(30);
//		System.out.println(k.add(30));
		
		
		
//		System.out.println(k.peek());
//		System.out.println(k.poll());
//		System.out.println(k.poll());
//		System.out.println(k.remove()); // if queue is empty then it throw exception
		System.out.println(k);
		
	}

}
