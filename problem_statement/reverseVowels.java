import java.util.*;
public class reverseVowels
{
public static void main(String[] args)
{
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        int i = 0;
        int j = c.length - 1;
        while (i < j)
        {
            if (isVowel(c[i]) && isVowel(c[j]))
            {
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;
            }
            else if (isVowel(c[i]))
            {
                j--;
            }
            else if (isVowel(c[j]))
            {
                i++;
            }
            else
            {
                i++;
                j--;
            }
        }
        System.out.println(String.valueOf(c));
    }
    public static boolean isVowel(char c)
    {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
