package gradeBook;


public class GradeAndProjects{


    int finalG1 = 100;
    int finalG2 = 90;
    int finalG3 = 75;
    int finalG4 = 0;

    public static void main(String[] args)  {
        GradeAndProjects grade = new GradeAndProjects();
        int numProj = Integer.parseInt(args[0]);
        grade.finalGrade(numProj);
    }


    public int finalGrade(int numProj){  
        try{

            if(numProj >= 10){
                System.out.println("Final Grade: " + finalG1);
            }
            else if(numProj >= 5){
               System.out.println("Final Grade: " + finalG2);
           }
           else if(numProj >= 2){
               System.out.println("Final Grade: " + finalG3);
           }
           else 
               System.out.println("Your final grade is 0");
               

        }catch(Exception ex){
            System.out.println("Please enter correct number format!");
        }
        return numProj;
    }
}