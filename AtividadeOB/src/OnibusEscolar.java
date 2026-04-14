public class OnibusEscolar {

    private int quantidadeEstudantes;
    private int quantidadeProfessores;

   
    public OnibusEscolar(int quantidadeEstudantes, int quantidadeProfessores) {
        setQuantidadeProfessores(quantidadeProfessores);
        setQuantidadeEstudantes(quantidadeEstudantes);
    }

    
    public int getQuantidadeEstudantes() {
        return quantidadeEstudantes;
    }

    
    public void setQuantidadeEstudantes(int quantidadeEstudantes) {

       
        if (this.quantidadeProfessores == 0) {
            this.quantidadeEstudantes = 0;
            return;
        }

      
        if (quantidadeEstudantes > 40) {
            System.out.println("Máximo de alunos excedido. Ajustado para 40.");
            this.quantidadeEstudantes = 40;
        } else {
            this.quantidadeEstudantes = quantidadeEstudantes;
        }
    }

    
    public int getQuantidadeProfessores() {
        return quantidadeProfessores;
    }

    // Setter professores
    public void setQuantidadeProfessores(int quantidadeProfessores) {
        this.quantidadeProfessores = quantidadeProfessores;

        // Se não houver professores, zera alunos automaticamente
        if (quantidadeProfessores == 0) {
            this.quantidadeEstudantes = 0;
        }
    }
}