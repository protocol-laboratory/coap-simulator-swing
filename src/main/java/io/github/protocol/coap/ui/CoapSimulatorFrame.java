package io.github.protocol.coap.ui;

import javax.swing.JFrame;
import java.awt.HeadlessException;

public class CoapSimulatorFrame extends JFrame {
    public CoapSimulatorFrame() throws HeadlessException {
        super("Coap Simulator");
        this.setSize(1400, 900);
    }
}
