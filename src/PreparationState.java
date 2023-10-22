class PreparationState implements OrderState {
    @Override
    public void processOrder() {
        System.out.println("Commande expédiée");
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