/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BloodPressureMonitor;

/**
 *
 * @author siluni
 */

import java.time.Year;

public class BloodPressureRecord {
    private int id;
    private String name;
    private int yob;
    private int systolic;
    private int diastolic;
        
    public BloodPressureRecord(int id, String name, int yob, int systolic, int diastolic) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.systolic = systolic;
        this.diastolic = diastolic;    
    }
    
    public void calculate(){
        int currentYear = Year.now().getValue();
        int age = currentYear - getYob();
        System.out.println("Age: " + age + " years");
    }
    
    public void display() {
        System.out.println("Record ID: " + getId());
        System.out.println("Patient Name: " + getName());
        System.out.println("Birth Year: " + getYob());
        System.out.println("Blood Pressure: " + getSystolic() + "/" + getDiastolic());
        System.out.println("");
    }
    
    //Setters and getters
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYob() {
		return yob;
	}
	public void setYob(int yob) {
		this.yob = yob;
	}
	public int getSystolic() {
		return systolic;
	}
	public void setSystolic(int systolic) {
		this.systolic = systolic;
	}
	public int getDiastolic() {
		return diastolic;
	}
	public void setDiastolic(int diastolic) {
		this.diastolic = diastolic;
	}
}

