package com.collection.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

class Patient {

	String name;
	int priority;

	public Patient(String name, int priority) {

		this.name = name;
		this.priority = priority;
	}

	@Override
	public String toString() {

		return "Patient(name = " + name + " havnig priority " + priority + ")";
	}

}

class PatientComparator implements Comparator<Patient> {

	@Override
	public int compare(Patient p1, Patient p2) {

		return Integer.compare(p2.priority, p1.priority);
		//return Integer.compare(p1.priority, p2.priority);
	}

}

public class HosiptalEmergancyWard {

	public static void main(String[] args) {

		PriorityQueue<Patient> patients = new PriorityQueue<Patient>(new PatientComparator());
		// PriorityQueue<String>

		patients.add(new Patient("amit is having headache", 1));
		patients.add(new Patient("raj is having toothache", 2));
		patients.add(new Patient("ajay is having heart at...", 4));
		patients.add(new Patient("kunal had accident", 3));
		
		
		//System.out.println(patients.remove());
		for(Patient p :patients) {
			System.out.println(p);
		}

	}
}
