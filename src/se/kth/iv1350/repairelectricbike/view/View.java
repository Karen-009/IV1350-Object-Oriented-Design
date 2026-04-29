package se.kth.iv1350.repairelectricbike.view;

import se.kth.iv1350.repairelectricbike.controller.Controller;

/**
 * This program has no real user interface. Instead, this
 * class simulates user interactions with hardcoded calls to all system operations.
 */
public class View {
    private Controller contr;

    /**
     * Creates a new instance.
     *
     * @param contr The controller used for all operations.
     */
    public View(Controller contr) {
        this.contr = contr;
    }

    /**
     * Simulates a user interaction that generates calls to
     * all system operations in the basic flow. All returned
     * values are printed to System.out.
     */
    public void sampleExecution() {
    
    }
}
