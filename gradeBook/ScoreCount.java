package gradeBook;
public class ScoreCount{



  public static void main(String[] args){
  ScoreCount grade = new ScoreCount();
  int score = Integer.parseInt(args[2]);

  grade.findScore(score);
}

public int findScore(int scr1){

 if(90 <= scr1 && scr1 <= 100){
   System.out.println("A");
  }

  else if(80 <= scr1 && scr1 < 90){
    System.out.println("B");
  }
  else if(70 <= scr1 && scr1 < 80){
    System.out.println("C");
  }
  else if(60 <= scr1 && scr1 < 70){
    System.out.println("D");
  }
  else if(0 <= scr1 && scr1 < 60){
    System.out.println("F");
  }
  return scr1;
 }
 
}