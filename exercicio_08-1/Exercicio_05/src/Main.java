public class Main {
    public static void main(String[] args) {
        // Criando um array de IMeioTransporte
        IMeioTransporte[] transportes = {
                new Carro(),
                new Bicicleta(),
                new Trem()
        };

        // Percorrendo o array e chamando acelerar() e frear() para cada objeto
        for (IMeioTransporte transporte : transportes) {
            transporte.acelerar();
            transporte.frear();
            System.out.println();
        }
    }
}
