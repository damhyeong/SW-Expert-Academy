package d1;

import java.util.*;
import java.io.*;

/**
1부터 주어진 숫자만큼 모두 더한 값을 출력하시오.

단, 주어질 숫자는 10000을 넘지 않는다.


[예제]

주어진 숫자가 10 일 경우 출력해야 할 정답은,

1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
 

입력
10
input.txt
출력
55
output.txt
 */

public class Exam_2025 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		long sum = 0;
		
		for(int i = 1; i <= num; i++)
			sum += i;
		
		bw.write(Long.toString(sum));
		bw.flush();
		bw.close();
		br.close();
	}

}
