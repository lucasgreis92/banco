/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.dao.v1.custom;

import br.com.lgrapp.banco.base.crud.interfaces.ICrud;
import br.com.lgrapp.banco.model.Conta;
import java.util.List;

/**
 *
 * @author adm
 */
public interface IContaDAOV1 extends ICrud<Conta> {

    List<Conta> findByDsPessoa(String dsPessoa);
}
