/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.dto.v1;

import br.com.lgrapp.banco.dto.AbstractDTO;
import java.math.BigDecimal;

/**
 *
 * @author adm
 */
public class ContaDTOV1 extends AbstractDTO{

    private String nrConta;
    private String dsAgencia;
    private String dsPessoa;
    private String dsCpfCnpj;
    private BigDecimal vrSaldo;

    public String getNrConta() {
        return nrConta;
    }

    public void setNrConta(String nrConta) {
        this.nrConta = nrConta;
    }

    public String getDsAgencia() {
        return dsAgencia;
    }

    public void setDsAgencia(String dsAgencia) {
        this.dsAgencia = dsAgencia;
    }

    public String getDsPessoa() {
        return dsPessoa;
    }

    public void setDsPessoa(String dsPessoa) {
        this.dsPessoa = dsPessoa;
    }

    public String getDsCpfCnpj() {
        return dsCpfCnpj;
    }

    public void setDsCpfCnpj(String dsCpfCnpj) {
        this.dsCpfCnpj = dsCpfCnpj;
    }

    public BigDecimal getVrSaldo() {
        return vrSaldo;
    }

    public void setVrSaldo(BigDecimal vrSaldo) {
        this.vrSaldo = vrSaldo;
    }

}
