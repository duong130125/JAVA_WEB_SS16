package ra.session_16.service;

import ra.session_16.model.Bus;

import java.util.List;

public interface BusService {
    List<Bus> getAllBuses();
    boolean addBus(Bus bus);
    Bus getBusById(int id);
    boolean updateBus(Bus bus);
    boolean deleteBus(int id);
}