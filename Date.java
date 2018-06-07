package project;

public class Date {
	int date;
	int year;
	int month;
	public Date() {
	}
		public Date(int date,int year,int month) {
			this.date=date;
			this.year=year;
			this.month=month;
	}
		public int getDate() {
			return date;
		}
		public void setDate(int date) {
			this.date = date;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public int getMonth() {
			return month;
		}
		public void setMonth(int month) {
			this.month = month;
		}
	
	public void displaydate() {
		System.out.println(date+"/"+year+"/"+month);
	}
public static void main(String[] args) {
	Date d1=new Date();
	d1.setDate(18);
	d1.setYear(1998);
	d1.setMonth(02);
	d1.displaydate();
}
}
