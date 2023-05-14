import java.util.Scanner;
public class cifttoplam {
    
public static void main(String[] args) {
    int sum=0;
    int i;
    Scanner inp=new Scanner(System.in);
   
    do {
        System.out.println("Lütfen sayıları girin :");
        i=inp.nextInt();
        if(i%4==0){
            sum+=i;

        }

    }
    while(i%2!=1);
    System.out.println("Toplam :"+sum);
}
}