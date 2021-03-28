package wsh.przemyslawbrambor;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        final Warehouse warehouse = new Warehouse();

        final MobilePhone iphoneXMobilePhone = new MobilePhone(1, "IPhone X", BigDecimal.valueOf(2700));
        final MobilePhone samsungSMobilePhone = new MobilePhone(2, "Samsung Galaxy", BigDecimal.valueOf(1700));

        final Tv sonyTv = new Tv(3, "Sony 49", BigDecimal.valueOf(1350));

        warehouse.addProduct(iphoneXMobilePhone);
        warehouse.addProduct(samsungSMobilePhone);
        warehouse.addProduct(sonyTv);
    }
}
