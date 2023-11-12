public class Car_Chapter14 {
    private int gear = 1;
    private int speed = 10;

    public void gearChange(int afterGear) {
        this.speed = switch (afterGear) {
            case 1 -> 10;
            case 2 -> 20;
            case 3 -> 30;
            case 4 -> 40;
            case 5 -> 50;
            default -> 10;
        };
        this.gear = afterGear;
    }

    public void run() {
        System.out.println("ギア1から" + gear + "に切り替えました");
        System.out.println("速度は" + speed + "kmです");
    }
}
