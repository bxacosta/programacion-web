package misclases;

public class ComprobarAction {

    private boolean existe;
    private String user;

    public String execute() throws Exception {
        return existe? "si" : "no";
    }

    public boolean isExiste() {
        return existe;
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
