package d1;

import java.util.*;
import java.io.*;

/**
10개의 수를 입력 받아, 그 중에서 가장 큰 수를 출력하는 프로그램을 작성하라.


[제약 사항]

각 수는 0 이상 10000 이하의 정수이다.


[입력]

가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.

각 테스트 케이스의 첫 번째 줄에는 10개의 수가 주어진다.


[출력]

출력의 각 줄은 '#t'로 시작하고, 공백을 한 칸 둔 다음 정답을 출력한다.

(t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)

입력
3 
3 17 1 39 8 41 2 32 99 2
22 8 5 123 7 2 63 7 3 46
6 63 2 3 58 76 21 33 8 1   
 
input.txt
출력
#1 99
#2 123
#3 76
output.txt
 */

public class Exam_2068 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine().trim());
		
		for(int i = 1; i <= T; i++) {
			int max = -1;
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			while(st.hasMoreTokens()) {
				int newNum = Integer.parseInt(st.nextToken());
				max = (max <= newNum) ? newNum : max;
			}
			bw.write("#" + i + " " + max + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
