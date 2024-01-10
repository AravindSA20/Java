package oop.DataAbstraction;
/*            
                  WHO    -Hybrid Inheritance
                ___|___
               |       |
              IMA     USMA      }
                \     /         }-Multiple Inheritance    
            MeenakshiHospital   }  
            
   * Class      -extends-   Class
   * Interface -implements- Class
   * Interface  -extends-   Interface       
 */
public class TestHospital 
{
    public static void main(String[] args) {
		//child class ref and child class object
    	MeenakshiHospital m1=new MeenakshiHospital();
		m1.medicalService(); //individual 
		m1.cardio(); //inherited abstract
		m1.dental();//inherited abstract
		m1.neuro();
		m1.physio();
		m1.covid19Test();//Hybrid inheritance
		
		System.out.println("--------------------------------");
		
		//Parent class ref and child class object 
		IMA i1=new MeenakshiHospital();
		i1.cardio();
		i1.dental();
		i1.covid19Test();

		System.out.println("--------------------------------");
		
		//Parent class ref and child class object  
		USMA u1=new MeenakshiHospital();
		u1.neuro();
		u1.physio();
		u1.covid19Test();
	}
}
