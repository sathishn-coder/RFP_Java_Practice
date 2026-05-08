package oops.day10.practice;

public  interface IEmpWageBuilder {
	 // Method to add company
    void addCompanyEmpWage(String companyName,
                           int empRatePerHour,
                           int numOfWorkingDays,
                           int maxHoursPerMonth);

    // Method to compute wages
    void computeEmpWage();

    // Method to get total wage
    int getTotalWage(String companyName);

}
