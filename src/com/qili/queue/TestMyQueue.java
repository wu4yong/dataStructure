package com.qili.queue;

public class TestMyQueue {

	public static void main(String[] args) {
		ch04.MyQueue mq = new ch04.MyQueue(5);
		System.out.println(mq.isEmpty());
		mq.insert(30);
		mq.insert(20);
		mq.insert(10);
		mq.insert(2);
		mq.insert(1);
		mq.insert(20);
		
		while(!mq.isEmpty()) {
			long tmp = mq.remove();
			System.out.println(tmp + " ");
		}
		
	}

}
