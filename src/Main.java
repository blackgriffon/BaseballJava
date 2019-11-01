import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1. 정답을 생성한다.
        Random random = new Random(0);

        ArrayList<Integer> answers = new ArrayList<>();

        while (true) {
            for (int i = 0; i < Constant.DIGIT; i++) {
                answers.add(random.nextInt(Constant.MAX_NUMBER));
            }

        //TODO : 자릿수에 무관하게 구현하여야 함함
        if(answers.get(0)== answers.get(1) || answers.get(1)== answers.get(2)  || answers.get(2)== answers.get(0) )
            continue;

        break;
    }

    // live template
        System.out.println("[정답]");
        for (int answer : answers
             ) {
            System.out.print(answer + " ");
        }

        System.out.println();


    int tryCount = 0;

        while (true) {
        tryCount++;

        // 2. 추측을 입력받는다.
            ArrayList<Integer> guesses = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < Constant.DIGIT; i++) {
                guesses.add(scanner.nextInt()); // parsing
            }


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
        if (strike == Constant.DIGIT)
            break;
    }


    // 6. 도전횟수를 출력한다.
        System.out.println(String.format("Count : %d", tryCount));
}
}