class GravityCalculator {
    public static void main(String[] arguments) {
        double gravity = -9.81; // 地球重力加速度，单位为m/s²
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = initialPosition+fallingTime*initialVelocity+0.5*gravity*fallingTime*fallingTime;
        System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");
    }
}