/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.mappers.v1;

import br.com.lgrapp.banco.dto.v1.ContaDTOV1;
import br.com.lgrapp.banco.mappers.AbstractMapper;
import br.com.lgrapp.banco.model.Conta;
import javax.ejb.Stateless;
import javax.inject.Named;

/**
 *
 * @author adm
 */
@Stateless
@Named("ContaMapperV1")
public class ContaMapperV1 extends AbstractMapper<Conta, ContaDTOV1> {

    @Override
    public ContaDTOV1 convertToDto(Conta model) {
        ContaDTOV1 dto = new ContaDTOV1();
        dto.setNrConta(model.getIdConta() + "-" + model.getIdAgencia().getIdAgencia());
        dto.setDsAgencia(model.getIdAgencia().getDsAgencia());
        dto.setVrSaldo(model.getVrSaldo());
        if (model.getIdPessoaFisica() != null) {
            dto.setDsCpfCnpj(model.getIdPessoaFisica().getDsCpf());
            dto.setDsPessoa(model.getIdPessoaFisica().getDsCpf());
        } else if (model.getIdPessoaJuridica() != null) {
            dto.setDsCpfCnpj(model.getIdPessoaJuridica().getDsCnpj());
            dto.setDsPessoa(model.getIdPessoaJuridica().getDsRazaoSocial());
        }
        return dto;
    }

    @Override
    public Conta convertToModel(Conta model, ContaDTOV1 dto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
