
public class Student {
	private int _ScoreKorean ;
	private int _ScoreEnglish ;
	private int _ScoreComput ;
	private char score2Grdae(int aScore){
		if(aScore>=90){
			return 'A' ;
		}
		else if(aScore>=80){
			return 'B' ;
		}
		else if(aScore>= 70){
			return 'C' ;
		}
		else if(aScore >= 60){
			return 'D' ;
		}
		else{
			return 'F' ;
		}
	}
	private double grade2Point(char grade){
		char grade1 = grade ;
		switch(grade1){
		case 'A' : return 4.0 ;
		case 'B' : return 3.0 ;
		case 'C' : return 2.0 ;
		case 'D' : return 1.0 ;
		default : return 0.0 ;
		}
	}
	public Student(){
		this._ScoreKorean = 0 ;
		this._ScoreEnglish = 0 ;
		this._ScoreComput = 0 ;
	}
	public void setScoreKorean(int aScoreKorean){
		this._ScoreKorean = aScoreKorean ;
	}
//	������ �޾ƿͼ� class �� �ƴ� ��ü�� �����Ѵ�.
	public int ScoreKorean()
	{
		return this._ScoreKorean ;
	} // ������ ������ �ñ��Ҷ� �� �� ����
	
	public char gradeKorean(){
		return this.score2Grdae(this._ScoreKorean) ;
	}
	public double pointKorean(){
		return this.grade2Point(this.gradeKorean()) ;
	}
	
	public void setScoreEnglish(int aScoreEnglish){
		this._ScoreEnglish = aScoreEnglish ;
	}
	public int ScoreEnglish()
	{
		return this._ScoreEnglish ;
	}
	public char gradeEnglish(){
		return this.score2Grdae(this._ScoreEnglish) ;
	}
	public double pointEnglish(){
		return this.grade2Point(this.gradeEnglish());
	}
	
	
	public void setScoreComput(int aScoreComput){
		this._ScoreComput = aScoreComput ;
	}
	public int ScoreComput()
	{
		return this._ScoreKorean ;
	}
	public char gradeComput(){
		return this.score2Grdae(this._ScoreComput) ;
	}
	public double pointComput(){
		return this.grade2Point(this.gradeComput()) ;
	}
	public double GPA(){
		double GPA = ((this.grade2Point(this.gradeKorean()) + this.grade2Point(this.gradeComput())+ this.grade2Point(this.gradeEnglish()))/3.0) ;
		return GPA ;
	}
	
	
}
