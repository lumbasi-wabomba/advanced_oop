public class Main {
    static void main() {
        Sedan mySedan = new Sedan("KDF 141W", "Grey", 2020, 0, "Toyota", "Prado");

        mySedan.startEngine();
        mySedan.gas();
        mySedan.accelerate();
        mySedan.accelerate(40);
        mySedan.stop();
        mySedan.stopEngine();

    }
}
