package net.mtsc.surcharge.service.impl;

import net.mtsc.surcharge.service.FeeService;
import net.mtsc.surcharge.service.impl.FeeServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class FeeServiceImplTest {

    private FeeService feeService = new FeeServiceImpl();


    @Test
    public void givenAmount_thenReturnFeeCharge() {

        double charge = feeService.getCharge(5000);
        assertEquals(10.0, charge, 0.0);

        charge = feeService.getCharge(50000);
        assertEquals(25.0, charge, 0.0);

        charge = feeService.getCharge(50000);
        assertEquals(25.0, charge, 0.0);

        charge = feeService.getCharge(50100);
        assertEquals(50.0, charge, 0.0);
    }
}
