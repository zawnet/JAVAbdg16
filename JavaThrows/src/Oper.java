import javax.swing.*;
import java.util.StringTokenizer;

public class Oper {
    public static void main(String[] args) {
        String normalQuest = "Liczba2 op Liczba2",
                errorQuest = "Wadliwe dane. Jeszcze raz.\n",
                quest = normalQuest;
        String expr;
        int num1 = 0, num2 = 0;
        double res = 0.0d;

        while ((expr = JOptionPane.showInputDialog(quest)) != null){
            StringTokenizer  st  = new StringTokenizer(expr);
            if(st.countTokens() != 3){
                quest = errorQuest;
                continue;
            }
            String snum1    = st.nextToken(),
                   sop      = st.nextToken(),
                   snum2    = st.nextToken();

            try {
                num1 = Integer.parseInt(snum1);
                num2 = Integer.parseInt(snum2);
            }
            catch (NumberFormatException exc){
                quest = errorQuest;
                continue;
            }
            char op = sop.charAt(0);
            switch (op){
                case '+':
                    res = num1+num2;
                    break;
                case '-':
                    res = num1-num2;
                    break;
                case '*':
                    res = num1*num2;
                    break;
                case '/':
                    res = (double) num1/num2;
                    break;
                default:
                    quest = errorQuest;
                    continue;
            }
            JOptionPane.showMessageDialog(null,"Wynik = "+res);
            quest = normalQuest;

        }
    }
}
