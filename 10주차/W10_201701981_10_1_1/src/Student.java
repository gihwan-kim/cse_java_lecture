
public class Student {
		private int _score ;
		public Student()
		{
			this._score = 0 ; //this._score : �ʵ��̴�.
		}
		public void setScore(int aScore){
			this._score = aScore ;
		}
		public int score(){
			return this._score ;			
		}
		public char grade(){
			if(this._score >= 90){
				return 'A' ;
			}
			else if(this._score >= 80){
				return 'B' ;
			}
			else if(this._score >= 70){
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

