package app;

import gui.Button;
import gui.Checkbox;
import gui.GUIFactory;
import transport.Logistics;

public class DeliveryApplication {
    private final Button button;
    private final Checkbox checkbox;
    private final Logistics logistics;

    public DeliveryApplication(GUIFactory guiFactory, Logistics logistics) {
        this.button = guiFactory.createButton();
        this.checkbox = guiFactory.createCheckbox();
        this.logistics = logistics;
    }

    public void run(String cargo, String destination) {
        button.paint();
        checkbox.paint();
        logistics.planDelivery(cargo, destination);
    }
}
