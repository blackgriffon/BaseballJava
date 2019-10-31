import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 변수, 객체(개체), 오브젝트, 인스턴스
        // 클래스
        // (멤버)필드 == 변수
        // 메서드 == 함수

        // Application Programming Interface
        // Software Development Kit
        // Library vs. Framework

        // 1. 정답을 생성한다.
        Random random = new Random(0);

        int answer0;
        int answer1;
        int answer2;

        while (true) {
            answer0 = random.nextInt(10);
            answer1 = random.nextInt(10);
            answer2 = random.nextInt(10);

            if (answer0 == answer1 || answer1 == answer2 || answer2 == answer0)
                continue;

            break;
        }

        // live template
        System.out.println("[정답]");
        System.out.print(answer0 + " ");
        System.out.print(answer1 + " ");
        System.out.print(answer2 + " ");
        System.out.println();


        int tryCount = 0;

        while (true) {
            tryCount++;

            // 2. 추측을 입력받는다.
            int guess0;
            int guess1;
            int guess2;

            Scanner scanner = new Scanner(System.in);
            guess0 = scanner.nextInt(); // parsing
            guess1 = scanner.nextInt(); // parsing
            guess2 = scanner.nextInt(); // parsing

            System.out.println("[추측]");
            System.out.print(guess0 + " ");
            System.out.print(guess1 + " ");
            System.out.print(guess2 + " ");
            System.out.println();


            // 3. 결과를 계산한다.
            int strike = 0;
            int ball = 0;
            int out = 0;

            if (answer0 == guess0)
                strike++;
            else if (answer0 == guess1 || answer0 == guess2)
                ball++;
            else
                out++;

            if (answer1 == guess1)
                strike++;
            else if (answer1 == guess2 || answer1 == guess0)
                ball++;
            else
                out++;

            if (answer2 == guess2)
                strike++;
            else if (answer2 == guess0 || answer2 == guess1)
                ball++;
            else
                out++;


            // 4. 결과를 출력한다.
            System.out.println(String.format("S:%d B:%d O:%d", strike, ball, out));


            // 5. 3S 아니면 2번으로 돌아간다.
            if (strike == 3)
                break;
        }


        // 6. 도전횟수를 출력한다.
        System.out.println(String.format("Count : %d", tryCount));
    }
}
