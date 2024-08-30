public class QuestionServices {
    Questions[] questions = new Questions[5];
  public QuestionServices(){
      questions[0] = new Questions(1,"Which of the following planets is known for having a prominent ring system?","Mars","Jupiter","Saturn","Neptune","Saturn"); 
      questions[1] = new Questions(2,"What is the chemical symbol for the element Gold?","Au","Ag","Pb","Fe","Au"); 
      questions[2] = new Questions(3,"Who wrote the play \"Romeo and Juliet\"?","William Shakespeare","Charles Dickens","Jane Austen","Mark Twain","William Shakespeare"); 
      questions[3] = new Questions(4,"What is the largest ocean on Earth?","Atlantic Ocean","Indian Ocean","Arctic Ocean","Pacific Ocean","Pacific Ocean"); 
      questions[4] = new Questions(5,"Which of these elements is a noble gas?","Oxygen","Argon","Nitrogen","Hydrogen","Argon"); 
    

  }
    
    public void show(){

        for(Questions q : questions){

            System.out.println(q);
        }
    }
}
