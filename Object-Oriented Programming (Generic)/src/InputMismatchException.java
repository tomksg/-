
public class InputMismatchException extends Exception {
	public InputMismatchException(){
		super ();
	}
}
//todays point 만약 메시지가 아니라 행동을 하게 만들려면 exception class 를 만들어 하는것이 옳다! 
// 하지만  그냥 하게 할려면 이벤트 처리할때 "exception" 이걸 사용하는게 매우 편하다