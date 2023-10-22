public class Main {
    public static void main(String[] args) {
        OrderContext order = new OrderContext();
        System.out.println("************ Création ====>  Attente de paiement ***************");
        order.processOrder();
        System.out.println("************ Non payée ====> Non remboursée ***************");
        order.refundOrder();
        System.out.println("************ Annulée ***************");
        order.cancelOrder();
    }
}