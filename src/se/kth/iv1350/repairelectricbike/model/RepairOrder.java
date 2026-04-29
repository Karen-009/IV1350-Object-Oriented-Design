package se.kth.iv1350.repairelectricbike.model;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import se.kth.iv1350.repairelectricbike.integration.RepairOrderDTO;
import se.kth.iv1350.repairelectricbike.integration.RepairOrderRegistry;
import se.kth.iv1350.repairelectricbike.integration.RepairOrderState;

/**
 * Handles all calls to the data storage for repair orders.
 */
public class RepairOrder {
    private String phoneNumber;
    private String id;
    private String date;
    private String customersProblemDescription;
    private String estimatedCompletionDate;
    private RepairOrderState state;

    /**
     * Accepts this repair order. The state is changed to
     * Accepted and the registry is updated to reflect the new state.
     *
     * @param registry The registry used to persist the
     *                 updated repair order.
     */
    public void acceptRepairOrder(RepairOrderRegistry registry) {
        this.state = RepairOrderState.ACCEPTED;
        registry.updateRepairOrder(this.getRepairOrderDTO());
    }
}


