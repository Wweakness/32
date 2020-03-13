import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String[] a=str.split(" ");
       /* int length=Integer.parseInt(a[0]);
        int[] b=new int[length-1];
        for(int i=0;i<length-1;i++){
            b[i]=Integer.parseInt(a[i+1]);
        }

        */
        StringBuilder p=new StringBuilder();


        p.append("9");
        p=null;
        p.append("030");
        System.out.println(p.toString());

    }
}
