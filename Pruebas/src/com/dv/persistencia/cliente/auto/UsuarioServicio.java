
package com.dv.persistencia.cliente.auto;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UsuarioServicio", targetNamespace = "http://usuarios.servicios.persistencia.dv.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UsuarioServicio {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns com.dv.persistencia.cliente.auto.Usuario
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerUsuario", targetNamespace = "http://usuarios.servicios.persistencia.dv.com/", className = "com.dv.persistencia.cliente.auto.ObtenerUsuario")
    @ResponseWrapper(localName = "obtenerUsuarioResponse", targetNamespace = "http://usuarios.servicios.persistencia.dv.com/", className = "com.dv.persistencia.cliente.auto.ObtenerUsuarioResponse")
    @Action(input = "http://usuarios.servicios.persistencia.dv.com/UsuarioServicio/obtenerUsuarioRequest", output = "http://usuarios.servicios.persistencia.dv.com/UsuarioServicio/obtenerUsuarioResponse")
    public Usuario obtenerUsuario(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @return
     *     returns java.util.List<com.dv.persistencia.cliente.auto.Usuario>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerListaUsuarios", targetNamespace = "http://usuarios.servicios.persistencia.dv.com/", className = "com.dv.persistencia.cliente.auto.ObtenerListaUsuarios")
    @ResponseWrapper(localName = "obtenerListaUsuariosResponse", targetNamespace = "http://usuarios.servicios.persistencia.dv.com/", className = "com.dv.persistencia.cliente.auto.ObtenerListaUsuariosResponse")
    @Action(input = "http://usuarios.servicios.persistencia.dv.com/UsuarioServicio/obtenerListaUsuariosRequest", output = "http://usuarios.servicios.persistencia.dv.com/UsuarioServicio/obtenerListaUsuariosResponse")
    public List<Usuario> obtenerListaUsuarios();

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarUsuario", targetNamespace = "http://usuarios.servicios.persistencia.dv.com/", className = "com.dv.persistencia.cliente.auto.EliminarUsuario")
    @ResponseWrapper(localName = "eliminarUsuarioResponse", targetNamespace = "http://usuarios.servicios.persistencia.dv.com/", className = "com.dv.persistencia.cliente.auto.EliminarUsuarioResponse")
    @Action(input = "http://usuarios.servicios.persistencia.dv.com/UsuarioServicio/eliminarUsuarioRequest", output = "http://usuarios.servicios.persistencia.dv.com/UsuarioServicio/eliminarUsuarioResponse")
    public boolean eliminarUsuario(
        @WebParam(name = "arg0", targetNamespace = "")
        Usuario arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.dv.persistencia.cliente.auto.Usuario
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modificarUsuario", targetNamespace = "http://usuarios.servicios.persistencia.dv.com/", className = "com.dv.persistencia.cliente.auto.ModificarUsuario")
    @ResponseWrapper(localName = "modificarUsuarioResponse", targetNamespace = "http://usuarios.servicios.persistencia.dv.com/", className = "com.dv.persistencia.cliente.auto.ModificarUsuarioResponse")
    @Action(input = "http://usuarios.servicios.persistencia.dv.com/UsuarioServicio/modificarUsuarioRequest", output = "http://usuarios.servicios.persistencia.dv.com/UsuarioServicio/modificarUsuarioResponse")
    public Usuario modificarUsuario(
        @WebParam(name = "arg0", targetNamespace = "")
        Usuario arg0);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns com.dv.persistencia.cliente.auto.Usuario
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "crearUsuario", targetNamespace = "http://usuarios.servicios.persistencia.dv.com/", className = "com.dv.persistencia.cliente.auto.CrearUsuario")
    @ResponseWrapper(localName = "crearUsuarioResponse", targetNamespace = "http://usuarios.servicios.persistencia.dv.com/", className = "com.dv.persistencia.cliente.auto.CrearUsuarioResponse")
    @Action(input = "http://usuarios.servicios.persistencia.dv.com/UsuarioServicio/crearUsuarioRequest", output = "http://usuarios.servicios.persistencia.dv.com/UsuarioServicio/crearUsuarioResponse")
    public Usuario crearUsuario(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

}
