package animalmain;

public class AnimalMain {
   public static void main(String[] args) {
      Peixe animal1 = new Mamifero("roedor", 3.5,4, "marrom claro", "terra", 110);
      Peixe animal2 = new Peixe("peixe-espada", 5.9, 0, "cinza", "mar", 150);
      Mamifero animal3 = new Mamifero("marsupial", 3.9, 4, "laranja-escuro", "terra", 15.0);
      Peixe animal4 = new Peixe("peixe-martelo", 1.9, 0, "cinza", "mar", 290);

      animal1.listaDados();
      animal2.listaDados();
      animal3.listaDados();
      animal4.listaDados();
   }
