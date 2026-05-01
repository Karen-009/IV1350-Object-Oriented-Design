package IV1350_ObjectOrientedDesign.tests.se.kth.iv1350.repairelectricbiketest.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import se.kth.iv1350.repairelectricbike.integration.Printer;
import se.kth.iv1350.repairelectricbike.integration.RegistryCreator;
import se.kth.iv1350.repairelectricbike.integration.RepairOrderDTO;
import se.kth.iv1350.repairelectricbike.controller.Controller;
import se.kth.iv1350.repairelectricbike.view.Printer;

public class ControllerTest {
    private Controller controller;
    private RegistryCreator creator;
    private Printer printer;

    @BeforeEach
    public void setUp() {
        creator = new RegistryCreator();
        printer = new Printer();
        controller = new Controller(creator, printer);
    }

    /**
     * Test for createRepairOrder
     * Should return a RepairOrderDTO and save it in RepairOrderRegistry
     */
    @Test
    public void testCreateRepairOrder() {
        String desc = "Flat tire";
        String phone = "0701234567";
        Bike bike = new Bike("SN123");

        RepairOrderDTO newOrder = controller.createRepairOrder(desc, phone, bike);
        assertNotNull(newOrder, "RepairOrderDTO should not be null");
        assertEquals(desc, result.getProblemDescription());

        RepairOrderDTO savedOrder = controller.findRepairOrder(phone);
        assertNotNull(savedOrder, "The order should be found in the registry after creation");
    }
}
