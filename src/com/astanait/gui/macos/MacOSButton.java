package com.astanait.gui.macos;
import com.astanait.gui.Button;
public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering macOS button");
    }
}
