class OrderCreationState implements OrderState {
    @Override
    public void processOrder() {
        System.out.println("Commande en attente de paiement");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Commande annulée");
    }

    @Override
    public void refundOrder() {
        System.out.println("Impossible de rembourser une commande non payée");
    }
}
