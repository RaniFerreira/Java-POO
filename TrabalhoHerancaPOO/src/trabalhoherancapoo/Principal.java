package trabalhoherancapoo;

/**
 *
 * @author ranielly
 */
public class Principal {
    public static void main (String[] args){
        
        //teste com a variaveis certas
        
        UsuarioSistema usuario1 = new UsuarioSistema("Ranielly", "rani24", 444, "rani@gmail.com");
        Coordenador cooordenador1 = new Coordenador("administracao", 24, "João Neto", "neto34", 555, "neto@gmail.com");
        Professor professor1 = new Professor(2, "informatica", "Diego Pleno", "diego78", 15, "diego@gmail.com");
        Aluno aluno1 = new Aluno(7878, "informatica", "Renato Berlim", "berlikm08", 89, "berlim@gmail.com");
        
        // mostrando com as informacoes certas
        
        System.out.println("Usuario: \n" + usuario1.mostrarInformacoes());
        System.out.println("\nCoordenador\n" + cooordenador1.mostrarInformacoes());
        System.out.println("\nProfessor\n" + professor1.mostrarInformacoes());
        System.out.println("\nAluno\n" + aluno1.mostrarInformacoes());
        
        
        // teste com variaveis que precisam ser corrigidas
        
        UsuarioSistema usuario2 = new UsuarioSistema("Thales", "thales02", 0, "t@gmail.com");
        Coordenador cooordenador2 = new Coordenador("Eletrica", 24, "Cristian", "cris34", 0, "cris@gmail.com");
        Professor professor2 = new Professor(2, " ", "João Bosco", "jb77", 15, "j@gmail.com");
        Aluno aluno2 = new Aluno(7878,"Eletrica" ,"Joaquim", "jjj08", 89, "jjj@gmail.com");
        
        // mostrando informacoes com default(correção)
        
        System.out.println("\nUsuario: \n" + usuario2.mostrarInformacoes());
        System.out.println("\nCoordenador\n" + cooordenador2.mostrarInformacoes());
        System.out.println("\nProfessor\n" + professor2.mostrarInformacoes());
        System.out.println("\nAluno\n" + aluno2.mostrarInformacoes());
    }
}
