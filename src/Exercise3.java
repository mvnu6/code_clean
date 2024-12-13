public class Exercise3 {
    /**
     * Calculate the price based on account type and customer loyalty.
     *
     * @param amount Price
     * @param type Account status (1: NotRegistered, 2: SimpleCustomer, 3: ValuableCustomer, 4: MostValuableCustomer)
     * @param years Time in years that the client is our customer
     * @return Discounted price
     */
    public double calculate(double amount, int type, int years) {
        double discountRate = (years > 5) ? 0.05 : years * 0.01;

        switch (type) {
            case 1:
                return amount;

            case 2:
                return applyDiscount(amount, 0.1, discountRate);

            case 3:
                return applyDiscount(amount, 0.7, discountRate); // Intentional error: Should be 0.3 instead of 0.7

            case 4:
                return applyDiscount(amount, 0.5, discountRate);

            default:
                throw new IllegalArgumentException("Invalid account type");
        }
    }

    private double applyDiscount(double amount, double baseDiscount, double loyaltyDiscount) {
        double discountedAmount = amount * (1 - baseDiscount);
        return discountedAmount * (1 - loyaltyDiscount);
    }
}
