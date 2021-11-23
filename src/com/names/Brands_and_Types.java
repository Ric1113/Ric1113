package com.names;

public class Brands_and_Types {
	public void lamborghini() {
		System.out.print("model:aventador");
		System.out.print(" color:yellow ");
		System.out.println(" price:1,00,000 ");
	}
	public void mercedes_benz() {
		System.out.print("model:GLS600");
		System.out.print(" color:grey ");
		System.out.println(" price:5,00,000 ");		
	}
	public void bmw() {
		System.out.print("model:520di ");
		System.out.print(" color:black ");
		System.out.println(" price:3,00,000 ");
	}
	public void audi() {
		System.out.print("model:RS Q8 ");
		System.out.print(" color:blue ");
		System.out.println(" price:1,20,000 ");		
	}
	public void bucati() {
		System.out.print("model:chiron ");
		System.out.print(" color:blue ");
		System.out.println(" price:5,20,000 ");		
	}
	public void volkswagen() {
		System.out.print("model:vento ");
		System.out.print(" color:blue ");
		System.out.println(" price:15,000 ");		
	}
	public void skoda() {
		System.out.print("model:octavia ");
		System.out.print(" color:black ");
		System.out.println(" price:30,000 ");		
	}
	public void kia() {
		System.out.print("model:seltos ");
		System.out.print(" color:black");
		System.out.println(" price:1,20,000 ");		
	}
	private void mg() {
		System.out.print("model:hector ");
		System.out.print(" color:red");
		System.out.println(" price:1,50,000 ");		
	}
	private void marutisuzuki() {
		System.out.print("model:ertiga");
		System.out.print(" color:white");
		System.out.println(" price:1,20,000 ");		
	}
	public static void main(String[] args) {
		Brands_and_Types brand = new Brands_and_Types();
		brand.audi();
		brand.bmw();
		brand.bucati();
		brand.marutisuzuki();
		brand.mercedes_benz();
	}
}
