
import java.util.Scanner;

public class QuestionServices {
    Questions[] questions = new Questions[5];
    String selection [] = new String[5];
  public QuestionServices(){
      questions[0] = new Questions(1,"Which of the following planets is known for having a prominent ring system?","Mars","Jupiter","Saturn","Neptune","Saturn"); 
      questions[1] = new Questions(2,"What is the chemical symbol for the element Gold?","Au","Ag","Pb","Fe","Au"); 
      questions[2] = new Questions(3,"Who wrote the play \"Romeo and Juliet\"?","William Shakespeare","Charles Dickens","Jane Austen","Mark Twain","William Shakespeare"); 
      questions[3] = new Questions(4,"What is the largest ocean on Earth?","Atlantic Ocean","Indian Ocean","Arctic Ocean","Pacific Ocean","Pacific Ocean"); 
      questions[4] = new Questions(5,"Which of these elements is a noble gas?","Oxygen","Argon","Nitrogen","Hydrogen","Argon"); 
    

  }

  
  public void playQuiz(){

            int i = 0;
      
        for(Questions q : questions){

            System.out.println("Questio no. : "+q.getId());
            System.out.println(q.getQuestions());
            System.out.println("Option 1 : " + q.getOption1());
            System.out.println("Option 2 : " + q.getOption2());
            System.out.println("Option 3 : " + q.getOption3());
            System.out.println("Option 4 : " + q.getOption4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }
        
        for(String s : selection){
            
            System.out.println("Results " + s);
        }


      
        
    }

    public void calculateScore(){
    int score = 0;
    for(int i = 0;i <questions.length ;i++){
            Questions ques = questions[i];
            String originalAnswer = ques.getAnswer();
            String userAnswer = selection[i];

            //compare
            if(originalAnswer.equals(userAnswer)){
                score++;
            }

        }
        System.out.println("Users Score is :" + score);
}
}


