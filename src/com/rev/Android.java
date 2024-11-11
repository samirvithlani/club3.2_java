//package com.rev;
///*
// * param cosnt with parant child...
// * 
// * 
// * */
//class Google{
//	
//	public Google(String country) {
//	
//		System.out.println("Google in  "+country);
//	}
//	
//	
//}
//public class Android extends Google{
//
//	//1st opation...
//	public Android() {
//		
//		super("India");//parent param...
//		System.out.println("Android...");
//		
//	}
//	
//	//2nd opation...
//		public Android(String country) {
//			
//			super("India");//parent param...
//			System.out.println("Android...");
//			
//		}
//	
//	public static void main(String[] args) {
//		
//		Android a = new Android();//
//		Android a1 = new Android("India");//
//		
//		
//	}
//}

package com.rev;
/*
 * param cosnt with parant child...
 * 
 * 
 * */
class Google{
	public Google() {
		
		System.out.println("default...");
	}
	
	public Google(String country) {
	
		System.out.println("Google in  "+country);
	}
	
	
}
public class Android extends Google{

	//1st opation...
	public Android() {
		
		//super("India");//parent param...
		System.out.println("Android...");
		
	}
	
	//2nd opation...
		public Android(String country) {
			
			//super("India");//parent param...
			System.out.println("Android...");
			
		}
	
	public static void main(String[] args) {
		
		Android a = new Android();//
		Android a1 = new Android("India");//
		
		
	}
}
