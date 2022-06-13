package DTO;

public class UsuarioDTO {
    private int id_usuario;
    private String nome_usuario;
    private char[] senha_usuario;

    public UsuarioDTO(String nome_usuario, char[] senhaUsuario) {
        this.nome_usuario = nome_usuario;
        this.senha_usuario = senhaUsuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }
    public void setId_Usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    public String getNome_usuario() {
        return nome_usuario;
    }
    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }
    public String getSenha_usuario() {
        return senha_usuario.toString();
    }
    public void setSenha_usuario(char[] senha_usuario) {
        this.senha_usuario = senha_usuario;
    }
}
