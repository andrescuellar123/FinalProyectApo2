package model;

import java.util.Comparator;

import model.Employee;

public class OrderEmployees implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getId().compareTo(o2.getId())>0) {
			return -1;
		} else if(o1.getId().compareTo(o2.getId())<0) {
			return 1;
		}
		return 0;
	}
}
