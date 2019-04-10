/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.facade.v1.impl;

import br.com.lgrapp.banco.base.crud.interfaces.ICrud;
import br.com.lgrapp.banco.dto.v1.ContaDTOV1;
import br.com.lgrapp.banco.facade.AbstractFacade;
import br.com.lgrapp.banco.facade.v1.custom.IContaFacadeV1;
import br.com.lgrapp.banco.mappers.AbstractMapper;
import br.com.lgrapp.banco.mappers.v1.ContaMapperV1;
import br.com.lgrapp.banco.model.Conta;
import br.com.lgrapp.banco.service.v1.custom.IContaServiceV1;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author adm
 */
@Stateless
@Named("ContaFacadeV1")
public class ContaFacadeV1 extends AbstractFacade<Conta, ContaDTOV1> implements IContaFacadeV1 {

    @Inject
    @Named("ContaServiceV1")
    IContaServiceV1 contaServiceV1;

    @Inject
    @Named("ContaMapperV1")
    ContaMapperV1 contaMapperV1;

    @Override
    public IContaServiceV1 getCrud() {
        return contaServiceV1;
    }

    @Override
    public AbstractMapper<Conta, ContaDTOV1> getMapper() {
        return contaMapperV1;
    }

}
