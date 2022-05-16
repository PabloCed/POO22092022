package pruebaejemplo;

public class PruebaEjemplo {

    public static void main(String[] args) {
        System.out.println("   ");
        System.out.println("     Tipos de cliente     ");
        System.out.println("   ");

        Cuentahabitante[] lista = new Cuentahabitante[5];

        lista[0] = new Cuentahabitante("123123", "Ricardo", 50001);
        lista[1] = new Cuentahabitante("345345", "Pablo", 49999);
        lista[2] = new Cuentahabitante("456456", "Enrique", 300);
        lista[3] = new Cuentahabitante("567567", "Lilia", 5000);
        lista[4] = new Cuentahabitante("678678", "Andrea", 89000);

        for (Cuentahabitante cuentahabitante : lista) {
            System.out.println(cuentahabitante.evaluarNivelCliente());
            System.out.println("nombre del cliente " + cuentahabitante.getNombre());
            System.out.println(cuentahabitante.getIdCliente());
            System.out.println(cuentahabitante.getBalance());
            System.out.println(" ");

        }
    }
}
