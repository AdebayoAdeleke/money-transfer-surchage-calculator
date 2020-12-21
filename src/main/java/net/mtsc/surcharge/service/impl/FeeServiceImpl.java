package net.mtsc.surcharge.service.impl;


import com.fasterxml.jackson.databind.ObjectMapper;
import net.mtsc.surcharge.model.Fee;
import net.mtsc.surcharge.model.FeesConfig;
import net.mtsc.surcharge.service.FeeService;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;

/**
 * A Fee Service implementation class that manages the fees
 * configuration and provides the methods the configuration file
 * and retrieve the corresponding charges.
 *
 */

public class FeeServiceImpl implements FeeService {

    /**
     * Used for converting from JSON  to Object
     */
    private final ObjectMapper objectMapper = new ObjectMapper();


    /**
     * Returns the fee charge for the given amount
     * to be transferred by the customer.
     *
     * @param amount the amount to be transferred
     * @return charge
     */

    @Override
    public double getCharge(double amount) {

        double charge = 0.0;
        List<Fee> fees = readFeesConfiguration();
        fees.sort(Comparator.comparing(Fee::getMaxAmount));
        for (Fee fee : fees) {
            if (amount >= fee.getMinAmount() && amount <= fee.getMaxAmount()) {
                charge = fee.getFeeAmount();
                break;
            }
        }
        //this is to handle for the case of an "amount and above)
        if (charge == 0.0 && !fees.isEmpty()) {
            charge = fees.get(fees.size() - 1).getFeeAmount();
        }
        return charge;
    }


    /**
     * Reads the fees configuration file and returns the list
     * of fees with the ranges they are applicable to.
     *
     * @return list of fees
     */
    private List<Fee> readFeesConfiguration() {

        try {
            Path path = Paths.get("fees.config.json");

            byte[] bytes = Files.readAllBytes(path);

            FeesConfig feesConfig = objectMapper.readValue(bytes, FeesConfig.class);
            return feesConfig.getFees();

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Unable to read fee configuration file");
        }
    }
}
