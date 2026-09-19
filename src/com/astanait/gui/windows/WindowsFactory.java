package com.astanait.gui.windows;
import com.astanait.gui.Button;
import com.astanait.gui.Checkbox;
import com.astanait.gui.GUIFactory;
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}