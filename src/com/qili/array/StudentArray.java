package com.qili.array;

/**
 * ��������
 */
public class StudentArray {
	// ����
	private Student[] arr;

	// ��������Ч���ݵĴ�С
	private int elems;

	// Ĭ�Ϲ��캯��
	public StudentArray() {
		arr = new Student[50];
	}

	public StudentArray(int max) {
		arr = new Student[max];
	}

	// ��������
	public void insert(Student stu) {
		arr[elems] = stu;
		elems++;
	}

	// ��ʾ����
	public void display() {
		for (int i = 0; i < elems; i++) {
			arr[i].display();
		}
	}

	// ����ѧ�Ž�������
	public void sortByNo() {
		int min = 0;
		Student tmp = null;
		for (int i = 0; i < elems - 1; i++) {
			min = i;
			for (int j = i + 1; j < elems; j++) {
				if (arr[j].getStuNo() < arr[min].getStuNo()) {
					min = j;
				}
			}
			tmp = arr[i];
			arr[i] = arr[min];
			arr[min] = tmp;
		}
	}

	// ����ѧ��������������
	public void sortByName() {
		int min = 0;
		Student tmp = null;
		for (int i = 0; i < elems - 1; i++) {
			min = i;
			for (int j = i + 1; j < elems; j++) {
				if (arr[j].getName().compareTo(arr[min].getName()) < 0) {
					min = j;
				}
			}
			tmp = arr[i];
			arr[i] = arr[min];
			arr[min] = tmp;
		}
	}

	public static void main(String[] args) {
		StudentArray sArr = new StudentArray();
		Student stu1 = new Student(509302,"d����","��",20);
		Student stu2 = new Student(509301,"c����","��",21);
		Student stu3 = new Student(609302,"a����","Ů",22);
		Student stu4 = new Student(509402,"b����","��",23);

		sArr.insert(stu1);
		sArr.insert(stu2);
		sArr.insert(stu3);
		sArr.insert(stu4);

		sArr.display();
		System.out.println("-------------------------");
		sArr.sortByName();
		sArr.display();
	}
}
