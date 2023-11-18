package d1;

import java.util.*;
import java.io.*;

/**
A와 B가 가위바위보를 하였다.

가위는 1, 바위는 2, 보는 3으로 표현되며 A와 B가 무엇을 냈는지 입력으로 주어진다.

A와 B중에 누가 이겼는지 판별해보자. 단, 비기는 경우는 없다.

[입력]
입력으로 A와 B가 무엇을 냈는지 빈 칸을 사이로 주어진다.

[출력]
A가 이기면 A, B가 이기면 B를 출력한다.

입력
3 2
input.txt
출력
A
output.txt
 */

public class Exam_1936 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		
		if(transNum(n1 - 1) == n2)
			bw.write("A");
		else if(transNum(n2 - 1) == n1)
			bw.write("B");
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int transNum(int num) {
		if(num < 1)
			return 3;
		else if(num > 3)
			return 1;
		else
			return num;
	}
}
