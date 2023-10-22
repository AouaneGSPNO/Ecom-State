class OrderContext {
    private OrderState state;

    public OrderContext() {
        state = new OrderCreationState();
    }

    public void processOrder() {
        state.processOrder();
        if (state instanceof PaymentPendingState) {
            state = new PreparationState();
        }
    }

    public void cancelOrder() {
        state.cancelOrder();
        if (state instanceof PaymentPendingState || state instanceof PreparationState) {
            state = new RefundedState();
        }
    }

    public void refundOrder() {
        state.refundOrder();
        if (state instanceof PaymentPendingState || state instanceof PreparationState) {
            state = new RefundedState();
        }
    }
}