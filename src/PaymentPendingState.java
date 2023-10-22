class PaymentPendingState implements OrderState {
    @Override
    public void processOrder() {
        System.out.println("Paiement reçu, commande en cours de préparation");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Commande annulée, remboursement en cours");
    }

    @Override
    public void refundOrder() {
        System.out.println("Remboursement en cours");
    }
}