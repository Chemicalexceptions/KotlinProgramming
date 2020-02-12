package Recursion;

public class Recur {

    private int a = 0;//2
    private int b = 1;//2
    public static void main(String[] args) {

        Recur e = new Recur();
        e.recur();


    }

     void recur(){

        System.out.println(a);
        for(int i = 0 ; i<5;i++){

           // System.out.println(a);//2

            int sum = b+a;
            System.out.println(sum);

            a = b;//1 2
            b=sum;//1+1

        }

    }
}
