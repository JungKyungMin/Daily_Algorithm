// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
package baekjoon1;
import java.util.*;

public class Baekjoon1_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        System.out.println(A+B);
        input.close();
    }
}
