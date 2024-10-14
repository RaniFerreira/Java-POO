package pootrabalhoexec2;

/**
 *
 * @author ranie
 */
public class Principal {
    public static void main(String[] args){
        
        Consulta consulta1 = new Consulta();
        
        consulta1.setNomePaciente("Rodrigo");
        consulta1.setDataNascimento("30/10/1990");
        consulta1.setConvenio(false);
        consulta1.setProfissão("Motorista");
        
        System.out.println("\nNome do Paciente: " + consulta1.getNomePaciente());
        System.out.println("Data de Nascimento " +  consulta1.getDataNascimento());
        System.out.println("Convênio: " + consulta1.getConvenio());
        System.out.println("Profissão: " + consulta1.getProfissão());
        
        
        Consulta consulta2= new Consulta();
        
        consulta2.setNomePaciente("");
        consulta2.setDataNascimento("");
        consulta2.setConvenio(true);
        consulta2.setProfissão("Programador");
        
        System.out.println("\nNome do Paciente: " + consulta2.getNomePaciente());
        System.out.println("Data de Nascimento " +  consulta2.getDataNascimento());
        System.out.println("Convênio: " + consulta2.getConvenio());
        System.out.println("Profissão: " + consulta2.getProfissão());
        
        
        Consulta consulta3 = new Consulta("Ricardo", "15/02/1998");
        
        consulta3.setConvenio(true);
        consulta3.setProfissão("Bancário");
        
        System.out.println("\nNome do Paciente: " + consulta3.getNomePaciente());
        System.out.println("Data de Nascimento " +  consulta3.getDataNascimento());
        System.out.println("Convênio: " + consulta3.getConvenio());
        System.out.println("Profissão: " + consulta3.getProfissão());
        
        Consulta consulta4 = new Consulta("Lúcio", "02/01/2010");
        
        consulta4.setConvenio(true);
        consulta4.setProfissão("Policial");
        
        System.out.println("\nNome do Paciente: " + consulta4.getNomePaciente());
        System.out.println("Data de Nascimento " +  consulta4.getDataNascimento());
        System.out.println("Convênio: " + consulta4.getConvenio());
        System.out.println("Profissão: " + consulta4.getProfissão());
        
        
    }
    
}
