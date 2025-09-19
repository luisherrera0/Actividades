package gestor.models;

public class Administrador {
    private String username;
    private String password;

    public Administrador(String username, String password) {
        if (username == null || password == null)
            throw new IllegalArgumentException("Usuario y contraseña no pueden ser nulos");
        this.username = username;
        this.password = password;
    }

    public String getUsername() { return username; }
    public Administrador setUsername(String username) { this.username = username; return this; }
    public String getPassword() { return password; }
    public Administrador setPassword(String password) { this.password = password; return this; }

    @Override
    public String toString() {
        return "Administrador [Usuario=" + username + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Administrador)) return false;
        Administrador other = (Administrador) obj;
        return this.username.equals(other.username);
    }
}
