public class Payment {
    public static void main(String[] args) {
        double commission = 0;
        int amount = 900;

        // cash, card, check
        String paymentType = "cash";

        switch (paymentType) {
            case "cash":
                commission = 0;
                break;
            case "card":
                commission = 0.02;
                break;
            case "check":
                commission = 0.05;
                break;
            default:
                commission = 0.01;

            }
            double total = amount + (amount * commission);
            System.out.println("total:" + total);
        }
    }
