package com.astanait.app;
import com.astanait.gui.Button;
import com.astanait.gui.Checkbox;
import com.astanait.gui.GUIFactory;
import com.astanait.logistics.Logistics;
public class DeliveryApplication {
    private final Logistics logistics;
    private final Button button;
    private final Checkbox checkbox;
    public DeliveryApplication(GUIFactory guiFactory, Logistics logistics) {
        this.logistics = logistics;
        this.button = guiFactory.createButton();
        this.checkbox = guiFactory.createCheckbox();
    }
    public void run(String cargo, String destination) {
        button.paint();
        checkbox.paint();
        logistics.planDelivery(cargo, destination);
    }
}