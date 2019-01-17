package stream;

import java.util.Arrays;

public class InArrayTest {

	// 스트림 예제가 너무 어려운 것 같아서 하나 입력을 하자면,
	// sList.steam().filter(s->s.length() >=5).forEach(s->System.out.println(s));
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		int sumVal = Arrays.stream(arr).sum(); // stream 사용하여 sum
		int count = (int) Arrays.stream(arr).count(); // stream 사용하여 count 
		
		System.out.println(sumVal);
		System.out.println(count);
		
		//System.out.println(Arrays.stream(arr).reduce(0, (a,b)->a+b));
		
	}
}