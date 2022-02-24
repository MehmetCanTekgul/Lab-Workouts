public class FindGrade {
    public static void main (String [] args){
        int score =Integer.parseInt(args[0]);
        if (score<0|| score>100){
            System.out.println("Invalid Score");
        }
        else if (score>=90){
            System.out.println("Your Grade Is A");
        }else if (score>=80){
            System.out.println("Your Grade Is B");
        }else if (score>=70){
            System.out.println("Your Grade Is C");
        }else if (score>=60){
            System.out.println("Your Grade Is D");
        }else{
            System.out.println("Your Grade Is F");
        }
    }
}
