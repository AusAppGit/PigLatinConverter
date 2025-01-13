import java.util.Scanner;

public class PigLatinConverter
  {
        public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          // take in string and split each word into an array item
          String [] sentence = sc.nextLine().split(" ");
          
          // iterate through the sentence array, take the first letter as substring, combine it with "ay "
          for(String s: sentence){
              String pig = s.substring(1);
              System.out.print(pig + s.substring(0,1) + "ay ");
              }
          sc.close();
      }
    }
