/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.dao.v1.impl;

import br.com.lgrapp.banco.dao.AbstractDAO;
import br.com.lgrapp.banco.dao.v1.custom.IContaDAOV1;
import br.com.lgrapp.banco.model.Conta;
import javax.ejb.Stateless;
import javax.inject.Named;

/**
 *
 * @author adm
 */
@Stateless
@Named("ContaDAOV1")
public class ContaDAOV1 extends AbstractDAO<Conta> implements IContaDAOV1{
    
    public ContaDAOV1() {
        super(Conta.class);
    }
    
    
}
