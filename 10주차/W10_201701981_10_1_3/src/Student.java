
public class Student {
	private int _score ; // field(�ʵ�) : Ŭ���� �ȿ��� ���� �Ǵ� ����
	public Student(){
		this._score = 0 ;
	} //������
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
