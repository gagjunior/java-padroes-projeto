package br.com.wareysis.factorymethod.domain;

/**
 * Classe IPhoneX
 *
 * @author gilberto.junior
 * @version 1.0
 */
public class IPhoneX extends IPhone {

    @Override
    public void getHardware() {
        System.out.println("Hardware list");
        System.out.println("\t- 5.8in Screen");
        System.out.println("\t- A11 Chipset");
        System.out.println("\t- 3Gb RAM");
        System.out.println("\t- 256Gb Memory");
    }
}
