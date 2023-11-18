package d1;

import java.util.*;
import java.io.*;

/**
주어진 숫자만큼 # 을 출력해보세요.

주어질 숫자는 100,000 이하다.

입력
3
input.txt
출력
###
output.txt
 */

public class Exam_2046 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine().trim());
		
		for(int i = 0; i < n; i++)
			bw.write("#");
		
		bw.flush();
		bw.close();
		br.close();
	}

}
