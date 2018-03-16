package profcursotrezemain;

/**
 *
 * @author 122138610
 */
public class ProfCursoTrezeMain {
    public static void main(String[] args) {
        Curso cursoUm = new Curso(1, "Ciência da Computação");
        Curso cursoDois = new Curso(2, "Engenharia de Alimentos");
        Curso cursoTres = new Curso(3, "Medicina");
        
        Professor professorUm = new Professor("Tales" , 25);
        Professor professorDois = new Professor("Elgio", 52);
        Professor professorTres = new Professor();
        
        cursoUm.setNomeProfessor(professorUm);
        cursoDois.setNomeProfessor(professorDois);
        
        cursoUm.exibeDados();
        System.out.print("Nome do professor: " + professorUm.getNome() + "\n\n");
        
        cursoDois.exibeDados();
        System.out.print("Nome do professor: " + professorDois.getNome() + "\n\n");
        
        
        cursoTres.exibeDados();
        System.out.print("Nome do professor: " + professorTres.getNome() + "\n");
    }
    
}
