import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int upRange = 300;
        int lowRange = 200;
        int quantity = service.calculate(upRange, lowRange);
        System.out.println(quantity);
    }
}
