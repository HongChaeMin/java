package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		//������������ �Ϲݺ����� ������
		// �Ϲݺ����� null�� �ʱ�ȭ ���� x
		
		int a = 0;
		int[] arr = null;
		//a = null; error - �Ϲݺ����̱⶧����
		System.out.println(arr);
		//�迭�� �ε����� 0������ ����
		//�迭�� ũ�Ⱑ 5�̸��� �ε����� 4����
		arr = new int[] {10,15,20,0,0};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		//System.out.println(arr[5]);//index out - error
		
		int[] arr1 = new int[5]; // 0 1 2 3 4 index
		arr1[0] = 10;
		arr1[1] = 15;
		arr1[2] = 20;
		
		System.out.println(arr.length);//�迭�� ������ �����ִ� ���
		//0~4���� �ݺ�
		for(int i=0;i<arr1.length;i++) {//i�� index�̱� ������ 0~4
			System.out.println("arr["+i+"] ="+arr1[i]);
		}
		for(int i=0;i<arr.length;i++) {//i�� index�̱� ������ 0~4
			System.out.println("arr["+i+"] ="+arr[i]);
		}

	}

}
