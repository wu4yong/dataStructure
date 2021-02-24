package qili.tree;

public class Node {
	// �ؼ���
	private int keyData;
	
	// ��������
	private int otherData;
	
	// ���ӽڵ�
	private Node leftNode;
	
	// ���ӽڵ�
	private Node rightNode;

	public Node(int keyData, int otherDate) {
		this.keyData = keyData;
		this.otherData = otherDate;
	}

	
	public int getKeyData() {
		return keyData;
	}


	public void setKeyData(int keyData) {
		this.keyData = keyData;
	}


	public Node getLeftNode() {
		return leftNode;
	}


	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}


	public int getOtherData() {
		return otherData;
	}


	public void setOtherData(int otherData) {
		this.otherData = otherData;
	}


	public Node getRightNode() {
		return rightNode;
	}


	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}


	// ��ʾ����
	public void display(){
		System.out.println(keyData + "," + otherData);
	}
	
	
}