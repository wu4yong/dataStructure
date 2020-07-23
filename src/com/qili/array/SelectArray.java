package com.qili.array;

/**
 * ѡ������
 */
public class SelectArray {
	// ����
	private long[] arr;

	// ��������Ч���ݵĴ�С
	private int elems;

	// Ĭ�Ϲ��캯��
	public SelectArray() {
		arr = new long[50];
	}

	public SelectArray(int max) {
		arr = new long[max];
	}

	// ��������
	public void insert(long value) {
		arr[elems] = value;
		elems++;
	}

	// ��ʾ����
	public void display() {
		for (int i = 0; i < elems; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	// ѡ������
	public void selectSort(){
		int min = 0;
		long tmp = 0L;
		for(int i = 0; i < elems -1; i++){
			min = i;
			for(int j = i + 1; j < elems; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			tmp = arr[i];
			arr[i] = arr[min];
			arr[min] = tmp;
		}
	}

	public static void main(String[] args) {
		SelectArray sArr = new SelectArray();
		sArr.insert(89);
		sArr.insert(54);
		sArr.insert(667);
		sArr.insert(7);
		sArr.insert(12);
		sArr.insert(43);


		sArr.display();
		sArr.selectSort();
		sArr.display();

	}

}
