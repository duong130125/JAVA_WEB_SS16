package ra.session_16.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ra.session_16.service.TypeBus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bus {
    private int id;
    private String licensePlate;
    private TypeBus busType;
    private int rowSeat;
    private int colSeat;
    private int totalSeat;
    private String image;
}
