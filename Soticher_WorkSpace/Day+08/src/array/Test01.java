package array;

public class Test01 {

	public static void main(String[] args) {
		
		//����������
		//++ , --
		//	��ġ		 ��ġ
		//	++a		a++
		//��ġ : ++a�� ǥ���ϸ� a=a+1�� ���� ó���Ѵ�
		//��ġ : a++�� ǥ���ϰ� a�� �����͸� ����� �Ŀ� a=a+1
		int a = 0;
		System.out.println(++a);
		a = 0;
		System.out.println(a++);
		System.out.println(a);
		
		int num1 = 12;
		int num2 = 12;
		System.out.println(++num1); // 1.12 + 1 2.����
		System.out.println("num1 :"+num1); //13
		
		System.out.println(num2++); // 1.���� 2.12+1
		System.out.println("num2 :"+num2);//13
		
		num1 = 12;
		System.out.println(num1+=1);// ���ϱ� ���� ����
		System.out.println(num1);//����� �Ҷ� ���������ڸ� ����Ͻǲ��� ��ġ
		num2 = 12;
		System.out.println(num2=+1);// ���� ���� ���ϱ�
		System.out.println(num2); 
		//1�� ���ϱ⸸ �Ͻǲ����� ��ġ�� ����ϼż� a++;

	}

}
