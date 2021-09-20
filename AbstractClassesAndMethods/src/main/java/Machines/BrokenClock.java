package Machines;

import java.time.LocalDateTime;

public class BrokenClock implements Clock{
    @Override
    public long secondsElapsedSience(LocalDateTime dateTime) {
        return 300;
    }
}
