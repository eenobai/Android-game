public class MainActivity {



public int generateRandomNumber(int max){
  double randomNumber = Math.random() * max;

  int rndNumber = (int) randomNumber;

  return rndNumber;
}


public String getGameOverMessage(int totalCorrect, int totalQuestions){
  String returnMsg;
  if(totalCorrect == totalQuestions){
    returnMsg = "You got " + totalCorrect + " right! You won!"; 
    System.out.println(returnMsg);
  }else{
    returnMsg = "You got " + totalCorrect + " right out of " + totalQuestions + ". Better luck next time!";
    System.out.println(returnMsg);
  }
 return returnMsg;
}


}
