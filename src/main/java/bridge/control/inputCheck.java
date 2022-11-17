package bridge.control;

public class inputCheck {
  private int change;
  public void bridge_size_check(String input_size){
    if(!input_size.matches("^[0-9]*$]")){
      throw new IllegalArgumentException("[ERROR] 숫자를 입력해주세요.");
    }
    change = Integer.parseInt(input_size);
    if(change < 3 || change > 20){
      throw new IllegalArgumentException("[ERROR] 3이상 20이하의 숫자를 입력해주세요.");
    }
  }
  public void moving_check(String input_Moving){
    if(!(input_Moving.equals("U") || input_Moving.equals("D"))){
      throw new IllegalArgumentException("[ERROR] 위는 U 아래는 D 를 입력해주세요.");
    }
  }
  public void command_check(String input_GameCommand ){
    if(!(input_GameCommand.equals("R") || input_GameCommand.equals("Q"))){
      throw new IllegalArgumentException("[ERROR] 재시도는 R 종료는 Q 를 입력해주세요.");
    }
  }
}