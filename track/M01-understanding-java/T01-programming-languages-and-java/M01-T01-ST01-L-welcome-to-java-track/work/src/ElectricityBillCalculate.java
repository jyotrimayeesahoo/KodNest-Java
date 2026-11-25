public class ElectricityBillCalculate {
    public static void main(String[] args) {
        String customerName = "Rahul";
        int unitsConsumed = 350;

        double electricityBill = 0;
        double surcharge = 0;
        double totalBill = 0;

        // Validate units
        if (unitsConsumed <= 0) {
            System.out.println("Invalid Units");
        } else {

            // Calculate electricity bill
            if (unitsConsumed <= 100) {
                electricityBill = unitsConsumed * 2;
            } else if (unitsConsumed <= 200) {
                electricityBill = (100 * 2) + ((unitsConsumed - 100) * 3);
            } else if (unitsConsumed <= 300) {
                electricityBill = (100 * 2) + (100 * 3)
                        + ((unitsConsumed - 200) * 5);
            } else {
                electricityBill = (100 * 2) + (100 * 3)
                        + (100 * 5) + ((unitsConsumed - 300) * 7);
            }

            // Calculate surcharge
            if (electricityBill > 1000) {
                surcharge = electricityBill * 0.05;
            }

            // Calculate total bill
            totalBill = electricityBill + surcharge;

            // Display details
            System.out.println("Customer Name: " + customerName);
            System.out.println("Units Consumed: " + unitsConsumed);
            System.out.println("Electricity Bill: Rs. " + electricityBill);
            System.out.println("Surcharge: Rs. " + surcharge);
            System.out.println("Total Bill: Rs. " + totalBill);
        }
    }
}
