package qili.array;

/**
 * ��������
 */
public class InsertArray {
	// ����
	private long[] arr;

	// ��������Ч���ݵĴ�С
	private int elems;

	// Ĭ�Ϲ��캯��
	public InsertArray() {
		arr = new long[50];
	}

	public InsertArray(int max) {
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
	
	// ��������
	public void insertSort() {
		long select = 0L;
		for(int i = 1; i < elems; i++) {
			select = arr[i];
			int j = 0;
			for(j = i;j > 0 && arr[j - 1] >= select; j--) {
				arr[j] = arr[j - 1];
			}
			arr[j] = select;
		}
	}

	public static void main(String[] args) {
		InsertArray iArr = new InsertArray();
		iArr.insert(85);
		iArr.insert(7856);
		iArr.insert(12);
		iArr.insert(8);
		iArr.insert(5);
		iArr.insert(56);

		iArr.display();
		iArr.insertSort();
		iArr.display();
	}
}
