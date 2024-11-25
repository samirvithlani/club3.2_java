package com.rev;


interface GoogleAI{
	
	
	public String googleGPT();
	
}

interface OpenAI{
	
	public String chatGPT();
}



public class Ai implements GoogleAI,OpenAI{

	
	public static void main(String[] args) {
		
		GoogleAI gai = new Ai();
		gai.googleGPT();
		OpenAI oi = new Ai();
		oi.chatGPT();
		
	}

	@Override
	public String googleGPT() {
		
		System.out.println("google GPT");
		return null;
	}

	@Override
	public String chatGPT() {
		
		System.out.println("CHAT GPT");
		return null;
	}
}
