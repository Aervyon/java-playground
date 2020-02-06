import java.util.ArrayList;
import java.util.Scanner;
import misc.MiscUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("- Time: " + MiscUtils.time() );

        Scanner scan = new Scanner(System.in);
        String[] answers = {"", "", "", ""};
        String[] missing = {"", "", "", ""};
        String[] questions = {"What is your name?", "What is your age?", "Have you heard of Gitlab?", "What about GitHub?"};
        String[] questionNames = {"Name", "Age", "GitLab", "GitHub"};
        for(int i = 0; i < questions.length; i++) {
            String ans = question(questions[i], scan);
            if (ans == "FAIL") {
                missing[i] = questionNames[i];
            } else {
                answers[i] = questionNames[i] + ":\t" + ans;
            }
        }
        for (int i = 0; i < questions.length; i++) {
            if (answers.length == i && answers[i].equalsIgnoreCase("") ) {
                answers[i] = answers[i+1];
                answers[i+1] = "";
            }
            if (missing.length == i && missing[i].equalsIgnoreCase("") ) {
                missing[i] = missing[i+1];
                missing[i+1] = "";
            }
        }
        ArrayList<String> missingList = MiscUtils.arrToListLinked(missing);
        ArrayList<String> answersList = MiscUtils.arrToListLinked(answers);
        String missingO = "--------------\nMissing answers (invalidated by user):\n==============\n" + String.join("\n", missingList);
        if (missingList.size() == 0) {
            missingO = "";
        }
        String ans = "--------------\nAnswer:\n==============\n" + String.join("\n", answersList);
        if (answersList.size() == 0) {
            ans = "";
        }
        System.out.println(missingO + "\n\n" + ans + "\n\n--------------\n- Time: " + MiscUtils.time() );
    }

    public static String question(String query, Scanner scan) {
        System.out.println("\n" + query);
        String ans = scan.nextLine();
        ans = ans.trim();
        System.out.println("\nJust to confirm, your answer is " + ans + "? (yes|no)");
        String confirm = scan.nextLine();

        if (confirm.equalsIgnoreCase("yes") ) {
            return ans;
        } else if(confirm.equalsIgnoreCase("no") ) {
            return "FAIL";
        } else {
            System.out.println("Ill just take that as a \"No\"");
        }
        return "FAIL";
    }
}