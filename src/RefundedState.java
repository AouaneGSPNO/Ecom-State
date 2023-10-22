class RefundedState implements OrderState {
    @Override
    public void processOrder() {
        System.out.println("Commande déjà remboursée, impossible de la traiter");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Commande déjà remboursée, impossible d'annuler à nouveau");
    }

    @Override
    public void refundOrder() {
        System.out.println("Commande déjà remboursée");
    }
}
