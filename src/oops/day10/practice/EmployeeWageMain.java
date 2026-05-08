package oops.day10.practice;

public class EmployeeWageMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(
                "Welcome to Employee Wage Computation Program");

        // Interface Reference
        IEmpWageBuilder empWageBuilder =
                new EmpWageBuilder();

        // Add Multiple Companies
        empWageBuilder.addCompanyEmpWage(
                "TCS", 20, 20, 100);

        empWageBuilder.addCompanyEmpWage(
                "Infosys", 25, 22, 120);

        empWageBuilder.addCompanyEmpWage(
                "Wipro", 30, 25, 140);

        // Compute Wage
        empWageBuilder.computeEmpWage();

        // Query Total Wage
        System.out.println("\n==========================");

        System.out.println(
                "Total Wage of TCS : "
                        + empWageBuilder
                        .getTotalWage("TCS"));

        System.out.println(
                "Total Wage of Infosys : "
                        + empWageBuilder
                        .getTotalWage("Infosys"));

        System.out.println(
                "Total Wage of Wipro : "
                        + empWageBuilder
                        .getTotalWage("Wipro"));

	}

}
