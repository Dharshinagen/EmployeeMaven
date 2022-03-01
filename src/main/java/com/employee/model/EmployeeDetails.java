package com.employee.model;

import java.time.LocalDate;
import java.util.Objects;

public class EmployeeDetails {
        String employeeName;
        String employeeCode;
        String email;
        String address1;
        String address2;
        String city;
        String state;
        LocalDate dateOfBirth;
        LocalDate joiningDate;
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public String getEmployeeCode() {
			return employeeCode;
		}
		public void setEmployeeCode(String employeeCode) {
			this.employeeCode = employeeCode;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAddress1() {
			return address1;
		}
		public void setAddress1(String address1) {
			this.address1 = address1;
		}
		public String getAddress2() {
			return address2;
		}
		public void setAddress2(String address2) {
			this.address2 = address2;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(LocalDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public LocalDate getJoiningDate() {
			return joiningDate;
		}
		public void setJoiningDate(LocalDate joiningDate) {
			this.joiningDate = joiningDate;
		}
		public EmployeeDetails(String employeeName, String employeeCode, String email, String address1, String address2,
				String city, String state, LocalDate dateOfBirth, LocalDate joiningDate) {
			super();
			this.employeeName = employeeName;
			this.employeeCode = employeeCode;
			this.email = email;
			this.address1 = address1;
			this.address2 = address2;
			this.city = city;
			this.state = state;
			this.dateOfBirth = dateOfBirth;
			this.joiningDate = joiningDate;
		}
		public EmployeeDetails() {
			super();

		}
		public EmployeeDetails(String employeeName, String employeeCode, String email, String city, String state,LocalDate joiningDate) {
			this.employeeName = employeeName;
			this.employeeCode = employeeCode;
			this.email = email;
			this.city = city;
			this.state = state;
			this.joiningDate = joiningDate;
		}
		@Override
		public int hashCode() {
			return Objects.hash(address1, address2, city, dateOfBirth, email, employeeCode, employeeName, joiningDate,
					state);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			EmployeeDetails other = (EmployeeDetails) obj;
			return Objects.equals(address1, other.address1) && Objects.equals(address2, other.address2)
					&& Objects.equals(city, other.city) && Objects.equals(dateOfBirth, other.dateOfBirth)
					&& Objects.equals(email, other.email) && Objects.equals(employeeCode, other.employeeCode)
					&& Objects.equals(employeeName, other.employeeName)
					&& Objects.equals(joiningDate, other.joiningDate) && Objects.equals(state, other.state);
		}
		@Override
		public String toString() {
			return "employeeDetails [employeeName=" + employeeName + ", employeeCode=" + employeeCode + ", email="
					+ email + ", address1=" + address1 + ", address2=" + address2 + ", city=" + city + ", state="
					+ state + ", dateOfBirth=" + dateOfBirth + ", joiningDate=" + joiningDate + "]";
		}


}
