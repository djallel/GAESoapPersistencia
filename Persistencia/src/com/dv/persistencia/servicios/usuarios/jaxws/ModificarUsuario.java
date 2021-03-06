
package com.dv.persistencia.servicios.usuarios.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "modificarUsuario", namespace = "http://usuarios.servicios.persistencia.dv.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modificarUsuario", namespace = "http://usuarios.servicios.persistencia.dv.com/")
public class ModificarUsuario {

    @XmlElement(name = "arg0", namespace = "")
    private com.dv.persistencia.entidades.Usuario arg0;

    /**
     * 
     * @return
     *     returns Usuario
     */
    public com.dv.persistencia.entidades.Usuario getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(com.dv.persistencia.entidades.Usuario arg0) {
        this.arg0 = arg0;
    }

}
