public class SalariedEmployee extends Employee {

    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay(){
        int paycheck = (int) annualSalary/26;
      int adjustedPay =(int) (isRetired? 0.9* paycheck : paycheck);
      return adjustedPay;
    }

    public void retire(){
        terminate("12/12/2025");
        isRetired = true;
    }

}

