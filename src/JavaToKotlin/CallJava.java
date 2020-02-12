package JavaToKotlin;

//caling kotlin function form java
public class CallJava {

    public static void main(String[] args) {

        System.out.println("from_java-> "+MyCustomKotlinFile.add(3,4));

    }

    public static int getArea(int a , int b){

        return a*b;

    }



}
