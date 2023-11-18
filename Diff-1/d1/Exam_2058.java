package d1;

import java.util.*;
import java.io.*;

/**
하나의 자연수를 입력 받아 각 자릿수의 합을 계산하는 프로그램을 작성하라.


[제약 사항]

자연수 N은 1부터 9999까지의 자연수이다. (1 ≤ N ≤ 9999)


[입력]

입력으로 자연수 N이 주어진다.


[출력]

각 자릿수의 합을 출력한다.

입력
6789
input.txt
출력
30
output.txt
 */

public class Exam_2058 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int result = 0;
		while(N != 0) {
			result += N % 10;
			N /= 10;
		}
		bw.write(Integer.toString(result));
		bw.close();
		br.close();
	}

}
