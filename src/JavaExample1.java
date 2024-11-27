import java.util.*;
import java.text.*;
public class JavaExample1 {
    public  static  void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat frm = new DecimalFormat();

        System.out.print("Input Product name   : ");
        String productName = input.nextLine();

        System.out.print("Input product unit   : ");
        int productUnit = input.nextInt();

        System.out.print("Input price per unit : ");
        Double productPrice = input.nextDouble();

        System.out.println();

        float totalPriceOfProduct = (float) (productUnit * productPrice);
        System.out.println("Total price is " + frm.format(totalPriceOfProduct) + " baht.");

        float totalWithVat = totalPriceOfProduct + (totalPriceOfProduct * 7/100);
        System.out.println("Add VAT 7%  is " + frm.format(totalWithVat) + " baht.");

        String frmTotalWithVat = String.format("%,.2f", totalWithVat);
        System.out.println("Output using String.format");
        System.out.println("Add VAT 7%  is " + frmTotalWithVat + " baht.");

        System.out.println("Output using printf");
        System.out.printf("Add VAT 7%%  is %,.2f baht.", totalWithVat);

        input.close();
    }
}
