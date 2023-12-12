import java.util.Scanner;
import java.util.Random;
public class MainClass {
    
    public static void main(String args[]){
    Random random=new Random();
    Scanner sc=new Scanner(System.in);
    
    char ch;
    do{
    
    System.out.print("How many times you want to run the looping ::");
    int loop=sc.nextInt();
    System.out.println("*** Random Number Genration ***");
    System.out.println("Addition");
     System.out.println("======================================================");
    
    int digit1;
    int digit2;
    int userAnswer;
    int maxLoop=loop;
    int score=0;
    int percentage;
    int correctAnswer;
    String question=" ";
    String responds="";
    
    for(int counter=1;counter<=maxLoop;counter++){
        
        digit1=random.nextInt(100);
        digit2=random.nextInt(100);
        
        question=counter+". How much is :"+digit1 +"+"+digit2+"=";
        correctAnswer=digit1+digit2;
        
        System.out.print(question);
        userAnswer=sc.nextInt();
        
        if(userAnswer==correctAnswer){
            switch(random.nextInt(4)+1){
                case 1: responds="  --->Perfect";break;
                case 2: responds="  --->correct";break;
                case 3: responds="  --->Right";break;
                case 4: responds="  --->GoodJob";break;
                
               }
            score++;
        }else{
            switch(random.nextInt(4)+1){
                case 1: responds="  --->Wrong";break;
                case 2: responds="  --->Incorrect";break;
                case 3: responds="  --->Not Right";break;
                case 4: responds="  --->Mistaken";break;
               }
        }
        System.out.println(responds);
    }
    
    System.out.println("======================================================");
    System.out.print("your Score is :"+ score +"/"+maxLoop+"=");
    System.out.println((percentage=(int) ((double)score/maxLoop*100))+"%");
    System.out.println("======================================================");
    System.out.println("Do you want to contine \'Y'/N\'");
    
    ch=sc.next().charAt(0);
    }while(ch=='y');
    
    
    }
}
