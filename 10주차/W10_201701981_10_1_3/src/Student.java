
public class Student {
	private int _score ; // field(필드) : 클래스 안에서 선언 되는 변수
	public Student(){
		this._score = 0 ;
	} //생성자
	public void setScore(int ascore){
		this._score = ascore ;		
	} //setter
	public int score(){
		return this._score ;
	}
	public char score2Grade(){
		if(this._score >= 90){
			return 'A' ;
		}
		else if(this._score >=80){
			return 'B' ;
		}
		else if(this._score >=70 ){
			return 'C' ;
		}
		else if(this._score >= 60){
			return 'D' ;
		}
		else{
			return 'F' ;
		}
	}

}
