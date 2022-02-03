package aplicativos;


public class Piloto extends Pessoa {
    
    private String breve;
    private String matricula;
    public Aeronave avião;
    

    //construtor vazio
    

    public Piloto() {
    }

    public Piloto getPilotoA(){
        return this;

    }

    //construtores
    public Piloto(String breve, String matricula) {
        this.breve = breve;
     
        this.matricula = matricula;
    }

    // Getters and setters 
    public String getBreve() {
    
        return breve;
    }
    public void setBreve(String breve) {
    
        this.breve = breve;
    }
    public String getMatricula() {
    
        return matricula;
    }
    public void setMatricula(String matricula) {
    
        this.matricula = matricula;
    }


    
}