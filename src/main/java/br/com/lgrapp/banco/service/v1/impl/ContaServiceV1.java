/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.service.v1.impl;


import br.com.lgrapp.banco.dao.v1.custom.IContaDAOV1;
import br.com.lgrapp.banco.model.Conta;
import br.com.lgrapp.banco.service.AbstractService;
import br.com.lgrapp.banco.service.v1.custom.IContaServiceV1;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author adm
 */
@Stateless
@Named("ContaServiceV1")
public class ContaServiceV1 extends AbstractService<Conta> implements IContaServiceV1 {

    @Inject
    @Named("ContaDAOV1")
    IContaDAOV1 contaDAOV1;

    @Override
    public IContaDAOV1 getCrud() {
        return contaDAOV1;
    }
}
