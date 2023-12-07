package lab4.invoiceItem;

public class TestInvoiceItem {

    public static void main(String[] args) {
// Test c o n s t r u c t o r and t o S t ri n g ( )
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);

        System.out.println(inv1);

        inv1.setQty(999);
        inv1.setUnitPrice(0.99);

        System.out.println(inv1);

        System.out.println("id is: "+inv1.getId());
        System.out.println("Desc is: "+inv1.getDesc());
        System.out.println("Qty is: "+inv1.getQty());
        System.out.println("UnitPrice is: "+inv1.getUnitPrice());

        System.out.println("The total is: "+inv1.getTotal());
    }
}
