package qili.array;

/**
 * 对象排序
 */
public class StudentArray {
	// 数组
	private Student[] arr;

	// 数组中有效数据的大小
	private int elems;

	// 默认构造函数
	public StudentArray() {
		arr = new Student[50];
	}

	public StudentArray(int max) {
		arr = new Student[max];
	}

	// 插入数据
	public void insert(Student stu) {
		arr[elems] = stu;
		elems++;
	}

	// 显示数据
	public void display() {
		for (int i = 0; i < elems; i++) {
			arr[i].display();
		}
	}

	// 按照学号进行排序
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

	// 按照学生姓名进行排序
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
		Student stu1 = new Student(509302,"d张三","男",20);
		Student stu2 = new Student(509301,"c李四","男",21);
		Student stu3 = new Student(609302,"a王五","女",22);
		Student stu4 = new Student(509402,"b赵六","男",23);

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
