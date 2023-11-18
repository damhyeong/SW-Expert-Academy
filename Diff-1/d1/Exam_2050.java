package d1;

import java.util.*;
import java.io.*;

/**
알파벳으로 이루어진 문자열을 입력 받아 각 알파벳을 1부터 26까지의 숫자로 변환하여 출력하라.


[제약 사항]

문자열의 최대 길이는 200이다.


[입력]

알파벳으로 이루어진 문자열이 주어진다.


[출력]

각 알파벳을 숫자로 변환한 결과값을 빈 칸을 두고 출력한다.
 

입력
ABCDEFGHIJKLMNOPQRSTUVWXYZ
input.txt
출력
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26
output.txt
 */

public class Exam_2050 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String chStr = br.readLine().trim();
		
		for(int i = 0; i < chStr.length(); i++) {
			char ch = chStr.charAt(i);
			if(ch >= 'a' && ch <= 'z')
				bw.write((ch - 'a' + 1) + " ");
			else if(ch >= 'A' && ch <= 'Z')
				bw.write((ch - 'A' + 1) + " ");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
