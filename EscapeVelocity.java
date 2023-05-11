//Aaron Prince Anu

class EscapeVelocity {
    public static void main(String[] args) {
        // Define constants
        final double GRAV = 6.6726e-11; // Gravitational constant
        final double ACCELERATION;
        final double CIRCUMFERENCE;
        final double PRECISION = 0.1;

        // Prompt user for input
        System.out.print("\nEnter the circumference of the planet in kilometers: ");
        CIRCUMFERENCE = In.getDouble();
        System.out.print("Enter the acceleration due to gravity at the surface in m/s^2: ");
        ACCELERATION = In.getDouble();

        // Calculate planet's radius and mass
        double radius = (CIRCUMFERENCE / (2 * Math.PI)) * 1000;
        double mass = ACCELERATION * Math.pow(radius, 2) / GRAV;

        // Calculate escape velocity
        double escapeVelocity = Math.sqrt(2 * GRAV * mass / radius) / 1000;

        //round
        double roundedMass = ((mass/Math.pow(10,24)*1000)/PRECISION)*PRECISION;
        double roundedRadius = Math.round(radius*PRECISION)*PRECISION;
        double roundedEscapeVelocity = Math.round(escapeVelocity/PRECISION)*PRECISION;

        // Print results
        System.out.println("The planet radius is: " + roundedRadius + "km");
        System.out.println("The planet mass is " + roundedMass + " 10^21 kg");
        System.out.println("The escape velocity is " + roundedEscapeVelocity + " km/s");
    }
}
