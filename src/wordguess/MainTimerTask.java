package wordguess;

import java.text.DecimalFormat;
import java.util.TimerTask;

/**
 *
 * @author rcbgalido
 */
public class MainTimerTask extends TimerTask {

    private static final double TEN_MILLISECONDS = 0.01;
    private double time;
    private boolean stopTime;

    public MainTimerTask() {
        time = 0;
        stopTime = false;
    }

    @Override
    public void run() {
        if (stopTime == false) {
            time = time + TEN_MILLISECONDS;
        } else {
            this.cancel();
        }
    }

    public void stopTime() {
        stopTime = true;
    }
    
    public double getTime() {
        return Double.valueOf(new DecimalFormat(".##").format(time));
    }

}
