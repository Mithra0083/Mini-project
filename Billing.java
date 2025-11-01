package Model;

public class Billing { private Orderltem order;

public Billing(Orderltem order) {

this.order = order;

}

public void printBill() {

System.out.println("===== FOOD ORDER BILL ====="); for (Fooditem item: order.getItems()) {

System.out.println(item.getName() + "-" + item.getPrice());

}

System.out.println("--

System.out.println("Total Amount: " + order.calculateTotal());

System.out.println("======

}

}
