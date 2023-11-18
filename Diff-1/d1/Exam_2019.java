package d1;

import java.util.*;
import java.io.*;

/**
1부터 주어진 횟수까지 2를 곱한 값(들)을 출력하시오.

주어질 숫자는 30을 넘지 않는다.

입력
8
input.txt

출력
1 2 4 8 16 32 64 128 256
output.txt
 */

public class Exam_2019 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine().trim());
		
		long result = 1;
		
		for(int i = 1; i <= N + 1; i++) {
			bw.write(Long.toString(result) + " ");
			result *= 2;
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
