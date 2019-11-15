import java.util.ArrayList;
import java.util.Scanner;

public class Test_ES
{
    public static void main(String[] agrs)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите строку ");
        String str = input.nextLine();
        char[] mas_str = str.toCharArray();
        String[] mas = new String[mas_str.length];
        for (int i = 0; i < mas.length; i++)
        {
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            mas[i] = input.nextLine();
        }
        ArrayList<String> fin = new ArrayList<>();
        for (int i1 = 0; i1 < mas.length; i1++)
        {
            if ( mas_str[i1] == '0')
            {
                fin.add(mas[i1]);
            }
        }
        System.out.print(fin);
    }
}
