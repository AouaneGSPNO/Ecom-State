class ShippedState implements OrderState {
    @Override
    public void processOrder() {
        System.out.println("La commande a déjà été expédiée");
    }

    @Override
    public void cancelOrder() {
        System.out.println("La commande a déjà été expédiée, impossible d'annuler");
    }

    @Override
    public void refundOrder() {
        System.out.println("La commande a déjà été expédiée, impossible de rembourser");
    }
}