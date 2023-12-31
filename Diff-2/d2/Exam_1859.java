package d2;

import java.util.*;
import java.io.*;

/**
25년 간의 수행 끝에 원재는 미래를 보는 능력을 갖게 되었다. 이 능력으로 원재는 사재기를 하려고 한다.

다만 당국의 감시가 심해 한 번에 많은 양을 사재기 할 수 없다.

다음과 같은 조건 하에서 사재기를 하여 최대한의 이득을 얻도록 도와주자.

    1. 원재는 연속된 N일 동안의 물건의 매매가를 예측하여 알고 있다.
    2. 당국의 감시망에 걸리지 않기 위해 하루에 최대 1만큼 구입할 수 있다.
    3. 판매는 얼마든지 할 수 있다.

예를 들어 3일 동안의 매매가가 1, 2, 3 이라면 처음 두 날에 원료를 구매하여 마지막 날에 팔면 3의 이익을 얻을 수 있다.


[입력]

첫 번째 줄에 테스트 케이스의 수 T가 주어진다.

각 테스트 케이스 별로 첫 줄에는 자연수 N(2 ≤ N ≤ 1,000,000)이 주어지고,

둘째 줄에는 각 날의 매매가를 나타내는 N개의 자연수들이 공백으로 구분되어 순서대로 주어진다.

각 날의 매매가는 10,000이하이다.


[출력]

각 테스트 케이스마다 ‘#x’(x는 테스트케이스 번호를 의미하며 1부터 시작한다)를 출력하고, 최대 이익을 출력한다.


[예제 풀이]

1번째 케이스는 아무 것도 사지 않는 것이 최대 이익이다.

2번째 케이스는 1,2일에 각각 한 개씩 사서 세 번째 날에 두 개를 팔면 10의 이익을 얻을 수 있다.

입력
3
3
10 7 6
3
3 5 9
5
1 1 3 1 2
input.txt

출력
#1 0
#2 10
#3 5
output.txt
 */

/** 값이 들어가는 모든 곳에 Long을 지정해야 한다!!  */
public class Exam_1859 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine().trim());
		
		for(int t = 1; t <= T; t++) {
			int len = Integer.parseInt(br.readLine());
			long[] price = new long[len];
			
			StringTokenizer st = new StringTokenizer(br.readLine().trim());
			int maxIndex = 0;
			for(int i = 0; i < len; i++) {
				price[i] = Long.parseLong(st.nextToken());
				maxIndex = price[maxIndex] <= price[i] ? i : maxIndex;
			}
			
			long temp = 0;
			long result = 0;
			int index = 0;
			
			for(int i = 0; i < price.length; i++) {
				if(i < maxIndex) {
					temp += price[i]; //최고점 이전에 구매할 대금을 계속 더한다. 
				} else if(i == maxIndex) {
					result += (i - index) * price[i] - temp; // 이익에서 구매한 대금을 뺀다.
					temp = 0; // 대금은 정산되었다. 
					index = i + 1; // 현재 i 인덱스는 최고점이므로, 다시 계산하지 않는다.
					maxIndex = index; // 처음 최고 인덱스를 계산했을 때 처럼, 초기 값으로 세팅한다. 
					
					// 그 다음 최고점 인덱스를 계산한다.
					for(int j = index; j < price.length; j++) 
						maxIndex = price[maxIndex] <= price[j] ? j : maxIndex;
					
				}
			}
			bw.write("#" + t + " " + result + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
