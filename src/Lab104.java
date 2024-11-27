import javax.swing.*;

public class Lab104 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to the Payroll Application");

        String employeeName = JOptionPane.showInputDialog(null, "Enter Employee name");
        int employeeHour = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter total hour for this employee."));

        float grossEarning = (float) (employeeHour * 7.5);
        float tax = (float) (grossEarning * 0.15);
        float netEarning = (float) (grossEarning - tax);

        String message = ("Employee name: " + employeeName) + "\n" +
                ("Hours Worked: " + employeeHour) + "\n" +
                ("Hourly wage: $7.5") + "\n" +
                ("Gross Earnings: $" + grossEarning) + "\n" +
                ("Tax rate: 0.15") + "\n" +
                ("Tax: $" + tax) + "\n" +
                ("Net earnings: $" + netEarning);

        JOptionPane.showMessageDialog(null, message);
    }
}
