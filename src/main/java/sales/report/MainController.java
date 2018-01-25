package sales.report;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Scanner;

@RestController

public class MainController {
    @RequestMapping("/")

    public double salesReprot() {
        double salesAmount, salesTaxAmount,totalAmountDue;
        int taxCode;


        System.out.println("Enter your sales amount ");
        Scanner scanner = new Scanner(System.in);
        salesAmount = scanner.nextFloat();
        System.out.println("Enter tax code ");
        taxCode=scanner.nextInt();
        switch(taxCode) {
            //case 0:
            //salesTaxAmount = 0;
            case 1:
                salesTaxAmount = salesAmount * 0.3;
                break;
            case 2:
                salesTaxAmount = salesAmount * 0.5;
                break;
            default:
                salesTaxAmount = 0;
                break;
        }
        
        System.out.println("Sales Report");
        totalAmountDue=salesAmount+salesTaxAmount;

        return totalAmountDue;
    }
}