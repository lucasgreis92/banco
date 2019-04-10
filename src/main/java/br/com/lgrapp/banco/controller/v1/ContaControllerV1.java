/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.controller.v1;

import br.com.lgrapp.banco.dto.v1.ContaDTOV1;
import br.com.lgrapp.banco.facade.v1.custom.IContaFacadeV1;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.jboss.security.annotation.SecurityDomain;

/**
 *
 * @author adm
 */
@SecurityDomain("keycloak")
@Path("v1/conta")
public class ContaControllerV1 {

    @Inject
    @Named("ContaFacadeV1")
    IContaFacadeV1 contaFacadeV1;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ContaDTOV1> findAll() {
        return contaFacadeV1.findAll();
    }

}
