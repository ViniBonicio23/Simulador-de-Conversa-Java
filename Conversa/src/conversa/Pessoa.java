package conversa;

public class Pessoa {

    public String nome;
    public int idade;
    public String nomedaMae;
    public String sentimento;
    
     public void sentimentoMetodo(String sentimento)
   {
       System.out.println(this.nome + ": Está sentindo " + sentimento); 
   
   }
    
   public void perguntaIdade(String p_nome)
   {
       System.out.println(this.nome + ": " +p_nome + " qual a sua idade?"); 
   
   }
    public void respondeIdade(int p_idade)
   {
       System.out.println(this.nome + ": Eu tenho " + p_idade + " anos"); 
   
   }
    
    public void perguntaNomeMae(String p_Nome)
   {
       System.out.println(this.nome + ": " + p_Nome + " qual o nome da sua mãe?"); 
   
   }
    public void respondeNomeMae(String p_NomeMae)
   {
       System.out.println(this.nome + ": a minha mãe se chama " + p_NomeMae ); 
   
   }
   
    public String getSentimento() {
        return sentimento;
    }

    /**
     * @param sentimento the sentimento to set
     */
    public void setSentimento(String sentimento) {
        this.sentimento = sentimento;
    }

    
   public void saudacao(String p_nome)
   {
       System.out.println(this.nome + ": Olá " + p_nome); 
   
   }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

   
    /**
     * @return the nomedaMae
     */
    public String getNomedaMae() {
        return nomedaMae;
    }

    /**
     * @param nomedaMae the nomedaMae to set
     */
    public void setNomedaMae(String nomedaMae) {
        this.nomedaMae = nomedaMae;
    }

    
    
}
