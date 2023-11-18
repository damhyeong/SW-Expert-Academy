package d2;

import java.util.*;
import java.io.*;

/**
패턴에서 반복되는 부분을 마디라고 부른다. 문자열을 입력 받아 마디의 길이를 출력하는 프로그램을 작성하라.


[제약 사항]

각 문자열의 길이는 30이다. 마디의 최대 길이는 10이다.


[입력]

가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.

각 테스트 케이스의 첫 번째 줄에는 길이가 30인 문자열이 주어진다.


[출력]

출력의 각 줄은 '#t'로 시작하고, 공백을 한 칸 둔 다음 정답을 출력한다.

(t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)
 

입력
3       
KOREAKOREAKOREAKOREAKOREAKOREA
SAMSUNGSAMSUNGSAMSUNGSAMSUNGSA
GALAXYGALAXYGALAXYGALAXYGALAXY     
 
input.txt
출력
#1 5
#2 7
#3 6
 
output.txt
 */

public class Exam_2007 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine().trim());
		
		for(int i = 1; i <= T; i++) {
			String str = br.readLine().trim();
			int l = 0;
			
			for(int len = 1; len < str.length(); len++) {
				String subStr1 = str.substring(0, len);
				String subStr2 = str.substring(len, len * 2);
				if(subStr1.equals(subStr2)) {
					l = len;
					break;
				}
			}
			bw.write("#" + i + " " + l + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
