package javaAssignment;

public class OnePlus implements Specifications,InBuiltFeatures
{
// 5. Write a java program to implement Multiple Inheritance
	
	public void price() {
		System.out.println("The Price of OnePlus phone stars from Rs.19999");
	}
	@Override
	public void switchOn() {
		System.out.println("To turn on the phone!");
	}
	@Override
	public void call() {
		System.out.println("To make a Call");
	}
	@Override
	public void sms() {
		System.out.println("To send a SMS");
	}
	@Override
	public void switchOff() {
		System.out.println("To turn off the phone!");
	}
	@Override
	public void settings() {
		System.out.println("Mobile Settings");
	}
	@Override
	public void appStore() {
		System.out.println("Inbuilt App Store");
	}
	@Override
	public void browser() {
		System.out.println("Inbuilt Browser");
	}
	@Override
	public void cameraPixel() {
		System.out.println("Camera : 50 megapixel");
	}
	@Override
	public void storage() {
		System.out.println("Storage : 128 GB");
	}
	@Override
	public void ram() {
		System.out.println("RAM : 8GB");
	}
}
