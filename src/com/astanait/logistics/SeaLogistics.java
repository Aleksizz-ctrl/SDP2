package com.astanait.logistics;
import com.astanait.logistics.transport.Transport;
import com.astanait.logistics.transport.Ship;
public class SeaLogistics extends Logistics {
    @Override
    protected Transport createTransport() {
        return new Ship();
    }
}
