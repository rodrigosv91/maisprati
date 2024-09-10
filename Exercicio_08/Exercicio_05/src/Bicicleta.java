public class Bicicleta implements IMeioTransporte {

    @Override
    public void acelerar() {
        System.out.println("A bicicleta está pedalando mais rápido.");
    }

    @Override
    public void frear() {
        System.out.println("A bicicleta está freando.");
    }
}
