package com.astanait.logistics;
import com.astanait.logistics.transport.Transport;
import com.astanait.logistics.transport.Truck;
public class RoadLogistics extends Logistics {
    @Override
    protected Transport createTransport() {
        return new Truck();
    }
}