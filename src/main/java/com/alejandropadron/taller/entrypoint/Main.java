package com.alejandropadron.taller.entrypoint;



class Doctor {
	protected int age;
	protected void setAge(int val) { age = val; }
	protected int getAge() { return age; }
	public void pasoParametros(int entero, Integer enteroObjeto){
		System.out.println("inner " + entero);
		System.out.println("inner " + enteroObjeto);
		System.out.println("################ ");
		entero++;
		enteroObjeto = Integer.valueOf(entero);
		System.out.println("inner " + entero);
		System.out.println("inner " + enteroObjeto);
	}
	public void pasoParametros(final Doctor doctor){
		System.out.println("inner before set" + doctor.getAge());
		doctor.setAge(40);
		System.out.println("inner after set" + doctor.getAge());
		
	}

}
	
class Surgeon extends Doctor {
	Surgeon(String val) {
		specialization = val;
	}
	String specialization;
	String getSpecialization() { return specialization; }
}

public class Main {

	private final static Integer ZERO = 0;
	
	public static void main(String[] args) {
		Integer cero = new Integer(ZERO);
		
		Doctor doctor = new Doctor();
		doctor.setAge(36);
		System.out.println(doctor.getAge());
		
		doctor.pasoParametros(doctor);
		System.out.println(doctor.getAge());
		
		
			
//			45Heart
//			0Liver
			
		
	}//main

}//class
