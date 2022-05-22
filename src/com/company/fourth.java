import java.util.Scanner;

public class fourth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a1 = String.valueOf((int) (Math.random() * 3 + 1));
        String a2 = String.valueOf((int) (Math.random() * 3 + 1));
        String a3 = String.valueOf((int) (Math.random() * 3 + 1));
        String s = a1+a2+a3;
        System.out.println(s);
        String str ;
        System.out.println("Введіть послідовність трьох випадково згенерованих цілих чисел : ");
        str = sc.nextLine();
        if (true == str.equalsIgnoreCase(s)){
            System.out.println("Ви виграли");
        }else if (false == str.equalsIgnoreCase(s)){
            System.out.println("У вас залишилася ще одна спроба");
            str = sc.nextLine();
            if (true == str.equalsIgnoreCase(s)){
                System.out.println("Ви виграли");
            }else {
                System.out.println("Ви програли");
            }
        }





    }
}