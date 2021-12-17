package assignment_17_2_2021;

public class UsingThisKey {
	String name;
	int rollnum;
	void student(String sname,int rollnum) {
		this.name=sname;
		this.rollnum=rollnum;
		return;
	}
	void display() {
		System.out.println("student name:"+ name +" "+ "student rollnum:"+ rollnum);
	}

	public static void main(String[] args) {
		UsingThisKey obj =new UsingThisKey();
		obj.student("akshay", 420);
       obj.display();
	}

}
