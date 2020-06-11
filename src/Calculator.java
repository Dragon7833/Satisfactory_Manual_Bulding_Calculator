import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) { //Main function good to add the scanner just in case
        Scanner sin = new Scanner(System.in);
        int nOutput, ntOutput, nNum1, nNum2, nNum3, nNum4, ntNum1, ntNum2, ntNum3, ntNum4, nAnswer;
        System.out.println("Hi there how many multiples are you trying to make");
        nOutput = sin.nextInt();
        System.out.println("how many multiples does it make");
        ntOutput = sin.nextInt();
        System.out.println("How many different ingredients are used:");
        nAnswer = sin.nextInt();
        if (nAnswer == 1) {
            System.out.println("How many of the item is needed to craft it");
            nNum1 = sin.nextInt();
            ntNum1 = (nOutput * nNum1)/ntOutput;
            System.out.println(ntNum1);
        }
        if (nAnswer == 2) {
            System.out.println("How many of the first item is needed to craft it");
            nNum1 = sin.nextInt();
            System.out.println("How many of the second item is needed to craft it");
            nNum2 = sin.nextInt();
            ntNum1 = (nOutput * nNum1)/ntOutput;
            ntNum2 = (nOutput * nNum2)/ntOutput;
            System.out.println(ntNum1);
            System.out.println(ntNum2);
        }
        if (nAnswer == 3) {
            System.out.println("How many of the first item is needed to craft it");
            nNum1 = sin.nextInt();
            System.out.println("How many of the second item is needed to craft it");
            nNum2 = sin.nextInt();
            System.out.println("How many of the third item is needed to craft it");
            nNum3 = sin.nextInt();
            ntNum1 = (nOutput * nNum1)/ntOutput;
            ntNum2 = (nOutput * nNum2)/ntOutput;
            ntNum3 = (nOutput * nNum3)/ntOutput;
            System.out.println(ntNum1);
            System.out.println(ntNum2);
            System.out.println(ntNum3);
        }
        if (nAnswer == 4) {
            System.out.println("How many of the first item is needed to craft it");
            nNum1 = sin.nextInt();
            System.out.println("How many of the second item is needed to craft it");
            nNum2 = sin.nextInt();
            System.out.println("How many of the third item is needed to craft it");
            nNum3 = sin.nextInt();
            System.out.println("How many of the fourth item is needed to craft it");
            nNum4 = sin.nextInt();
            ntNum1 = (nOutput * nNum1)/ntOutput;
            ntNum2 = (nOutput * nNum2)/ntOutput;
            ntNum3 = (nOutput * nNum3)/ntOutput;
            ntNum4 = (nOutput * nNum4)/ntOutput;
            System.out.println(ntNum1);
            System.out.println(ntNum2);
            System.out.println(ntNum3);
            System.out.println(ntNum4);
        }
    }
}
