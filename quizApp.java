import java.util.*;
public class quizApp {
	public static void main(String[] args)
	{
		Quiz q=new Quiz();
		q.begin();
	}

}
class Question{
	String ques;
	String op1;
	String op2;
	String op3;
	String op4;
	Answer a;
	public Question(String ques, String op1, String op2, String op3,
			String op4, Answer a) {
		super();
		this.ques = ques;
		this.op1 = op1;
		this.op2 = op2;
		this.op3 = op3;
		this.op4 = op4;
		this.a = a;
	}
	public String getQues() {
		return ques;
	}
	public String getOp1() {
		return op1;
	}
	public String getOp2() {
		return op2;
	}
	public String getOp3() {
		return op3;
	}
	public String getOp4() {
		return op4;
	}
	public Answer getA() {
		return a;
	}
	
}
class Answer
{
	String ans;

	public Answer(String ans) {
		super();
		this.ans = ans;
	}

	public String getAns() {
		return ans;
	}	
	}
 class Quiz
 {
	 int total=0;
	 int correct=0;
	 int wrong=0;
	 void begin()
	 {
		 Question q1=new Question("which is a valid keyword in java?","interface","inherit","unassigned","derive",new Answer("interface"));
		 Question q2=new Question("where does object get created in memory?","stack","queue","heap","none",new Answer("heap"));
		 Question q3=new Question("which keyword helps in preventing overiding?","extend","final","implement","static",new Answer("final"));
		 Question q[]={q1,q2,q3};
		 
		 for(int i=0;i<q.length;i++)
		 {
			System.out.println(q[i].getQues());
			System.out.println("A "+q[i].getOp1());
			System.out.println("B "+q[i].getOp2());
			System.out.println("C "+q[i].getOp3());
			System.out.println("D "+q[i].getOp4());
			System.out.println("Enter your Answer");
			Scanner s=new Scanner(System.in);
			char a=s.next().charAt(0);
			String answer ="";
			
			switch(a)
			{
			case 'a':{answer =q[i].getOp1();break;}
			case 'b':{answer =q[i].getOp2();break;}
			case 'c':{answer =q[i].getOp3();break;}
			case 'd':{answer =q[i].getOp4();break;}
			default:break;
			}
			System.out.println(answer);
			if(answer.equals(q[i].a.getAns()))
			{
			System.out.println("correct");
			correct++;
			}
			else
			{
				System.out.println("wrong");
				wrong++;
			}
		 total++;}
		 res rest=new result(total,correct,wrong);
		 rest.show();
	 }
	 
 }
 interface res
 {
	 void show();
	 double percent(int correct,int total);
	 String performance(double percent);
 }
 class result implements res
 {
	 int total;
	 int correct;
	 int wrong;
	public result(int total, int correct, int wrong) {
		super();
		this.total = total;
		this.correct = correct;
		this.wrong = wrong;
	}
	 public void show()
	 {
		 System.out.println("your result");
		 System.out.println("total ques "+ total);
		 System.out.println("correct answer "+correct);
		 System.out.println("wrong answer "+wrong);
		 System.out.println("percntage "+percent(correct,total));
		 System.out.println("performance "+performance(percent(correct,total)));
		 
	 }
	 public double percent(int correct,int total)
	 {return (double)((correct*100)/total);}
	 public String performance(double percent)
	 {
		 String p="";
		 if(percent>80){p="good";}
		 else if(percent>60 && percent<=80){p="average";}
		 else{p="poor";}
		 return p;
	 }
 }