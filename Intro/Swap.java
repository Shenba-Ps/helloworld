class Swap{
    public static void main(String[] args) {
        int a=99;
        int b=90;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}