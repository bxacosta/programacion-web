package servlets;

import forms.CategoriaBean;
import forms.ProductosBean;
import modelo.GestionProductos;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class Listar implements ServletRequestAware, ServletContextAware {

    String categoriaId;
    List<CategoriaBean> categorias;
    List<ProductosBean> productos;

    ServletContext context;

    public String execute() throws Exception {
        String driver = context.getInitParameter("driver");
        String cadena = context.getInitParameter("cadena");

        GestionProductos gp = new GestionProductos(driver, cadena);
        categorias = gp.consultaCategorias();

        if (categoriaId != null && !categoriaId.isEmpty() && categoriaId != "-1") {
            productos = gp.consultaProducto(Integer.parseInt(categoriaId));
        }

        return "categoria";
    }

    @Override
    public void setServletRequest(HttpServletRequest request) {
        categoriaId = request.getParameter("categoriaId");
    }

    @Override
    public void setServletContext(ServletContext context) {
        this.context = context;
    }

    public String getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(String categoriaId) {
        this.categoriaId = categoriaId;
    }

    public List<CategoriaBean> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<CategoriaBean> categorias) {
        this.categorias = categorias;
    }

    public List<ProductosBean> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductosBean> productos) {
        this.productos = productos;
    }
}
