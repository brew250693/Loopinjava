import java.util.Scanner;

public class findFigure {
    public static void main(String[] args){
        System.out.println("1: rectangle");
        System.out.println("2: tamgiac1");
        System.out.println("3: tamgiac2");
        System.out.println("4: tamgiac3");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num){
            case 1:
                for (int i=0;i<3;i++){
                    for(int j=0;j<7;j++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            case 2:
                for (int i =0;i<5;i++){
                    for(int j =0;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            case 3:
                for(int i=5;i>=1;i--){
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            case 4:
                for(int i=5;i>=1;i--){
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }



        }
    }
}