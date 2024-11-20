package questão1poopolimorfismo;

/**
 *
 * @author ranielly
 */
public class Principal {

    public static void main(String[] args) {
        
        FilialPatosLojaVirtual  lojaVirtual1 = new FilialPatosLojaVirtual("jaqueta", 50, "https:/jaqueta.com", "jeraldinho");
        System.out.println(lojaVirtual1.toString());
        lojaVirtual1.emprestar();
        
        
        System.out.println("*****************************************************************************");
        
        FilialPatrocinioLojaFisica lojaFisica1 = new FilialPatrocinioLojaFisica("Elton", "rua são carlos, Nº 500", "calca", 0);
        System.out.println(lojaFisica1.toString());
        lojaFisica1.emprestar();
        lojaFisica1.devolver();
        lojaFisica1.emprestar();
        
        
        
        
    }
    
}
