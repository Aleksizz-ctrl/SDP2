package com.astanait.gui.macos;
import com.astanait.gui.Button;
import com.astanait.gui.Checkbox;
import com.astanait.gui.GUIFactory;
public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }
    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
