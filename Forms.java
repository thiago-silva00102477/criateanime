package com.criateanime.forms;

import java.util.regex.Pattern;

public class Forms {

    private String nome;
    private String email;
    private String mensagem;

    public Forms() {
        // Construtor padrão
    }

    public Forms(String nome, String email, String mensagem) {
        this.nome = nome;
        this.email = email;
        this.mensagem = mensagem;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome != null ? nome.trim() : null;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email != null ? email.trim() : null;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem != null ? mensagem.trim() : null;
    }

    // Validação básica do formulário
    public boolean isValido() {
        return isNomeValido() && isEmailValido() && isMensagemValida();
    }

    private boolean isNomeValido() {
        return nome != null && nome.length() >= 3;
    }

    private boolean isEmailValido() {
        if (email == null) return false;
        String regexEmail = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return Pattern.matches(regexEmail, email);
    }

    private boolean isMensagemValida() {
        return mensagem != null && mensagem.length() >= 10;
    }

    // Método para exibir os dados (pode ser substituído por toString)
    public String exibirDados() {
        return "Nome: " + nome + "\n"
             + "Email: " + email + "\n"
             + "Mensagem: " + mensagem + "\n";
    }

    @Override
    public String toString() {
        return "Forms{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", mensagem='" + mensagem + '\'' +
                '}';
    }

}
