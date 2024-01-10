package oop.DataAbstraction;
//Multiple Inheritance
public class MeenakshiHospital implements IMA,USMA //using 2 parents, 1 child
{
	public void medicalService()
	{
		System.out.println("MeenakshiHospital....Medical treatment");
	}

	@Override
	public void cardio() {
		// TODO Auto-generated method stub
		System.out.println("MeenakshiHospital....Cardio treatment");
	}

	@Override
	public void dental() {
		// TODO Auto-generated method stub
		System.out.println("MeenakshiHospital....Dental treatment");
	}

	@Override
	public void neuro() {
		// TODO Auto-generated method stub
		System.out.println("MeenakshiHospital....Nuero treatment");
	}

	@Override
	public void physio() {
		// TODO Auto-generated method stub
		System.out.println("MeenakshiHospital....Physio treatment");
	}

	@Override
	public void covid19Test() {
		// TODO Auto-generated method stub
		System.out.println("MeenakshiHospital....Covid-19 Test treatment");
	}


}
