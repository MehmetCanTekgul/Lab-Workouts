import java.beans.PropertyEditorManager;

public class GCDLoop {

    public static void main(String[] args){

        if(args.length<2){
            System.out.println("Please provide two integers");
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int result = gcd(num1>num2 ? num1:num2, num1>num2 ? num2:num1);

        System.out.println("GCD of "+ num1  +" and "+num2+" = "+result);


    }

    private static int gcd(int num1,int num2) {

    int reminder;
    do{
        reminder = num1%num2;
        if(reminder!=0){
            num1=num2;
            num2=reminder;
        }
    }while (reminder!=0);

    return num2;
    }
}
