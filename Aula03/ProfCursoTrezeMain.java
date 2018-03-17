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
    
        cursoUm.setNomeProfessor(professorUm);
        cursoDois.setNomeProfessor(professorDois);
        
        cursoUm.exibeDados();
        cursoDois.exibeDados();
        cursoTres.exibeDados();
   
  
    }
    
}
