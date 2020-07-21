package java29;

public class MainClass_example {

	public static void main(String[] args) {
		
		Example_VoteThread voteLocation1 = new Example_VoteThread();
		Example_VoteThread voteLocation2 = new Example_VoteThread();
		Example_VoteThread voteLocation3 = new Example_VoteThread();
		
		Thread location1 = new Thread(voteLocation1, "Location1");
		Thread location2 = new Thread(voteLocation2, "Location2");
		Thread location3 = new Thread(voteLocation3, "Location3");
		
		location1.start();
		location2.start();
		location3.start();
	}
	
	
	
	
}
