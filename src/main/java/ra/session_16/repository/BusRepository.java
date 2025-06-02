package ra.session_16.repository;

import ra.session_16.model.Bus;

import java.util.List;

public interface BusRepository {
    List<Bus> getAllBuses();
    boolean addBus(Bus bus);
    Bus getBusById(int id);
    boolean updateBus(Bus bus);
    boolean deleteBus(int id);
}