class sum{
    public sum(){
        int a=7;
        int b=7;
        System.out.println(a+b);
    }
}
class multiply{
    public multiply(){
        int a=7;
        int b=7;
        System.out.println(a*b);
    }
}
class subtraction{
    public subtraction(){
        int a=7;
        int b=9;
        System.out.println(b-a);
    }
}

public class Main {
    public static void main(String[] args) {
        sum obj=new sum();
        multiply ob=new multiply();
    }
}