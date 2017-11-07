
public class Converter {

	public int number;
	public String letterGrade;
	
	Converter(int number){
		this.setNumber(number);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
		if (number>=88) {
			this.letterGrade = "A";
		} else if (number>=80) {
			this.letterGrade = "B";
		} else if (number>=67) {
			this.letterGrade = "C";
		} else if (number>=60) {
			this.letterGrade = "D";
		} else {
			this.letterGrade = "F";
		}
	}

	public String getLetterGrade() {
		return letterGrade;
	}

}
