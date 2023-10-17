public class conditionalStatements {
    public static int a=10;
    public static int b=20;
    public static int c=30;
    public static void main(String[] args) {

        if(a>b && a>c){
            System.out.println(a+" is greater");
        }
        else if(b>a && b>c){
            System.out.println(b+ " is greater");

        }
        else{
            System.out.println(c+" is greater");
        }
        
    }
    
}
