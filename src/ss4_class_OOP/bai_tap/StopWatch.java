package ss4_class_OOP.bai_tap;
import java.time.Instant;
public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch(){
        startTime = System.currentTimeMillis();
    }
    public long getStartTime(){
        return startTime;
    }
    public long getEndTime(){
        return endTime;
    }
    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        if (endTime == 0) {
            return 0; // Chưa gọi phương thức stop(), nên trả về 0
        }
        return endTime - startTime;
    }

    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        // Hoạt động bắt đầu

        // Dừng đồng hồ bấm giờ
        stopwatch.stop();
        System.out.println("Thời gian đã trôi qua: " + stopwatch.getElapsedTime() + "ms");
    }
}
